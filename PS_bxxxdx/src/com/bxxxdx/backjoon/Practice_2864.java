package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2864 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int[] temp = new int[2];
		
		temp[0] = Integer.parseInt(arr[0].replace('6', '5'));
		temp[1] = Integer.parseInt(arr[1].replace('6', '5'));
		int min = temp[0] + temp[1];
		
		temp[0] = Integer.parseInt(arr[0].replace('5', '6'));
		temp[1] = Integer.parseInt(arr[1].replace('5', '6'));
		int max = temp[0] + temp[1];
		
		System.out.println(min + " " + max);
	}
}
