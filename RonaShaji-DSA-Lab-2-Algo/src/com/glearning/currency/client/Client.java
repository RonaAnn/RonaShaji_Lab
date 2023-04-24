package com.glearning.currency.client;

import java.util.Scanner;

import com.glearning.currency.service.CurrencyService;

public class Client {

	public static void main(String[] args) {
		
		CurrencyService service = new CurrencyService();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int n = in.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the currency denominations value");
		for(int i =0;i<n;i++) {
			array[i] = in.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay.");
		int amount = in.nextInt();
		
		service.denominatorService(array, amount);

		

	}

}
