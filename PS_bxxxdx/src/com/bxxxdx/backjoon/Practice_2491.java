package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_2491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[][] dp = new int[N][2];
		int max = 1;
		int num1 = Integer.parseInt(st.nextToken());
		dp[0][0] = 1;
		dp[0][1] = 1;
		for (int i = 1; i < N; i++) {
			int num2 = Integer.parseInt(st.nextToken());
			if(num2 > num1) {
				dp[i][0] = dp[i-1][0] + 1;
				dp[i][1] = 1;
			} else if(num2 < num1) {
				dp[i][1] = dp[i-1][1] + 1;
				dp[i][0] = 1;
			} else {
				dp[i][0] = dp[i-1][0] + 1;
				dp[i][1] = dp[i-1][1] + 1;
			}
			max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
			num1 = num2;
		}
		System.out.println(max);
	}
}
