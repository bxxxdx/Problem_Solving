package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int front = 0;
		front += (input[0].charAt(2)-'0') * 100;
		front += (input[0].charAt(1)-'0') * 10;
		front += (input[0].charAt(0)-'0') * 1;
		
		int back = 0;
		back += (input[1].charAt(2)-'0') * 100;
		back += (input[1].charAt(1)-'0') * 10;
		back += (input[1].charAt(0)-'0') * 1;
		
		System.out.println(front>back?front:back);
	}
}
