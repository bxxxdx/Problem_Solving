package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_15990 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		long[][] dp = new long[1000001][4];
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		for (int i = 4; i < dp.length; i++) {
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
			dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
			dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			long result = (dp[num][1] + dp[num][2] + dp[num][3]) % 1000000009;
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}
