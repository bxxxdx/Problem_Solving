package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_11057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N + 1][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = j; k < 10; k++) {
					dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007;
				}
			}
		}
//		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = (result + dp[N][i]) % 10007;
			//System.out.println(result);
		}
		System.out.println(result % 10007);
	}
}
