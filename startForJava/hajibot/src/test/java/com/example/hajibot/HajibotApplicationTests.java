package com.example.hajibot;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HajibotApplicationTests {

  @LocalServerPort
  int port;
  @Autowired
  TestRestTemplate restTemplate;

  @Test
  void contextLoads() {
    ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port, String.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody()).isEqualTo("Hello world!");
  }

}
