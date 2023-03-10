package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int a = Integer.parseInt(temp[1]);
		int b = Integer.parseInt(temp[2]);

		int count = 1;
		while (true) {
			if ((b - a == 1 && a % 2 == 1 && b % 2 == 0) || (a - b == 1 && b % 2 == 1 && a % 2 == 0)) {
				break;
			}
			if (a % 2 == 0)
				a /= 2;
			else
				a = (a + 1) / 2;
			
			if (b % 2 == 0)
				b /= 2;
			else
				b = (b + 1) / 2;
			
			count++;
		}
		System.out.println(count);
	}
}
