package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		StringBuilder sb = new StringBuilder();
		while ((str = br.readLine()) != null) {
			int n = Integer.parseInt(str);
			int i = 1;
			int count = 1;
			while ((i = i % n) != 0) {
				count++;
				i = i * 10 + 1;
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
}
