package com.starkhorn.katas.fizzbuzz.rule;

public class FizzRule implements Rule {
	
	@Override
	public boolean support(int input) {
		return input % 3 == 0;
	}

	@Override
	public String say(int input) {
		return "fizz";
	}
}