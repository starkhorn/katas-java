package com.starkhorn.katas.fizzbuzz.rule;

public class ReturnBuzzRule implements Rule {
	
	@Override
	public String process(int input) {
		return "buzz";
	}
	
	@Override
	public boolean support(int input) {
		return input % 5 == 0;
	}
}