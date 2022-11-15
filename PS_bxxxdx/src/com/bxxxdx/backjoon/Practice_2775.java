package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2775 {
	//런타임에러 .. 진짜 왜 안되는지 몰겠다..
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();

		int[][] arr = new int[14][14];
		for(int i=0;i<14;i++) {
			arr[i][0] = 1;
			arr[0][i] = i+1;
		}
		for (int i = 1; i < 14; i++) {
			for (int j = 1; j < 14; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int i=0;i<N;i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());			
			sb.append(arr[k][n-1] + "\n");
		}
		System.out.println(sb);		
	}
}
