package com.greatlearning.dsa.balancingbrackets;

public class Client {

	public static void main(String[] args) {

		String input = "([[{}]])"; // ([[{}]]))  ([[{}]])
		BalancedBrackets checkBracket = new BalancedBrackets();

		boolean result = checkBracket.isBalanced(input);

		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}
}
