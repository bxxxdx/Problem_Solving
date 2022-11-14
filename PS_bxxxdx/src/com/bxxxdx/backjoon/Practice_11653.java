package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice_11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int input = Integer.parseInt(br.readLine());
		for (int i = 2; i <= input; i++) {
			while(true) {
				if(input % i == 0) {
					input = input/i;
					System.out.println(i);
				}
				else {
					break;
				}
			}
		}
	}
}
