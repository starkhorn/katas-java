package com.starkhorn.katas.fizzbuzz.rule;

public class DefaultRule implements Rule {

	@Override
	public boolean support(int input) {
		return true;
	}

	@Override
	public String process(int input) {
		return String.valueOf(input);
	}
	
}
