package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2480 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int num1 = Integer.parseInt(temp[0]);
		int num2 = Integer.parseInt(temp[1]);
		int num3 = Integer.parseInt(temp[2]);
		
		int result = 0;
		if(num1 == num2 && num2 == num3 && num3==num1) {
			result = 10000 + num1 *1000;
		} else if ((num1 == num2 && num2 != num3) || (num2 == num3 && num3 != num1) || (num3 == num1 && num1 != num2)) {
			if(num1 == num2) {
				result = 1000 + num1 * 100;
			} else if(num2 == num3) {
				result = 1000 + num2 * 100;
			} else if(num3 == num1 ) {
				result = 1000 + num3 * 100;
			}
		} else if(num1 != num2 && num2 != num3 && num3 != num1) {
			int max;
			if(num1 > num2) max = num1;
			else max = num2;
			if(num3 > max) max = num3;
			
			result = 100 * max;
		}		
		System.out.println(result);		
	}
}
