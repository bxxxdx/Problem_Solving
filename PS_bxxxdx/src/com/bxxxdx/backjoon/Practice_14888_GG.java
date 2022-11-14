package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_14888_GG {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		int[] arr = new int[N];
		for (int i = 0; i < strs.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		strs = br.readLine().split(" ");
		int[] operator = new int[4];
		for (int i = 0; i < operator.length; i++) {
			operator[i] = Integer.parseInt(strs[i]);
		}
		

		
	}
}
