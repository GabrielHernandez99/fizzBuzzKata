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


}
