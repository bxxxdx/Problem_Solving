package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Practice_1715 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (int n = 0; n < N; n++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		int a = 0;
		int b = 0;
		int temp = 0;
		int sum = 0;
		while(pq.peek() != null) {
			a = pq.poll();
			if(pq.peek() != null) {
				b = pq.poll();
				temp = a+b;
				pq.add(temp);
				sum += temp;
			}
		}
		System.out.println(sum);
	}
}
