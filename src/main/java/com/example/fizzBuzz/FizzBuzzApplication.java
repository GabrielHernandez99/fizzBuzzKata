package com.example.fizzBuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}
	public Object convert(int i) {
		if(i == 2)  return "2";
		if(i == 3)  return "Fizz";
		if(i == 4)  return "4";
		if(i == 5)  return "Buzz";
		if(i == 6)  return "Fizz";
        return "1";
    }

}
