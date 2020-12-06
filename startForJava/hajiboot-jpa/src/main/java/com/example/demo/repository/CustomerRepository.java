package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

  /**
   * JPQLを用いたdbアクセス
   *
   * @List<Customer>
   */
  @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
  List<Customer> findAllOrderByName();
}
