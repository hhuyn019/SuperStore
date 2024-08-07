package com.cogent.main;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "localhost:8081/api/v1/product")
public interface ProductClient {
	@GetMapping("/products/{id}")
	public Product oneProduct(@PathVariable int id);
}
