package com.devglan.springbootkafkalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaLogApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringBootKafkaLogApplication.class, args);
		Timer timer = new Timer();
		timer.log();
	}
}
