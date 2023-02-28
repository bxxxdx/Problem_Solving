package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_25644 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int min = Integer.parseInt(st.nextToken());
		int ans = 0;
		for (int i = 1; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			ans = Math.max(ans, temp - min);
			min = Math.min(min, temp);
		}
		System.out.println(ans);

	}
}
