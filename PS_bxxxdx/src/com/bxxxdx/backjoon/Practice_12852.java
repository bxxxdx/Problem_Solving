package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_12852 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N + 1];

		dp[1] = 0;
		if (N > 1)
			dp[2] = 1;
		if (N > 2)
			dp[3] = 1;
		for (int i = 4; i <= N; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				dp[i] = Math.min(dp[i / 2], Math.min(dp[i / 3], dp[i - 1])) + 1;
			} else if (i % 2 == 0) {
				dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
			} else if (i % 3 == 0) {
				dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
			} else {
				dp[i] = dp[i - 1] + 1;
			}
		}
		int i = N;
		boolean flag = false;
		StringBuilder sb = new StringBuilder(N + " ");
		while (i != 1) {
			if (i % 2 == 0 && i % 3 == 0) {
				if (dp[i / 3] <= dp[i / 2] && dp[i / 3] <= dp[i - 1]) {
					sb.append(i / 3).append(" ");
					i /= 3;
				} else if (dp[i / 2] <= dp[i / 3] && dp[i / 2] <= dp[i - 1]) {
					sb.append(i / 2).append(" ");
					i /= 2;
				} else {
					sb.append(i - 1).append(" ");
					i--;
				}
				
			} else if (i % 2 == 0) {
				if (dp[i / 2] <= dp[i - 1]) {
					sb.append(i / 2).append(" ");
					i /= 2;
				} else {
					sb.append(i - 1).append(" ");
					i--;
				}
			} else if (i % 3 == 0) {
				if (dp[i / 3] <= dp[i - 1]) {
					sb.append(i / 3).append(" ");
					i /= 3;
				} else {
					sb.append(i - 1).append(" ");
					i--;
				}
			} else {
				sb.append(i - 1).append(" ");
				i--;
			}
		}
		//System.out.println(Arrays.toString(dp));
		System.out.println(dp[N]);
		System.out.println(sb);
	}
}
