package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Practice_9507 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		BigInteger[] arr = new BigInteger[69];
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		arr[2] = new BigInteger("2");
		arr[3] = new BigInteger("4");
		for (int i = 4; i < 69; i++) {
			arr[i] = new BigInteger((arr[i - 1].add(arr[i - 2]).add(arr[i - 3]).add(arr[i - 4])).toString());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(arr[Integer.parseInt(br.readLine())]).append('\n');
		}
		System.out.println(sb);
	}
}
