package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(factorial(input));
		
	}
	public static int factorial(int x) {
		if(x>0) {
			return x * factorial(x-1);
		}
		else {
			return 1;
		}
	}
}
