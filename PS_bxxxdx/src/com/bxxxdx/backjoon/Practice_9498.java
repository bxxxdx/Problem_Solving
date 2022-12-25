package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_9498 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		String result = "";
		if(90 <= score && score <= 100) {
			result = "A";
		} else if (80 <= score && score < 90) {
			result = "B";
		} else if (70 <= score && score < 80) {
			result = "C";
		} else if (60 <= score && score < 70) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println(result);
	}
}
