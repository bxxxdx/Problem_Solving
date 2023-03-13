package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_1059 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[L];
		for (int i = 0; i < L; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int n = Integer.parseInt(br.readLine());
		Arrays.sort(arr);

		int start = -1;
		int end = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < n && arr[i + 1] > n) {
				start = arr[i];
				end = arr[i+1];
			}
		}
		if (start == -1) {
			start = 0;
			end = arr[0];
		}
		int count = 0;
		//System.out.println(start + " //// " + end);
		for (int i = start + 1; i < end; i++) {
			for (int j = start + 1; j < end; j++) {
				if (i != j && i <= n && n <= j) {
					//System.out.println(i + " / " + j);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
