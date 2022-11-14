package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice_10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		System.out.println(input[0] + " " + input[1]);
		String large = "";
		String small = "";
		if(input[0].length() > input[1].length()) {
			large = input[0];
			small = input[1];
		}
		else {
			large = input[1];
			small = input[0];
		}
		StringBuffer tempLarge = new StringBuffer(large);
		String num1 = tempLarge.reverse().toString();
		StringBuffer tempSmall = new StringBuffer(small);
		String num2 = tempSmall.reverse().toString();
		
		System.out.println(num1 + " " + num2);
		
		StringBuffer result = new StringBuffer();
		int ceilFlag = 0;
		for(int i=0;i<num1.length();i++) {
			if(i<num2.length()) {
				int temp = (num1.charAt(i)-48) + (num2.charAt(i)-48) + ceilFlag; // ASCII ;
				if(temp>=10) {
					temp = temp%10;
					ceilFlag = 1;
				}
				else {
					ceilFlag = 0;
				}
				result.append(temp);
			}
			else if(i<num1.length()) {
				int temp = num1.charAt(i)-48 + ceilFlag;
				if(temp>=10) {
					temp = temp%10;
					ceilFlag = 1;
				}
				else {
					ceilFlag = 0;
				}
				result.append(temp);
			}
			else if(i<num1.length()) {
				int temp = num1.charAt(i) + ceilFlag;
				result.append(temp);
			}
		}
		System.out.println("정답 : " + result.reverse());
		
		
		
		
		
	}
}
