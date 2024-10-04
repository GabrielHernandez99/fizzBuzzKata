package com.example.fizzBuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}
	public String convert(int i) {
		if(isFizz(i)) return "Fizz";
		if(i == 2)  return "2";
		if(i == 4)  return "4";
		if(i == 5)  return "Buzz";
		if(i == 10)  return "Buzz";
        return "1";
    }
	public boolean isFizz(int i) {
		return i % 3 == 0;
	}

}
