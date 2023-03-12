package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_14912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int d = Integer.parseInt(temp[1]);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
		//System.out.println(sb);
		
		int count = 0;
		for(int i = 0; i < sb.length(); i++) {
			if((int)sb.charAt(i) - 48 == d) 
				count++;
		}
		System.out.println(count);
	}
}
