package com.starkhorn.katas.fizzbuzz.rule;

public interface Rule {
	boolean support(int input);
	String process(int input);
}