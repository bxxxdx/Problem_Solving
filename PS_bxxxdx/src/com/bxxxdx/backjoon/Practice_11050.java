package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);

		int tempN = 1;
		for (int i = 0; i < K; i++) {
			tempN = tempN * (N - i);
		}

		int tempK = 1;
		for (int i = 1 ; i <= K; i++) {
			tempK *= i;
		}
		
		System.out.println(tempN/tempK);

	}
}
