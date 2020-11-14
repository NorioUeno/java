package com.example.hajibot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibotApplication {

  @GetMapping("/")
  String home() {
    System.out.println("aaaa");
    return "Hello world!";
  }

	public static void main(String[] args) {
		SpringApplication.run(HajibotApplication.class, args);
	}

}