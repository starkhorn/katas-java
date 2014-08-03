package com.starkhorn.katas.fizzbuzz.rule;

public class ReturnFizzRule implements Rule {
	
	@Override
	public boolean support(int input) {
		return input % 3 == 0;
	}

	@Override
	public String process(int input) {
		return "fizz";
	}
}