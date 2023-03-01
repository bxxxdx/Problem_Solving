package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_9657 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		if (n % 7 == 2 || n % 7 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
	}
}
