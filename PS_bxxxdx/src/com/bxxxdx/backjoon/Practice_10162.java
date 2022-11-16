package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10162 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int[] result = new int[3];
		if (T % 10 == 0) {
			while (T != 0) {
				if (T / 300 > 0) {
					result[0] = T / 300;
					T = T - T / 300 * 300;
				} else if (T / 60 > 0) {
					result[1] = T / 60;
					T = T - T / 60 * 60;
				} else if (T / 10 > 0) {
					result[2] = T / 10;
					T = T - T / 10 * 10;
				}
			}
			System.out.println(result[0] + " " + result[1] + " " + result[2]);
		} else {
			System.out.println(-1);
		}

	}
}
