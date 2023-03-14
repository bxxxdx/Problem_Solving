package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int result = 0;
		int min = -1;
		boolean flag = false;
		for (int i = (int) Math.ceil(Math.sqrt(m)); i <= (int) Math.sqrt(n); i++) {
			result += i*i;
			if (!flag)
				min = i * i;
			flag = true;
		}
		if (flag) {
			System.out.println(result);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
}
