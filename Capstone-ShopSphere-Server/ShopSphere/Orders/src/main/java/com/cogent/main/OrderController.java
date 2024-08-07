package com.cogent.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
	private final OrderService orderService;

	@GetMapping("/{userId}")
	public List<OrderEntity> getOrders(@PathVariable int userId) {
		return orderService.getOrders(userId);
	}

	@PostMapping("/{userId}")
	public void placeOrder(@PathVariable int userId) {
		orderService.createOrder(userId);
	}

	@GetMapping("/detail/{orderId}")
	public OrderEntity getDetailedOrder(@PathVariable int orderId) throws Exception {
		return orderService.getDetailedOrder(orderId);
	}

}
