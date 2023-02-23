package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2748 {
	static Long[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new Long[91];
		arr[0] = 0L;
		arr[1] = 1L;
		//System.out.println(Arrays.toString(arr));
		System.out.println(solve(n));
		//System.out.println(Arrays.toString(arr));

	}

	static long solve(int n) {
		if(arr[n] == null) {
			arr[n] = solve(n-1) + solve(n-2);
		}
		return arr[n];
	}
}