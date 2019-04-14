package com.example.demo;


import com.example.demo.redis.Order;
import com.example.demo.redis.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/redis")
public class RdisTestController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private StringRedisTemplate redis; //jdbcTemplate

	private ThreadLocal<String> local = new ThreadLocal<>();
	@GetMapping(value="add")
	public Result add(){
		
		//opsForValue : Returns the operations performed on simple values (or Strings in Redis terminology).

		redis.opsForValue().set("name", "xdclass2018");
		
		return Result.success();
		
	}
	
	@GetMapping(value="get")
	public Result get(String key){
		Date date = new Date();
		log.info(date+"");
		String value = redis.opsForValue().get(key);
		if (value==null){

			return Result.success("空的");
		}
		return Result.success(value);

	}


	@Autowired
	OrderRepository orderRepository;

	int i =0 ;
	@GetMapping("test")
	public Result test(){
		try {
		/*	ValueOperations operations = redis.opsForValue();
			operations.set("wzy","wzy");
			redis.expire("wzy",10,TimeUnit.SECONDS);*/
		//	redis.opsForValue().setIfAbsent("wzy","wzy");
			//redis.opsForValue().set("wzy","wzy",10,TimeUnit.SECONDS);
			Date date = new Date();
			String uuid = UUID.randomUUID().toString();
			RedisPool redisPool = new RedisPool();
			JedisPool jedisPool = redisPool.getJedisPool();
			DistributedLock distributedLock = new DistributedLock(jedisPool,"test",10000);
			 distributedLock.acquire(10000);
			 log.info("i==="+i++);
			List<Order> byOrderState = orderRepository.findByGroupId("004b10a8-88b1-40f0-9e0e-4227473d52ef");
			Order order = byOrderState.get(0);
			order.setAddress("地址是"+"====i"+i);
			orderRepository.save(order);
			distributedLock.release();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Result.success();

	}
	/**
	 * 判断redis缓存中是否有对应的key
	 * @param key
	 * @return
	 */
	public boolean exists(final String key){
		boolean result = false;
		try {
			result = redis.hasKey(key);
		} catch (Exception e) {
			log.error("判断redis缓存中是否有对应的key失败！错误信息为：" + e.getMessage());
		}
		return result;
	}

	/**
	 * redis根据key删除对应的value
	 * @param key
	 * @return
	 */
	public Result remove(final String key){
		boolean result = false;
		try {
			if(exists(key)){
				redis.delete(key);
			}
			result = true;
		} catch (Exception e) {
			log.error("redis根据key删除对应的value失败！错误信息为：" + e.getMessage());
		}
		return Result.success(result);
	}
}
