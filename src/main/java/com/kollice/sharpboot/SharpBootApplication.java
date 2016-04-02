package com.kollice.sharpboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SharpBootApplication {
	@RequestMapping("/")
	String index() {
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(SharpBootApplication.class, args);
	}
}
