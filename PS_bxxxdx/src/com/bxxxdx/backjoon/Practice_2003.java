package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int result = 0;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = i; j < N; j++) {
				sum += arr[j];
				if(sum == M) {
					result++;
					break;
				} else if(sum > M) {
					break;
				}
			}
		}
		System.out.println(result);
	}
}
