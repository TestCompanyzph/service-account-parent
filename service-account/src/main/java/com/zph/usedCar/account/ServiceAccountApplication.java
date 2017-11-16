package com.zph.usedCar.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.zph.usedCar")
@ComponentScan({"com.zph.usedCar"})
@MapperScan("com.zph.usedCar.account.dao")
public class ServiceAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAccountApplication.class, args);
	}
}
