package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_11727 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n + 1];
		arr[1] = 1;
		if (n > 1)
			arr[2] = 3;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + 2 * arr[i - 2]) % 10007;
		}
		System.out.println(arr[n]);
	}
}
