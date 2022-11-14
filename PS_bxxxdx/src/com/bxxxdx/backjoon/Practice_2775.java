package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2775 {
	//런타임에러
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader testCase = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(testCase.readLine());
		String result = "";
		for (int i = 0; i < N; i++) {
			BufferedReader floor = new BufferedReader(new InputStreamReader(System.in));
			int k = Integer.parseInt(floor.readLine());

			BufferedReader room = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(room.readLine());

			int[][] arr = new int[k + 1][n];
			for (int a = 0; a < k + 1; a++) {
				for (int b = 0; b < n; b++) {
					if(a==0) {
						arr[a][b] = b+1;
					}
					else {
						arr[a][b] = 0;
						for(int c = 0; c <= b ; c ++ ) {
							arr[a][b] += arr[a-1][c];
						}
					}
//					System.out.print(arr[a][b] + " " );
				}
			}
//			System.out.println(arr[k][n-1]);
			result += arr[k][n-1] + "\n";
		}
		System.out.println(result);
	}
}
