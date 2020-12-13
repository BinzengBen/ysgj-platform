package com.ysgj.food.platform;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan({"com.ysgj.food.platform.dao"})
@EnableDiscoveryClient
public class YsgjPaltformApplication {

	public static void main(String[] args) {
		SpringApplication.run(YsgjPaltformApplication.class, args);
	}

}
