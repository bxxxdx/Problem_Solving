package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		int[][] dp = new int[1001][1001];
		
		dp[0][0] = 0;
		for (int i = 1; i <= 1000; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
		}
		for (int i = 2; i <= 1000; i++) {
			for (int j = 1; j < i; j++) {
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j])%10007;
			}
		}
//		for (int i = 0; i <= 30; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		System.out.println(dp[N][M]);
	}
}
