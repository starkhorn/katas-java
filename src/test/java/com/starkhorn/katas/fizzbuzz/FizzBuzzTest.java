package com.starkhorn.katas.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.starkhorn.katas.test.SpringTestContext;

public class FizzBuzzTest extends SpringTestContext {
	
	@Autowired
	FizzBuzz fizzbuzz;
	
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