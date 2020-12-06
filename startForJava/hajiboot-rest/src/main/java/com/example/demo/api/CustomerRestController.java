package com.example.demo.api;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

/**
 * @author aa572057
 *
 */
@RestController
@RequestMapping("api/customers")
public class CustomerRestController {

  @Autowired
  CustomerService customerService;

  /**
   * 顧客全件取得
   * @return
   */
  @GetMapping
  List<Customer> getCustomers() {
    List<Customer> customers = customerService.findAll();
    return customers;
  }

  /**
   * 顧客1件取得
   *
   * @param id
   * @return
   */
  @GetMapping(path = "{id}")
  Customer getCustomer(@PathVariable Integer id) {
    Customer customer = customerService.findOne(id);
    return customer;
  }

  /**
   * @param customer
   * @return
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  ResponseEntity<Customer> postCustomers(@RequestBody Customer customer, UriComponentsBuilder uriBuilder) {
    Customer created = customerService.create(customer);
    URI location = uriBuilder.path("api/customers/{id}").buildAndExpand(created.getId()).toUri();
    return ResponseEntity.created(location).body(created);
  }

  /**
   * @param id
   * @param customer
   * @return
   */
  @PutMapping(path = "{id}")
  Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
    customer.setId(id);
    return customerService.update(customer);
  }

  /**
   * @param id
   */
  @DeleteMapping(path = "{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  void deleteCustomer(@PathVariable Integer id) {
    customerService.delete(id);
  }

}
