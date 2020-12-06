package com.example.demo.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer implements Serializable {
  public Customer() {
    // TODO Auto-generated constructor stub
  }
  private Integer id;
  private String firstName;
  private String lastName;

}
