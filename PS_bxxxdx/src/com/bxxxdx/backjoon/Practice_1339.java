package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//10 
//ABB
//BB
//BB
//BB
//BB
//BB
//BB
//BB
//BB
//BB
//일 경우 A=9, B=8을 넣으면 1780이 나오고 / A=8, B=9를 넣으면 1790이 나온다.
//고로 내 처음 식은 틀렸다..
public class Practice_1339 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] alpha = new int[26];
		for (int n = 0; n < N; n++) {
			String line = br.readLine();
			int num = (int) Math.pow(10, line.length()-1);
			for (int i = 0; i < line.length(); i++) {
				alpha['Z'-line.charAt(i)] += num;
				num /= 10;
			}
		}
		Arrays.sort(alpha);
		
		int result = 0;
		for(int i=25; i>=16; i--) {
			result += alpha[i]*(i-16);
		}
		System.out.println(result);
	}
}
