package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_9461 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long[] arr = new long[101];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 2;
		arr[6] = 3;
		arr[7] = 4;
		arr[8] = 5;
		arr[9] = 7;
		arr[10] = 9;
		int idx = 6;
		for (int i = 11; i < 101; i++) {
			arr[i] = arr[idx] + arr[idx + 4];
			//System.out.println(idx + "zz " +arr[idx] + "  /  " + arr[idx+4]);
			idx++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(arr[Integer.parseInt(br.readLine())]).append('\n');
		}
		System.out.println(sb);
	}
}
