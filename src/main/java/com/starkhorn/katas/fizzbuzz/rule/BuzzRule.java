package com.starkhorn.katas.fizzbuzz.rule;

public class BuzzRule implements Rule {
	
	@Override
	public boolean support(int input) {
		return input % 5 == 0;
	}
	
	@Override
	public String say(int input) {
		return "buzz";
	}
	
}