package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_17202 {

	static Integer[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String phoneA = br.readLine();
		String phoneB = br.readLine();
		arr = new Integer[15][];
		for (int i = 0; i < 15; i++) {
			arr[i] = new Integer[16 - i];
		}
		for (int i = 0; i < 8; i++) {
			arr[0][2 * i] = (int) phoneA.charAt(i) - '0';
			arr[0][2 * i + 1] = (int) phoneB.charAt(i) - '0';
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 16 - i; j++) {
				arr[i][j] = (arr[i-1][j] + arr[i-1][j+1])%10;
			}
			//System.out.println(Arrays.toString(arr[i]));
		}

		
		System.out.println(arr[14][0] + "" + arr[14][1]);
	}


}
