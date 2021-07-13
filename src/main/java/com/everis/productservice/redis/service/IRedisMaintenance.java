package com.everis.productservice.redis.service;

import reactor.core.publisher.Mono;

public interface IRedisMaintenance<T> {

	public Mono<Boolean> put(String key,T object);
	
}
