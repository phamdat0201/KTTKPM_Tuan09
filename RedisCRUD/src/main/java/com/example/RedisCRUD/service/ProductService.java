package com.example.RedisCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.example.RedisCRUD.entity.Product;

@Service
public class ProductService {
	 
	@Autowired
	    private RedisTemplate<Long,Product> template;
	    public Product findById(long id){
	        return template.opsForValue().get(id);
	    }

	    public Product save(Product product) {
	        template.opsForValue().set(product.getId(),product);
	        return product;
	    }
}
