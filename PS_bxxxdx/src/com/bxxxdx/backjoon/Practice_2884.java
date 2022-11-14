package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		if(input2-45 >=0) {
			System.out.println(input1 + " " + (input2-45));
		}
		else {
			if((input1-1)>=0) {
				System.out.println((input1-1) + " " + (input2-45+60));
			}
			else {
				System.out.println((input1-1+24) + " " + (input2-45+60));
			}
		}
		
		
		
	}
}
