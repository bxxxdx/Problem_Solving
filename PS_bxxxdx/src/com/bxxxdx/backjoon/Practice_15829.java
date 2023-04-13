package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Practice_15829 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] arr = new int[n];
		BigInteger result = new BigInteger("0");
		for(int i = 0; i < n ; i ++) {
			result = result.add(BigInteger.valueOf(str.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
		}
		result = result.remainder(BigInteger.valueOf(1234567891));
		System.out.println(result);
	}	
} 
