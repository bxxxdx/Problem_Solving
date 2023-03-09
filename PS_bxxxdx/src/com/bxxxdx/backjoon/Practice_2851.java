package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2851 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += arr[i];
			if (Math.abs(100 - sum) < Math.abs(100 - min)) {
				min = sum;
				//System.out.println(sum + " : " + i + " / " );
			} else if (Math.abs(100 - sum) == Math.abs(100 - min)) {
				min = sum > min ? sum : min;
			}

		}
		System.out.println(min);
	}
}
