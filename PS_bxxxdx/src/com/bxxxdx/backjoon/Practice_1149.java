package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_1149 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] dp = new int[N][3];

		String[] temp = br.readLine().split(" ");
		dp[0][0] = Integer.parseInt(temp[0]);
		dp[0][1] = Integer.parseInt(temp[1]);
		dp[0][2] = Integer.parseInt(temp[2]);
		for (int i = 1; i < N; i++) {
			temp = br.readLine().split(" ");
			dp[i][0] = Integer.parseInt(temp[0]) + Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = Integer.parseInt(temp[1]) + Math.min(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] = Integer.parseInt(temp[2]) + Math.min(dp[i - 1][0], dp[i - 1][1]);
		}
		System.out.println(Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])));
	}
}
