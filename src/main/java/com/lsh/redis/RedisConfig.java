package com.lsh.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisConfig
 * @Description: redis配置信息
 * @Author lsh
 * @Date 2019/6/8 23:08
 * @Version
 */
@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
    private String host;
    private int port;
    //秒
    private int timeout;
    private String password;
    //最大连接数
    private int poolMaxTotal;
    //最大空闲
    private int poolMaxIdle;
    //最大等待
    private int poolMaxWait;
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public int getTimeout() {
        return timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getPoolMaxTotal() {
        return poolMaxTotal;
    }
    public void setPoolMaxTotal(int poolMaxTotal) {
        this.poolMaxTotal = poolMaxTotal;
    }
    public int getPoolMaxIdle() {
        return poolMaxIdle;
    }
    public void setPoolMaxIdle(int poolMaxIdle) {
        this.poolMaxIdle = poolMaxIdle;
    }
    public int getPoolMaxWait() {
        return poolMaxWait;
    }
    public void setPoolMaxWait(int poolMaxWait) {
        this.poolMaxWait = poolMaxWait;
    }
}
