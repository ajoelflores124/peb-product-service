package com.everis.productservice.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;
import com.everis.productservice.redis.document.ProductType;
import reactor.core.publisher.Mono;

@Service
public class ProductTypeService implements IRedisMaintenance<ProductType> {

	 @Autowired
	 private ReactiveRedisTemplate<String,Object> redisTemplate;
	 
	 @Override
	 public Mono<Boolean> put(String key, ProductType documentType) {
		 return redisTemplate.opsForValue().set(key, documentType);
	 }

	 public Mono<Object> get(String key) {
		 return redisTemplate.opsForValue().get(key);
	 }

	 public Mono<Boolean> delete(String key) {
		 return redisTemplate.opsForValue().delete(key);
	 }
	
}
