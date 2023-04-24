package com.glearning.paymoney.service;

public class TransactionService {

	public void checkTargetAchievement(int[] array, int target) {

		int sum = 0;
		boolean flag = false;

		//Loop through the array
		for (int i = 0; i < array.length; i++) {

			sum += array[i];

			// If target achieved print and break from the loop
			if (sum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " tranactions.\n");
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("Target  value not achieved.\n");
		}
	}
}
