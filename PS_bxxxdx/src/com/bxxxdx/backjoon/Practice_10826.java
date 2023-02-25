package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Practice_10826 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		BigInteger[] arr = new BigInteger[n + 1];

		arr[0] = new BigInteger("0");
		if (n > 0)
			arr[1] = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i-1].add(arr[i-2]);
		}
		System.out.println(arr[n]);
	}
}
