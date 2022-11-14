package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String ox[] = new String[input];
		for(int i=0; i<ox.length; i++) {
			ox[i] = sc.next();
		}
		
		for(int i=0; i<ox.length; i++) {
			int count = 0;
			int sum = 0;
			for(int j=0;j<ox[i].length();j++) {
				if(ox[i].charAt(j)=='O') {
					count++;
				}
				else {
					count = 0;
				}
				sum = sum+count;
			}
			System.out.println(sum);
		
		}
		

	}

}
