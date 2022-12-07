package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice_1449 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int L = Integer.parseInt(temp[1]);

		List<Integer> list = new ArrayList();

		temp = br.readLine().split(" ");
		for (int i = 0; i < temp.length; i++) {
			list.add(Integer.parseInt(temp[i]));
		}
		Collections.sort(list);

		int index = 0;
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) - list.get(index) >= L) {
				count++;
				index = i;
			}
		}
		count++;

		System.out.println(count);
	}
}
