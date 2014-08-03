package com.starkhorn.katas.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {
	
	FizzBuzz fizzbuzz;
	
	@Before
	public void setup() {
		fizzbuzz = new FizzBuzz();
	}
	
	@Test
	public void  itReturns1WhenInputIs1() {
		assertThat(fizzbuzz.say(1), is("1"));
	}
	
	@Test
	public void  itReturns2WhenInputIs2() {
		assertThat(fizzbuzz.say(2), is("2"));
	}
	
	@Test
	public void  itReturnsFizzWhenInputIs3() {
		assertThat(fizzbuzz.say(3), is("fizz"));
	}
	
	@Test
	public void  itReturns4WhenInputIs4() {
		assertThat(fizzbuzz.say(4), is("4"));
	}
	
	@Test
	public void  itReturnsBuzzWhenInputIs5() {
		assertThat(fizzbuzz.say(5), is("buzz"));
	}
	
	@Test
	public void  itReturnsFizzWhenInputIs6() {
		assertThat(fizzbuzz.say(6), is("fizz"));
	}
	
	@Test
	public void  itReturnsBuzzWhenInputIs10() {
		assertThat(fizzbuzz.say(10), is("buzz"));
	}
	
	@Test
	public void  itReturnsFizzBuzzWhenInputIs15() {
		assertThat(fizzbuzz.say(15), is("fizzbuzz"));
	}
	
}