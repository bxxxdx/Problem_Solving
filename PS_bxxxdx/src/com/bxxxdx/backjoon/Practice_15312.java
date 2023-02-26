package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_15312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String first = br.readLine();
		String second = br.readLine();
		int[] arr = { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

		int[] result = new int[first.length() + second.length()];
		for (int i = 0; i < first.length(); i++) {
			result[2 * i] = arr[first.charAt(i) - 65];
			result[2 * i + 1] = arr[second.charAt(i) - 65];
		}
		for (int i = result.length; i > 2; i--) {
			int[] temp = new int[i - 1];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = (result[j] + result[j + 1]) % 10;
			}
			result = temp;
		}
		System.out.println(result[0] + "" + result[1]);

	}
}
