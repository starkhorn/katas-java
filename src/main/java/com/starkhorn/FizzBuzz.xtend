package com.starkhorn

class FizzBuzz {
	
	def say(int number) {
		if (number % 15 == 0)
			'fizzbuzz'
		else if (number % 3 == 0)
			'fizz'
		else if (number % 5 == 0)
			'buzz'
		else
			number.toString
	}
	
}