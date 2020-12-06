package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class HajibootJpaApplication implements CommandLineRunner {

  @Autowired
  NamedParameterJdbcTemplate jdbcTemplate;

  @Autowired
  CustomerRepository customerRepository;

  public static void main(String[] args) {
    SpringApplication.run(HajibootJpaApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

//	    データ追加
    Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
    System.out.println(created + "is created!");
    customerRepository.save(new Customer(null, "Aorio", "Ueno"));

//    ページング処理
    Pageable pageable = PageRequest.of(0, 3);
    Page<Customer> page = customerRepository.findAll(pageable);
    System.out.println("1ページのデータ数=" + page.getSize());
    System.out.println("現在のページ=" + page.getNumber());
    System.out.println("全ページ数=" + page.getTotalPages());
    System.out.println("全データ数=" + page.getTotalElements());
    page.getContent().forEach(System.out::println);

//  データ表示 + ORDER
//    customerRepository.findAllOrderByName().forEach(System.out::println);

  }

}
