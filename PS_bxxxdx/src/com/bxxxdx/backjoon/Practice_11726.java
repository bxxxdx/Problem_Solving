package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		

		if (n == 1 || n == 2) {
			System.out.println(n == 1 ? 1 : 2);
		} else {
			long[] arr = new long[n+1];
			arr[0] = 1;
			arr[1] = 2;
			for (int i = 2; i <= n; i++) {
				arr[i] = (arr[i-2]%10007 + arr[i-1]%10007)%10007;
				//System.out.println("i : " + i + " / " + arr[i]);
			}
			System.out.println(arr[n-1]%10007);
		}
	}
}
