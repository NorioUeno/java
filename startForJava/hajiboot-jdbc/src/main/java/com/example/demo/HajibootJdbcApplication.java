package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class HajibootJdbcApplication implements CommandLineRunner {

  @Autowired
  NamedParameterJdbcTemplate jdbcTemplate;

  @Autowired
  CustomerRepository customerRepository;

  public static void main(String[] args) {
    SpringApplication.run(HajibootJdbcApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

//    parameter marker
//    String sql = "SELECT :a + :b";
//    SqlParameterSource param = new MapSqlParameterSource()
//        .addValue("a", 100)
//        .addValue("b", 200);
//    Integer result = jdbcTemplate.queryForObject(sql, param, Integer.class);

//    匿名クラス
//    String sql = "SELECT id, first_name, last_name FROM customers WHERE id = :id ";
//    SqlParameterSource param = new MapSqlParameterSource()
//        .addValue("id", 1);
//    Customer result = jdbcTemplate.queryForObject(sql, param, new RowMapper<Customer>() {
//      @Override
//      public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Customer(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"));
//      }
//    });

//    ラムダ式 (RowMapperの部分)
//    String sql = "SELECT id, first_name, last_name FROM CUSTOMERS WHERE id = :id ";
//    SqlParameterSource param = new MapSqlParameterSource().addValue("id", 1);
//    Customer result = jdbcTemplate.queryForObject(sql, param,
//        (rs, rowNum) -> new Customer(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"))
//      );
//    System.out.println("result = " + result);

//    データ追加
    Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
    System.out.println(created + "is created!");

//    データ表示
    customerRepository.findAll().forEach(System.out::println);

  }

}
