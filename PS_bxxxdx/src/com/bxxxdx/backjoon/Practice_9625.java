package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_9625 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(br.readLine());

		int[][] arr = new int[K + 1][2];
		arr[0][0] = 1;
		arr[0][1] = 0;
		if (K > 0) {
			arr[1][0] = 0;
			arr[1][1] = 1;
		}
		for (int i = 2; i <= K; i++) {
			arr[i][0] = arr[i-1][0] + arr[i-2][0];
			arr[i][1] = arr[i-1][1] + arr[i-2][1];
		}
		
		System.out.println(arr[K][0] + " " + arr[K][1]);
	}
}
