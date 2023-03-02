package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_17175 {
	//static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[51];
		dp[0] = 1;
		if (n > 0)
			dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] + 1) % 1000000007;
		}
		System.out.println(dp[n]);

		//fibonacci(n);
		//System.out.println(count);
	}

//	static int fibonacci(int n) {
//		count++;
//		if (n < 2) {
//			return n;
//		}
//		return fibonacci(n - 2) + fibonacci(n - 1);
//	}
}
