package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_16395 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");

		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		int[][] dp = new int[30][30];

		// 초기값 입력
		dp[0][0] = 1;
		for (int i = 1; i < 30; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
		}

		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}

		System.out.println(dp[n - 1][k - 1]);

	}
}
