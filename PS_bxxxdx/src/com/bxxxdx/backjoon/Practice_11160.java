package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_11160 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[n];
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			dp[i] = 1111;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] + j >= i && dp[j] == 1111) {
					dp[i] = 1111;
				} else if (arr[j] + j >= i) {
					dp[i] = Math.min(dp[i - 1] + 1, dp[j] + 1);
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(dp));
		System.out.println(dp[n - 1] == 1111 ? -1 : dp[n - 1]);
	}
}
