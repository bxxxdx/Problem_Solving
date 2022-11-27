package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Practice_1049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		
		int packageMin = Integer.MAX_VALUE;
		int eachMin = Integer.MAX_VALUE;
		for (int m = 0; m < M; m++) {
			temp = br.readLine().split(" ");
			if(Integer.parseInt(temp[0]) < packageMin) {
				packageMin = Integer.parseInt(temp[0]);
			}
			if(Integer.parseInt(temp[1]) < eachMin) {
				eachMin = Integer.parseInt(temp[1]);
			}
		}
		int cost = 0;
		if(packageMin <= eachMin*6) {
			cost += packageMin*(N/6);
			N -= (N/6)*6;
			if(N > 0) {
				if(packageMin <= eachMin * N) {
					cost += packageMin;
				}
				else {
					cost += eachMin*N;
				}
			}
		}else {
			cost += eachMin*N;
		}
		
		System.out.println(cost);
		
		
		

	}
}
