package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_1965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[n];
		dp[0] = 1;
		int result = 1;
		for (int i = 1; i < n; i++) {
			dp[i] = 1;
			for (int j = i-1; j >= 0; j--) {
				if(arr[j] < arr[i] && dp[j] >= dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
			result = Math.max(result, dp[i]);
		}
		//System.out.println(Arrays.toString(dp));
		System.out.println(result);
	}
}
