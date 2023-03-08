package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		int[][] arr = new int[N + 1][N + 1];
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] dp = new int[N + 1][N + 1];
		dp[1][1] = arr[1][1];
		for (int i = 2; i <= N; i++) {
			dp[1][i] += dp[1][i - 1] + arr[1][i];
			dp[i][1] += dp[i - 1][1] + arr[i][1];
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 2; j <= N; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i][j];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1];
			//System.out.println(dp[x2][y2] + " / " + dp[x1-1][y1] + " / " + dp[x1][y1-1] + " / " + dp[x1-1][y1-1]);
			sb.append(result).append('\n');
		}

//		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
//		System.out.println("//");
//		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		
		System.out.println(sb);
	}
}
