package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_16194 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[N + 1];
		dp[1] = arr[1];
		if(N > 1)
			dp[2] = Math.min(dp[1] + dp[1], arr[2]);
		for (int i = 3; i <= N; i++) {
			int min = arr[i];
			for (int j = i - 1; j >= 1; j--) {
				min = Math.min(min, dp[i-j] + dp[j]);
			}
			dp[i] = min;
		}
		System.out.println(dp[N]);
	}
}
