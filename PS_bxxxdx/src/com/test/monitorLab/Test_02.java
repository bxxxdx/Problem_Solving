package com.test.monitorLab;

import java.util.Arrays;

public class Test_02 {
	public static void main(String[] args) {
		System.out.println(solution(20, 20));
	}

	public static long solution(int r, int c) {
		long answer = 0;
		long[][] dp = new long[r + 1][c + 1];
		dp[1][1] = 0;
		for (int i = 1; i <= r; i++) {
			dp[i][1] = 1;
		}
		for (int i = 1; i <= c; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= r; i++) {
			for(int j=2;j<=c; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		answer = dp[r][c];
		return answer;
	}
}
