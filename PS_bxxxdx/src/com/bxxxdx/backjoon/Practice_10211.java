package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_10211 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] dp = new int[N];
			for (int j = 0; j < N; j++) {
				dp[j] = Integer.parseInt(st.nextToken());
			}
			int result = dp[0];
			for (int j = 1; j < N; j++) {
				int num = dp[j];
				int max = dp[j];
				for(int k = j - 1; k >= 0; k--) {
					num = num + dp[k];
					max = Math.max(num, max);
				}
				result = Math.max(result, max);
			}
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}
