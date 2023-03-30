package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_15652 {

	static int N, M;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void recur(int at, int depth) {
		if (depth == M) {
			for (int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = at; i < N; i++) {
			arr[depth] = i + 1;
			recur(i, depth + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);

		arr = new int[M];
		visit = new boolean[N];

		recur(0, 0);

		System.out.println(sb);
	}
}
