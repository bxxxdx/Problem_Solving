package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Practice_11286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int ret = 0;
				if (Math.abs(o1) == Math.abs(o2)) {
					ret = o1 - o2;
				} else {
					ret = Math.abs(o1) - Math.abs(o2);
				}
				return ret;
			}
		});
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (!pq.isEmpty())
					sb.append(pq.poll()).append("\n");
				else
					sb.append("0\n");
			}
			else {
				pq.add(x);
			}
		}
		System.out.println(sb);
	}
	
}
