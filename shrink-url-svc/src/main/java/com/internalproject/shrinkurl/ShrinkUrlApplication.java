package com.internalproject.shrinkurl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShrinkUrlApplication {
  public static void main(String[] args) {
    System.out.println("ShrinkUrl Application Started");
    SpringApplication.run(ShrinkUrlApplication.class, args);
  }
}
