package com.devglan.springbootkafkalog;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableScheduling
public class SpringBootKafkaLogApplication {

    private final Logger logger = Logger.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaLogApplication.class, args);
	}

    @Scheduled(fixedRate = 2000L)
    public void scheduleTask() {
        logger.warn("Inside scheduleTask - Sending logs to Kafka at " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
    }
}
