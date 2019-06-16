package com.lsh.vo;

import com.lsh.domain.Goods;
import lombok.Data;
import org.springframework.beans.factory.annotation.Lookup;

import java.util.Date;

@Data
public class GoodsVo extends Goods {
	private Double seckillPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;

}
