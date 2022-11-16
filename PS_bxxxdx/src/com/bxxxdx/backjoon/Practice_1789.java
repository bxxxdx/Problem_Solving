package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());

		long N = 1;
		while (true) {
			if (((1 + N) * N) / 2 <= S && ((1 + N) * (2 + N)) / 2 > S) {
				break;
			}
//			System.out.println(S + " / " + ((1 + N) * N) / 2  + " / " + ((1 + N) * (2 + N)) / 2);
//			System.out.println(N);
			N++;
		}
		System.out.println(N);
	}
}
