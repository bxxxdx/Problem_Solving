package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int E = Integer.parseInt(temp[0]);
		int S = Integer.parseInt(temp[1]);
		int M = Integer.parseInt(temp[2]);
		
		int e = 1;
		int s = 1;
		int m = 1;
		int year = 1;
		while(true) {
			if(e == E && s == S && m == M) {
				break;
			}
			if(++e > 15)
				e = 1;
			if(++s > 28)
				s = 1;
			if(++m > 19)
				m = 1;
			year++;
		}
		System.out.println(year);
	}
}
