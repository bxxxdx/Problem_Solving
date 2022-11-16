package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_2217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> ropes = new ArrayList();
		for (int i = 0; i < N; i++) {
			ropes.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(ropes, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			if(ropes.get(i) * (i+1) > max) {
				max = ropes.get(i) * (i+1);
			}
		}
		System.out.println(max);
	}
}
