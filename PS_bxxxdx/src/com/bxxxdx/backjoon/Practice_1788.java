package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1788 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[1000001];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000;
		}
		
		if(n == 0) {
			System.out.println(0);
		}
		else if (n < 0 && Math.abs(n) % 2 == 0) {
			System.out.println(-1);
		} else {
			System.out.println(1);
		} 
		System.out.println(dp[Math.abs(n)]);
	}
}
