package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_15655 {

	static int N, M;
	static int[] input;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void recur(int depth) {
		if (depth == M) {
			for (int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visit[i])
				continue;
			visit[i] = true;
			arr[depth] = input[i];
			recur(depth + 1);
			for (int j = i + 1; j < N; j++) {
				visit[j] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		input = new int[N];
		arr = new int[M];
		visit = new boolean[N];
		temp = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(input);

		recur(0);

		System.out.println(sb);
	}
}