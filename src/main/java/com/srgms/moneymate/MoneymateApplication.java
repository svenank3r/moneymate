package com.srgms.moneymate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.srgms.moneymate")
public class MoneymateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneymateApplication.class, args);
	}
}
