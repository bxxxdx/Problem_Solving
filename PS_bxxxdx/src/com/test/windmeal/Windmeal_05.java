package com.test.windmeal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Windmeal_05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		Integer n = Integer.parseInt(temp[0]);
		Integer k = Integer.parseInt(temp[1]) - 1;
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(i + 1);
		}
		while (list.size() > 2) {
			int index = k % (list.size() - 1);
			System.out.println(k + " / " + index);
			//System.out.println(index + " / " + list.get(index));
			list.remove(index);
			System.out.println(list);
			System.out.println();
			k++;
		}
		System.out.println(list.get(0) + " " + list.get(1));
	}
}
