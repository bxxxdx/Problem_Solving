package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		String A = temp[0];
		String B = temp[1];

		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= B.length() - A.length(); i++) {
			int dif = 0;
			for (int j = 0; j < A.length(); j++) {
				if (A.charAt(j) != B.charAt(j + i)) {
					dif++;
				}
			}
			if (min > dif) {
				min = dif;
			}
			//System.out.println(i + " / " + min);
		}
		System.out.println(min);

	}
}
