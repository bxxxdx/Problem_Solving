package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		
		int[] arr = new int[N+1];
		int j = 0;
		for(int i = 1 ; i <= N; i ++) {
			if(N % i == 0) {
				arr[++j] = i;
			}
		}
		System.out.println(arr[K]);
	}
}
