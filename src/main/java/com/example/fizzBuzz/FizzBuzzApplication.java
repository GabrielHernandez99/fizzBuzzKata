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
		if(isBuzz(i)) return "Buzz";
        return String.valueOf(i);
    }
	private boolean isBuzz(int i) {
		return i % 5 == 0;
	}
	public boolean isFizz(int i) {
		return i % 3 == 0;
	}

}
