package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2670 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		double[] dp = new double[N];
		for (int i = 0; i < N; i++) {
			dp[i] = Double.parseDouble(br.readLine());
		}

		double result = dp[0];
		for (int i = 1; i < N; i++) {
			double num = dp[i];
			double max = dp[i];
			for (int j = i - 1; j >= 0; j--) {
				num = num * dp[j];
				max = Math.max(num, max);
				//System.out.println(i + " / " + j + " " + max);
			}
			result = Math.max(result, max);
		}
		System.out.println(String.format("%.3f",(double)Math.round(result*1000)/1000.0));
	}
}
