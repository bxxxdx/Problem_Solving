package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int temp1 = N;
		int temp2 = N;
		int count1 = 0;
		int count2 = 0;
		while(temp1!=1) {
			if(temp1%3 != 0){
				temp1--;
			}
			else if(temp1%3 == 0){
				temp1 = temp1/3;
			}
			else if(N%2 == 0){
				temp1 = temp1/2;
			}
			count1++;
		}
		while(temp2!=1) {
			if(temp2%2 != 0){
				temp2--;
			}
			else if(temp2%2 == 0){
				temp2 = temp2/2;
			}
			else if(temp2%3 == 0){
				temp2 = temp2/3;
			}
			count2++;
		}
		System.out.println(count1<count2?count1:count2);
	}
}
