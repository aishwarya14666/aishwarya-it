package com.example.controller;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.User;

@RestController
public class CourseRestController {

	private HashOperations<String, Integer, User> hashOps;
	
	public CourseRestController(RedisTemplate<String ,User> redisTemplate) {
		hashOps=redisTemplate.opsForHash();
	}
	
	@PostMapping("/store")
	public String storeData(@RequestBody User user) {
		hashOps.put("PERSONS",user.getUid(),user);
		return "success";
	}
	
	@GetMapping("/data/{uid}")
	public User getData(@PathVariable Integer uid) {
		User value=(User) hashOps.get("Persons",uid);
		return value;
	}
}
