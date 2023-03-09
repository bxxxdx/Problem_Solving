package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_1051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);

		int[][] arr = new int[N][K];
		for (int i = 0; i < N; i++) {
			temp = br.readLine().split("");
			for (int j = 0; j < K; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);
			}
		}

		int max = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				for (int k = i; k < N; k++) {
					for (int m = j; m < K; m++) {
						if (arr[i][j] == arr[k][j] && arr[i][j] == arr[i][m] && arr[i][j] == arr[k][m]
								&& arr[k][j] == arr[i][m] && arr[k][j] == arr[k][m] && arr[i][m] == arr[k][m]
								&& m - j == k - i && (m - j + 1) * (k - i + 1) > max) {
							max = (m - j + 1) * (k - i + 1);
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
