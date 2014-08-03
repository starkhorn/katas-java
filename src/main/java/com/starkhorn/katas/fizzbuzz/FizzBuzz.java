package com.starkhorn.katas.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.starkhorn.katas.fizzbuzz.rule.Rule;

class FizzBuzz {
	
	private List<Rule> rules = new ArrayList<Rule>();
	
	private Rule defaultRule;

	public String say(int input) {
		Rule rule = getSupportedRuleOrDefaultRuleForInput(input);
		
		return rule.process(input);
	}

	private Rule getSupportedRuleOrDefaultRuleForInput(int input) {
		Optional<Rule> supportedRule = rules.stream()
				.filter(rule -> rule.support(input))
				.findFirst();
		
		return supportedRule.orElse(defaultRule);
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public void setDefaultRule(Rule defaultRule) {
		this.defaultRule = defaultRule;
	}
	
}