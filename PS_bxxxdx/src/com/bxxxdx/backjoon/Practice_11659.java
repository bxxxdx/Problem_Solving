package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");

		int[] arr = new int[N];
		arr[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			temp = br.readLine().split(" ");
			int front = Integer.parseInt(temp[0]);
			int back = Integer.parseInt(temp[1]);
			int result = 0;
			if(front==1) result = arr[back-1];
			else result = arr[back-1] - arr[front-2];
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}

}
