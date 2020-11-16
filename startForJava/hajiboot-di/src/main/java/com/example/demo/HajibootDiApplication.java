package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.com.section2_2.ArgumentResolver;
import com.example.demo.layering.domain.Customer;
import com.example.demo.layering.service.CustomerService;
import com.example.demo.section2.Calculator;

@SpringBootApplication
//@Import(AppConfig.class) //Beanの定義 import
//@ComponentScan //classのパッケージ以下を走査して、特定のアノテーションが付いているjavaクラスを検出し、DIコンテナに登録する
public class HajibootDiApplication implements CommandLineRunner {

  @Autowired
  ArgumentResolver argumentResolver;
  @Autowired
  Calculator calculator;
  @Autowired
  CustomerService customerService;

  /**
   * This is test.
   *
   * @param args aaa
   */
  public static void main(String[] args) {
//    2.1.1
//    ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter 2 numbers like 'a b' : ");
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//
//    Calculator calculator = context.getBean(Calculator.class);
//    int result = calculator.calc(a, b);
//    System.out.println("result = " + result);
//    scanner.close();

//    2.1.2
//  ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
//    System.out.print("Enter 2 numbers like 'a b' : ");
//    ArgumentResolver argumentResolover = context.getBean(ArgumentResolver.class);
//    Argument argument = argumentResolover.resolve(System.in);
//    Calculator calculator = context.getBean(Calculator.class);
//    int result = calculator.calc(argument.getA(), argument.getB());
//    System.out.println("result = " + result);

//  2.1.3
//  ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
//    Frontend frontend = context.getBean(Frontend.class);
//    frontend.run();

//    2.1.5
    SpringApplication.run(HajibootDiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

//    2.1.5
//    System.out.println("Enter 2 numbers like 'a b' : ");
//    Argument argument = argumentResolver.resolve(System.in);
//    int result = calculator.calc(argument.getA(), argument.getB());
//    System.out.println("result = " + result);

//  2.1.6
//    データ追加
    customerService.save(new Customer(1,"Nobita","Nobe"));
    customerService.save(new Customer(2,"Takeshi","Goda"));
    customerService.save(new Customer(3,"Suneo","Honekawa"));

//    データ表示
    customerService.findAll().forEach(System.out::println); //Listを標準出力

  }

}
