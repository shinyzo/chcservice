package com.lming.chcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;

@SpringBootApplication
@Cacheable
public class ChcserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChcserviceApplication.class, args);
	}
}
