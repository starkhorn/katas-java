package com.starkhorn.katas.fizzbuzz.rule;

public interface Rule {
	String process(int input);
	boolean support(int input);
}