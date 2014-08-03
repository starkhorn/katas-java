package com.starkhorn.katas.fizzbuzz.rule;

public class ReturnBuzzRule implements Rule {
	
	@Override
	public boolean support(int input) {
		return input % 5 == 0;
	}
	
	@Override
	public String process(int input) {
		return "buzz";
	}
}