package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		List<Integer> arr = new ArrayList();
		for (int i = 0; i < strs.length; i++) {
			arr.add(Integer.parseInt(strs[i]));
		}
		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j <= i; j++) {
				sum += arr.get(j);
			}
		}
		System.out.println(sum);
	}
}
