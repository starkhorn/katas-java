package com.starkhorn.katas.fizzbuzz.rule;

public class ReturnInputRule implements Rule {

	@Override
	public String process(int input) {
		return String.valueOf(input);
	}

	@Override
	public boolean support(int input) {
		return true;
	}
	
}
