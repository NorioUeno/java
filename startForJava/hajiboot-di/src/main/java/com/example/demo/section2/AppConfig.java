package com.example.demo.section2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  Calculator calculator() {
    return new AddCalculator();
  }

}
