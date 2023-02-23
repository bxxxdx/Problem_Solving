package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_24416 {
	
	static int[] arr;
	static int recurCount = 0;
	static int dpCount = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[41];
		fib(n);
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3;i<=n;i++) {
			dpCount++;
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(recurCount + " " + dpCount);
	}
	
	static int fib(int n) {
		if(n == 1 || n == 2) {
			recurCount++;
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
}
