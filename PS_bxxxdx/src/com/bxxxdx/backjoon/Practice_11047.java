package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int K = Integer.parseInt(strs[1]);
		int[] arr = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = N - 1; i >= 0; i--) {
			if (K / arr[i] > 0) {
				ans += K / arr[i];
				K %= arr[i];
			}
		}
		System.out.println(ans);
	}	
}
