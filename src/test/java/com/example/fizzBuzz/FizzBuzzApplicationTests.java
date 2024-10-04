package com.example.fizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzApplicationTests {

	@Test
	void convert_1_to_1() {
		assertEquals("1", new FizzBuzzApplication().convert(1));
	}
	@Test
	void convert_2_to_2() {
		assertEquals("2", new FizzBuzzApplication().convert(2));
	}
	@Test
	void convert_3_to_fizz() {
		assertEquals("Fizz", new FizzBuzzApplication().convert(3));
	}
	@Test
	void convert_4_to_4() {
		assertEquals("4", new FizzBuzzApplication().convert(4));
	}
	@Test
	void convert_5_to_buzz() {
		assertEquals("Buzz", new FizzBuzzApplication().convert(5));
	}
	@Test
	void convert_6_to_fizz() {
		assertEquals("Fizz", new FizzBuzzApplication().convert(6));
	}
	@Test
	void convert_10_to_buzz() {
		assertEquals("Buzz", new FizzBuzzApplication().convert(10));
	}


}
