package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Practice_1793 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger[] arr = new BigInteger[251];
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		arr[2] = new BigInteger("3");
		for (int i = 3; i < arr.length; i++) {
			BigInteger temp = new BigInteger("2");
			arr[i] = (arr[i - 1].add(arr[i - 2].multiply(temp)));
		}
		String input = "";
		while((input = br.readLine()) != null) {
			int n = Integer.parseInt(input);
			System.out.println(arr[n]);
		}
	}
}
