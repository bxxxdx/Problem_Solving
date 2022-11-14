package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Practice_2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList();
		for(int i = 0; i< N; i++) {
			q.add(i+1);
		}
		while(q.size() > 1) {
			q.poll();
			if(q.size() == 1) {
				break;
			}
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}
