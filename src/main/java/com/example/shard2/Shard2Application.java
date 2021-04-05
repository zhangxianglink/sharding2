package com.example.shard2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class Shard2Application {

	public static void main(String[] args) {
		SpringApplication.run(Shard2Application.class, args);
	}

}
