package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);

		int[][] dp = new int[N + 1][K + 1];
		dp[1][1] = 1;
		for (int i = 2; i <= N; i++) {
			dp[i][1] = 1;
		}
		for (int i = 2; i <= K; i++) {
			dp[1][i] = i;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 2; j <= K; j++) {
				dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000000;
			}
		}
		System.out.println(dp[N][K]);
	}
}
