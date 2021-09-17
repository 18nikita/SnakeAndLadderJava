package com.snakeandladder;

public class RollsDie {

	public static void main(String[] args) {
		// UC-2-Rolls the die to get no. between 1 to 6
		
		int dieCheck= 1+(int) (Math.random() * 6);
		
		System.out.println("The no. on a die is :" + dieCheck);

	}

}
