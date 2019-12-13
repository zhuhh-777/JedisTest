package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.79.128",6379);

		String str = jedis.ping();
		
		System.out.println(str);
		
		jedis.close();
		
	}

}
