package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Practice_1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer[]> arr = new ArrayList();
		for (int i = 0; i < N; i++) {
			String[] tempStr = br.readLine().split(" ");
			Integer[] temp = new Integer[2];
			temp[0] = Integer.parseInt(tempStr[0]);
			temp[1] = Integer.parseInt(tempStr[1]);
			arr.add(temp);
		}
		Collections.sort(arr, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				int result = 0;
				if (o1[1] < o2[1]) {
					result = -1;
				} else if (o1[1] > o2[1]) {
					result = 1;
				} else if (o1[1] == o2[1]) {
					if (o1[0] < o2[0]) {
						result = -1;
					} else if (o1[0] > o2[0]) {
						result = 1;
					} else {
						result = 0;
					}
				}
				return result;
			}
		});
//		arr.forEach(v -> System.out.println(v[0] + " " + v[1]));

		int lastIndex = 0;
		int count = 1;
		for (int i = 1; i < arr.size() ; i++) {
			if(arr.get(i)[0] >= arr.get(lastIndex)[1]) {
				lastIndex = i;
				count++;
			}
		}
		System.out.println(count);
	}
}
