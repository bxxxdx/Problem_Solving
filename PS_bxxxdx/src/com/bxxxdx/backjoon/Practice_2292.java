package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int ans = 0;
		int num1 = 1;
		int num2 = 1;
		int i;
		for(i=1;;i++) {
			if(input >= num1 && input <= num2) {
				break;
			}
			num1 = num2 + 1;
			num2 = num2 + 6*i;
		}
		System.out.println(i);
	}
}
