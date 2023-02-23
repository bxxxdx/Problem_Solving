package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_1463 {
	static Integer[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new Integer[N + 1];
		arr[0] = arr[1] = 0;
		System.out.println(solve(N));
	}

	static int solve(int n) {
		if (arr[n] == null) {
			if (n % 6 == 0) {
				arr[n] = Math.min(solve(n - 1), Math.min(solve(n / 3), solve(n / 2))) + 1;
			} else if (n % 3 == 0) {
				arr[n] = Math.min(solve(n / 3), solve(n - 1)) + 1;
			} else if (n % 2 == 0) {
				arr[n] = Math.min(solve(n / 2), solve(n - 1)) + 1;
			} else {
				arr[n] = solve(n - 1) + 1;
			}
		}
		return arr[n];
	}

//	public static int dp(int n, int[] arr) {
//		switch (n) {
//		case 1:
//			arr[n] = 0;
//			break;
//		case 2:
//		case 3:
//			arr[n] = 1;
//			break;
//		default:
//			int a=Integer.MAX_VALUE; int b=Integer.MAX_VALUE; int c=Integer.MAX_VALUE;
//			if (n % 3 == 0) {
//				a = dp(n / 3, arr) + 1;
//			}
//			if (n % 2 == 0) {
//				b = dp(n / 2, arr) + 1;
//			}
//			c = dp(n - 1, arr) + 1;
//			
//			arr[n] = Math.min(a, Math.min(b, c));
//			break;
//		}
//		return arr[n];
//	}
}
