package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] dp = new int[n];
		dp[0] = Integer.parseInt(st.nextToken());
		int max = dp[0];
		for (int i = 1; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			dp[i] = Math.max(num, dp[i-1] + num);
			//System.out.println(num + " / " + dp[i-1] + " , " + num);
			if(dp[i] > max) max = dp[i];
			//System.out.println("max " + max);
		}
		System.out.println(max);

	}
}
