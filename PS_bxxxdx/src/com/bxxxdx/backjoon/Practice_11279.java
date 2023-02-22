package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Practice_11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();

			if (temp.equals("0")) {
				sb.append(pq.peek() != null ? pq.poll() : "0").append('\n');
			} else {
				pq.add(Integer.parseInt(temp));
			}
		}
		System.out.println(sb);
	}
}
