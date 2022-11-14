package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int roomNumber = 101;
		int count = 1;
		String msg = "";
		for(int i=0; i<testCase; i++) {
			int arr[] = new int[3];
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int wRoom = 1, hRoom = 1;
			while(n>1 && n>count) {
				if(hRoom < h) {
					hRoom++;
				}
				else if(hRoom == h) {
					wRoom++;
					hRoom = 1;
				}		
				count++;
			}
			msg += hRoom*100+wRoom + "\n";
			count = 1;
		}
		
		System.out.println(msg);
	}

}
