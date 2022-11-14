package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) >='A' && input.charAt(i)<='C') {
				count += 2;
			}
			else if(input.charAt(i) >='D' && input.charAt(i)<='F') {
				count += 3;
			}
			else if(input.charAt(i) >='G' && input.charAt(i)<='I') {
				count += 4;
			}
			else if(input.charAt(i) >='J' && input.charAt(i)<='L') {
				count += 5;
			}
			else if(input.charAt(i) >='M' && input.charAt(i)<='O') {
				count += 6;
			}
			else if(input.charAt(i) >='P' && input.charAt(i)<='S') {
				count += 7;
			}
			else if(input.charAt(i) >='T' && input.charAt(i)<='V') {
				count += 8;
			}
			else if(input.charAt(i) >='W' && input.charAt(i)<='Z') {
				count += 9;
			}	
		}
		count += input.length();
		System.out.println(count);
	}

}
