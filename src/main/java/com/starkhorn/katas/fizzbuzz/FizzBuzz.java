package com.starkhorn.katas.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.starkhorn.katas.fizzbuzz.rule.BuzzRule;
import com.starkhorn.katas.fizzbuzz.rule.DefaultRule;
import com.starkhorn.katas.fizzbuzz.rule.FizzBuzzRule;
import com.starkhorn.katas.fizzbuzz.rule.FizzRule;
import com.starkhorn.katas.fizzbuzz.rule.Rule;

class FizzBuzz {
	
	private List<Rule> rules;
	private DefaultRule defaultRule = new DefaultRule();

	public FizzBuzz() {
		rules = Arrays.asList(
				new FizzBuzzRule(),
				new FizzRule(),
				new BuzzRule()
		);
	}

	public String say(int input) {
		Optional<Rule> supportedRule = rules.stream()
				.filter(rule -> rule.support(input))
				.findFirst();
		
		return supportedRule.orElse(defaultRule).process(input);
	}
	
}