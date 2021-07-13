package com.everis.productservice.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.everis.productservice.redis.document.ProductType;
import com.everis.productservice.redis.service.ProductTypeService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/product-type")
public class ProductTypeController {
	
	@Autowired
	private ProductTypeService productTypeService;
	
	@PostMapping
    public Mono<Boolean> put(@RequestBody ProductType prod) {
        return productTypeService.put(prod.getId(), prod);
    }
	
	@GetMapping("/{key}")
    public Mono<Object> get(@PathVariable("key") String key) {
        return productTypeService.get(key);
    }
	
	@DeleteMapping("/{key}")
    public Mono<Boolean> delete(@PathVariable("key") String key) {
        return productTypeService.delete(key);
    }
	

}
