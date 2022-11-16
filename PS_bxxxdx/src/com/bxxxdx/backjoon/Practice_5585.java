package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5585 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 1000 - Integer.parseInt(br.readLine());
		
		int count = 0;
		while(input != 0) {
			if(input/500>0) {
				count += input/500;
				input -= input/500*500;
			}
			else if(input/100>0) {
				count += input/100;
				input -= input/100*100;
			}
			else if(input/50>0) {
				count += input/50;
				input -= input/50*50;
			}
			else if(input/10>0) {
				count += input/10;
				input -= input/10*10;
			}
			else if(input/5>0) {
				count += input/5;
				input -= input/5*5;
			}
			else if(input/1>0) {
				count += input/1;
				input -= input/1*1;
			}		
		}
		System.out.println(count);
	}
}
