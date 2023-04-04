package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Practice_16922 {

	static int n;

	static int[] arr = { 1, 5, 10, 50 };
	static int[] sum;
	static int result;
	static HashSet<Integer> set = new HashSet<>();

	public static void recur(int depth, int idx, int s) {
		if (depth == n) {
			if(sum[s] == 0) {
				sum[s] =  1;
				result++;
			}
			return;
		}
		for (int i = idx; i < 4; i++) {
			recur(depth + 1, i, s + arr[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		sum = new int[10000];

		recur(0, 0, 0);
		// aa
		System.out.println(result);
	}
}
