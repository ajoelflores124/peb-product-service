package com.everis.productservice.redis.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import lombok.Data;


@Data
public class ProductType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String desType;
	private String desLong;
	private long status;

}
