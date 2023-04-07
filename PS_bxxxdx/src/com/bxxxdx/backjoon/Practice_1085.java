package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int x = Integer.parseInt(temp[0]);
		int y = Integer.parseInt(temp[1]);
		int w = Integer.parseInt(temp[2]) - x;
		int h = Integer.parseInt(temp[3]) - y;
		
		int result = Math.min(x, Math.min(y, Math.min(w, h)));
		System.out.println(result);
		
	}
}
