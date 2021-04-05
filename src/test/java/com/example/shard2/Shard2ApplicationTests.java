package com.example.shard2;

import com.example.shard2.entity.Order;
import com.example.shard2.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
class Shard2ApplicationTests {
	@Resource
	private OrderService orderService;
	@Test
	void contextLoads() {
		Order order = new Order();
		order.setUserId(1);
		order.setOrderId(2);
		order.setAmount(123456l);
		order.setChannel("zfb");
		order.setStatus("ok");
		order.setCurrency("cny");
		order.setCreateTime(LocalDateTime.now());
		orderService.insert(order);
	}

	@Test
	void load() {
		System.out.println(orderService.load(2).toString());
	}
}
