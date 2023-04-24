package com.greatlearning.dsa.balancingbrackets;

import java.util.Stack;

public class BalancedBrackets {

	public boolean isBalanced(String input) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {

			// Extracting each character from String
			char ch = input.charAt(i);

			// Push the opening brackets to stack
			if (ch == '{' || ch == '[' || ch == '(') {

				stack.push(ch);

			} else if (ch == '}' || ch == ']' || ch == ')') {

				if (stack.isEmpty())
					return false;

				// Pop elements from stack
				char value = stack.pop();

				// Check for matching opening brackets else return false
				if ((ch == ')' && value != '(') || (ch == '}' && value != '{') || (ch == ']' && value != '[')) {

					return false;
				}
			}
		}

		return stack.isEmpty();

	}
}
