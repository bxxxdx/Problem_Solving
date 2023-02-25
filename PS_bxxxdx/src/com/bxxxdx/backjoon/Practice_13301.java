package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Practice_13301 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		BigInteger[] arr = new BigInteger[80];

		arr[0] = new BigInteger("4");
		if (n > 0)
			arr[1] = new BigInteger("6");
		for (int i = 2; i < 80; i++) {
			arr[i] = arr[i-1].add(arr[i-2]);
		}
		System.out.println(arr[n-1]);
	}
}
