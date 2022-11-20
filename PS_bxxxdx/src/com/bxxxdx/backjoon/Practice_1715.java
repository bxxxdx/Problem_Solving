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
		int b = pq.poll();
		int sumA = 0;
		int sumB = b;
		while(pq.peek()!=null) {
			a = b;
			b = pq.poll();
			sumA += (a+b);
			sumB += b;
			if(pq.size()>0) {
				pq.add(a+b);
			}
		}
		System.out.println(sumA + " " + sumB);
//		System.out.println(sumA+sumC);
	}
}
