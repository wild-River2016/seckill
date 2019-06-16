package com.lsh.redis;

/**
 * @ClassName GoodsKey
 * @Description: 商品key
 * @Author lsh
 * @Date 2019/6/16 11:49
 * @Version
 */
public class GoodsKey extends BasePrefix {
    public GoodsKey(String prefix) {
        super(prefix);
    }

    public GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static GoodsKey getGoodsList = new GoodsKey(60, "gl");

    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");

}
