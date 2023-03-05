package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_1890 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] arr = new long[N + 1][N + 1];
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		for(int i=0;i<=N;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}

		long[][] dp = new long[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int k = i - 1; k >= 1; k--) {
					if (arr[k][j] + k == i && (k == 1 && j == 1)) {
						dp[i][j] = 1;
					} else if(arr[k][j] + k == i) {
						dp[i][j] += dp[k][j];
					}
				}
				for (int m = j - 1; m >= 1; m--) {
					if (arr[i][m] + m == j && (i == 1 && m == 1)) {
						dp[i][j] = 1;
					} else if(arr[i][m] + m == j ) {
						dp[i][j] += dp[i][m];
					}
				}
			}
		}
//		for (int i = 0; i <= N; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		System.out.println(dp[N][N]);
	}
}
