package com.starkhorn.katas.fizzbuzz.rule;

public class FizzBuzzRule implements Rule {
	
	@Override
	public boolean support(int input) {
		return input % 15 == 0;
	}

	@Override
	public String say(int input) {
		return "fizzbuzz";
	}
}