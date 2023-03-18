package com.test.windmeal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Windmeal_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(":");
		int n = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			temp = st.nextToken().split(":");
			arr[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
		}
		Arrays.sort(arr);
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(n < arr[i]) {
				result = arr[i];
				break;
			}
		}
		if(result != 0) {
			System.out.println(result - n);
		} else {
			System.out.println(1440 - n + arr[0]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
