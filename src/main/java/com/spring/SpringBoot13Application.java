package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBoot开启定时任务
 * 
 * @author dell
 *
 */
@SpringBootApplication
@EnableScheduling
public class SpringBoot13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13Application.class, args);
	}
}
