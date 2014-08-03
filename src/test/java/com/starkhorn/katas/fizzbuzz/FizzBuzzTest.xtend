package com.starkhorn.katas.fizzbuzz

import com.starkhorn.FizzBuzz
import org.junit.Before
import org.junit.Test

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

class FizzBuzzTest {
	
	FizzBuzz fizzbuzz
	
	@Before
	def void setup() {
		fizzbuzz = new FizzBuzz()
	}
	
	@Test
	def itReturns1WhenInputIs1() {
		assertThat(fizzbuzz.say(1), is('1'))
	}
	
	@Test
	def itReturns2WhenInputIs2() {
		assertThat(fizzbuzz.say(2), is('2'))
	}
	
	@Test
	def itReturnsFizzWhenInputIs3() {
		assertThat(fizzbuzz.say(3), is('fizz'))
	}
	
	@Test
	def itReturns4WhenInputIs4() {
		assertThat(fizzbuzz.say(4), is('4'))
	}
	
	@Test
	def itReturnsBuzzWhenInputIs5() {
		assertThat(fizzbuzz.say(5), is('buzz'));
	}
	
	@Test
	def itReturnsFizzWhenInputIs6() {
		assertThat(fizzbuzz.say(6), is('fizz'));
	}
	
	@Test
	def itReturnsBuzzWhenInputIs10() {
		assertThat(fizzbuzz.say(10), is('buzz'));
	}
	
	@Test
	def itReturnsFizzBuzzWhenInputIs15() {
		assertThat(fizzbuzz.say(15), is('fizzbuzz'));
	}
	
}