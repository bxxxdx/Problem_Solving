package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr[] = new int[input];
		int count = 0;
		for(int i=0;i<input;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<input;i++) {
			int remainder = 0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j == 0) {
					remainder++;
				}
			}
			if(remainder == 2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
