package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_15650 {

	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	static int M, N;

	public static void dfs(int depth) {
		if (depth == M) {
			for (int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				for (int j = i + 1; j < N; j++) {
					visit[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);

		arr = new int[M];
		visit = new boolean[N];

		dfs(0);
		System.out.println(sb);
	}

}
