package com.lsh.redis;

public interface KeyPrefix {
	/**
	 * 有效期
	 * @return
	 */
	public int expireSeconds();

	/**
	 * 前缀
	 * @return
	 */
	public String getPrefix();
	
}
