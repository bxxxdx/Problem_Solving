package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int count = 0;
		int sum = 0;
		int min = 10001;
		for(int i=input1;i<=input2;i++) {
			int remainder = 0;
			for(int j=1;j<=i;j++) {
				if(i%j == 0) {
					remainder++;
				}
			}
			if(remainder == 2) {
				count++;
				sum += i;
				if(min > i) {
					min = i;
				}
			}
		}
		if(count > 0) {
			System.out.println(sum+"\n"+min);
		}
		else {
			System.out.println(-1);
		}
	}
}
