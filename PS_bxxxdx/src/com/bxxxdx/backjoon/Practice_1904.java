package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[1000000];
		arr[0] = 1;
		arr[1] = 2;
		for (int i = 2; i < N; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
		}
		System.out.println(arr[N - 1]);
	}
}
