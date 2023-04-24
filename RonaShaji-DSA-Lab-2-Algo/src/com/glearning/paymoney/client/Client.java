package com.glearning.paymoney.client;

import java.util.Scanner;
import com.glearning.paymoney.service.TransactionService;

public class Client {

	public static void main(String[] args) {

		TransactionService service = new TransactionService();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int n = in.nextInt();
		int[] transactionArray = new int[n];

		System.out.println("Enter the values of array");
		for (int i = 0; i < n; i++) {
			transactionArray[i] = in.nextInt();
		}

		System.out.println("Enter total number of targets that need to be achieved");
		int noOfTarget = in.nextInt();

		while (noOfTarget > 0) {

			System.out.println("Enter the value of target");
			int targetValue = in.nextInt();

			service.checkTargetAchievement(transactionArray, targetValue);
			noOfTarget--;
		}
	}

}
