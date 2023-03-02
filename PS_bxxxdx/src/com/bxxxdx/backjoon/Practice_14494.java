package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_14494 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		long dp[][] = new long[n + 1][m + 1];

		dp[1][1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i][1] = 1;
		}
		for (int i = 2; i <= m; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= m; j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i][j-1] + dp[i-1][j])%1000000007;
			}
		}
//		for(int i=0;i<=n;i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		System.out.println(dp[n][m]);
	}
}
