package com.bxxxdx.backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10974 {

	static int n;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void recur(int depth) {
		if (depth == n) {
			for (int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < n; i++) {
			if(visit[i]) continue;
			visit[i] = true;
			arr[depth] = i + 1;
			recur(depth + 1);
			visit[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		visit = new boolean[n];

		recur(0);

		System.out.println(sb);
	}
}
