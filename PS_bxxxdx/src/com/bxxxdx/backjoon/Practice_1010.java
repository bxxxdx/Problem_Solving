package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_1010 {
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		

		arr = new int[31][31];
		for (int i = 1; i <= 30; i++) {
			arr[1][i] = i;
		}
		for (int i = 2; i <= 30; i++) {
			for (int j = i; j <= 30; j++) {
				for (int k = 0; k < j; k++) {
					arr[i][j] += arr[i - 1][k];
				}
			}
		}
		String[] temp;
		for (int i = 0; i < T; i++) {
			temp = br.readLine().split(" ");
			System.out.println(arr[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])]);
		}
		
	
	}
}
