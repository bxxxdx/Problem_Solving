package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr[] = new int[input];
		int sum = 0;
		for(int i=0;i<input;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int j=0;j<input;j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
			sum +=arr[j];
		}
		System.out.println((sum*100)/(max*arr.length*1.00));
		
		
	}

}
