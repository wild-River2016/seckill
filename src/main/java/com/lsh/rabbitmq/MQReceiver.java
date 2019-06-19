package com.lsh.rabbitmq;

import com.lsh.domain.MiaoshaOrder;
import com.lsh.domain.MiaoshaUser;
import com.lsh.redis.RedisService;
import com.lsh.service.GoodsService;
import com.lsh.service.MiaoshaService;
import com.lsh.service.OrderService;
import com.lsh.vo.GoodsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName MQReceiver
 * @Description: MQ接收
 * @Author lsh
 * @Date 2019/6/18 21:21
 * @Version
 */
@Service
@Slf4j
public class MQReceiver {

    @Autowired
    GoodsService goodsService;
    @Autowired
    OrderService orderService;
    @Autowired
    MiaoshaService miaoshaService;

//    @RabbitListener(queues = "queue")
//    public void receive(String message) {
//        log.info("receive message:" + message);
//    }

    @RabbitListener(queues=MQConfig.MIAOSHA_QUEUE)
    public void receive(String message) {
        log.info("receive message:"+message);
        MiaoshaMessage mm  = RedisService.stringToBean(message, MiaoshaMessage.class);
        MiaoshaUser user = mm.getUser();
        long goodsId = mm.getGoodsId();

        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        int stock = goods.getStockCount();
        if(stock <= 0) {
            return;
        }
        //判断是否已经秒杀到了
        MiaoshaOrder order = orderService.getMiaoshaOrderByUserIdGoodsId(user.getId(), goodsId);
        if(order != null) {
            return;
        }
        //减库存 下订单 写入秒杀订单
        miaoshaService.miaosha(user, goods);
    }


}
