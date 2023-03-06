package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_9465 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st1;
		StringTokenizer st2;
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			long[][] arr = new long[2][n];
			long[][] dp = new long[2][n];
			st1 = new StringTokenizer(br.readLine());
			st2 = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[0][i] = Integer.parseInt(st1.nextToken());
				arr[1][i] = Integer.parseInt(st2.nextToken());
			}
			dp[0][0] = arr[0][0];
			dp[1][0] = arr[1][0];
			if(n > 1) {
				dp[0][1] = arr[1][0] + arr[0][1];
				dp[1][1] = arr[0][0] + arr[1][1];
			}
			for (int j = 2; j< n; j++) {
				for (int i = 0; i < 2; i++) {
					if(i == 0) {
						dp[i][j] = Math.max(dp[0][j-2], Math.max(dp[1][j-2], dp[1][j-1])) + arr[i][j];
					}
					if(i == 1) {
						dp[i][j] = Math.max(dp[1][j-2], Math.max(dp[0][j-2], dp[0][j-1])) + arr[i][j];
					}
				}
			}
			sb.append(dp[0][n-1]>dp[1][n-1]?dp[0][n-1]:dp[1][n-1]).append('\n');
		}
		System.out.println(sb);
	}
}
