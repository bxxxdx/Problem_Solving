package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0;i<input;i++) {
			int j = 0;
			while(j<(input-(i+1))) {
				System.out.print(" ");
				j++;
			}
			int k = 0;
			while(j<input) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}

	}

}
