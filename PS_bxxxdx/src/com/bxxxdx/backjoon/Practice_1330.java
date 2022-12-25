package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1330 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int num1 = Integer.parseInt(temp[0]);
		int num2 = Integer.parseInt(temp[1]);
		System.out.println(num1>num2?">":(num1<num2?"<":"=="));
	}
}
