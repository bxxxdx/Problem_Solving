package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4153 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int num1 = Integer.parseInt(temp[0]);
		int num2 = Integer.parseInt(temp[1]);
		int num3 = Integer.parseInt(temp[2]);
		
		String result = "";
		while(!(num1==0 && num2==0 && num3==0)) {
			boolean flag = false;
			if(num1 > num2 && num1 > num3) {
				if(num1*num1==num2*num2+num3*num3) {
					flag = true;
				}
			} else if(num2 > num1 && num2 > num3) {
				if(num2*num2==num1*num1+num3*num3) {
					flag = true;
				}
			} else if(num3 > num1 && num3 > num2) {
				if(num3*num3==num2*num2+num1*num1) {
					flag = true;
				}
			}
			if(flag) {
				result += "right\n";
			} else {
				result += "wrong\n";
			}
			
			temp = br.readLine().split(" ");
			num1 = Integer.parseInt(temp[0]);
			num2 = Integer.parseInt(temp[1]);
			num3 = Integer.parseInt(temp[2]);
		}
		System.out.println(result);
	}
}
