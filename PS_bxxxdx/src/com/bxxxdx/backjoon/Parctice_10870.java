package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Parctice_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		if(input>1) {
			for(int i=1;i<input;i++) {
				int temp = num2;
				num2 = num1+num2;
				num1 = temp;
			}
			System.out.println(num2);
		}
		else if(input == 0) {
			System.out.println(num1);
		}
		else if(input == 1) {
			System.out.println(num2);
		}

		

	}

}
