package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice_1026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strA = br.readLine().split(" ");
		String[] strB = br.readLine().split(" ");

		ArrayList<Integer> A = new ArrayList();
		ArrayList<Integer> B = new ArrayList();

		for (int i = 0; i < N; i++) {
			A.add(Integer.parseInt(strA[i]));
			B.add(Integer.parseInt(strB[i]));
		}
		Collections.sort(A, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});

		Collections.sort(B, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		int result = 0;
		for (int i = 0; i < N; i++) {
			result += A.get(i)*B.get(i);
		}
		System.out.println(result);

	}
}
