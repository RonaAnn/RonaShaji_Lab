package com.glearning.currency.service;

public class CurrencyService {

	public void denominatorService(int[] denominators, double amount) {

		boolean flag = true;
		
		//Sort the array in descending order using merge sort
		mergeSort(denominators, 0, denominators.length -1);
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for (int i = denominators.length - 1; i >= 0; i--) {
			if (amount >0) {
				double div = amount / denominators[i];
				amount -= (div * denominators[i]);
				if(div !=0)
				  System.out.println(denominators[i] + ":" + div);
			}else {
				System.out.println(0);
			}
		}
	}

	private void mergeSort(int[] arr, int l, int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			
			mergeSort(arr, 0, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
		
	}

	private void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l +1;
		int n2 = r - mid;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i] = arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			right[i] = arr[mid+i+1];
		}
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			
			if(left[i]>right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++]= right[j++];
			}
		}
		
		while(i<n1) {
			arr[k++] = left[i++];
		}
		
		while(j<n2) {
			arr[k++] = right[j++];
		}
	}
} 
