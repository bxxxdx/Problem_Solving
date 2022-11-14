package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr[] = new int[input];
		
		for(int i=0;i<input;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			else if (arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
