package com.example.demo;

import static org.assertj.core.api.Assertions.*;
import java.util.List;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = { "spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE" })
class HajibootRestApplicationTests {
  @Autowired
  CustomerRepository customerRepository;
  @Autowired
  TestRestTemplate restTemplate;
  Customer customer1;
  Customer customer2;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  static class Page<T> {
    private List<T> content;
    private int numberOfElements;
  }

  @Before
  public void setUp() {
    customerRepository.deleteAll();
    customer1 = new Customer();
    customer1.setFirstName("Taro");
    customer1.setLastName("Yamada");
    customer2 = new Customer();
    customer2.setFirstName("Ichiro");
    customer2.setLastName("Suzuki");

    customerRepository.save(customer1);
    customerRepository.save(customer2);

  }

  @Test
  void testGetCustomers() throws Exception{
    ResponseEntity<Page<Customer>> response = restTemplate.exchange("/api/custmomers", HttpMethod.GET, null,
        new ParameterizedTypeReference<Page<Customer>>() {});
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody().getNumberOfElements()).isEqualTo(2);

    Customer c1 = response.getBody().getContent().get(0);
    assertThat(c1.getId()).isEqualTo(customer2.getId());
    assertThat(c1.getFirstName()).isEqualTo(customer2.getFirstName());
    assertThat(c1.getLastName()).isEqualTo(customer2.getLastName());

  }

}
