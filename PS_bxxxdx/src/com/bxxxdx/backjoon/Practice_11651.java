package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] temp;
		List<Integer[]> arr = new ArrayList();
		for (int i = 0; i < n; i++) {
			temp = br.readLine().split(" ");
			Integer[] tempArr = new Integer[2];
			tempArr[0] = Integer.parseInt(temp[0]);
			tempArr[1] = Integer.parseInt(temp[1]);
			arr.add(tempArr);
		}
		Collections.sort(arr, new Comparator<>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				int result = 0;
				if (o1[1] < o2[1])
					result = -1;
				else if (o1[1] > o2[1])
					result = 1;
				else {
					if (o1[0] < o2[0])
						result = -1;
					else if (o1[0] > o2[0])
						result = 1;
					else
						result = 0;
				}
				return result;
			}
		});
		arr.stream().forEach(v->System.out.println(v[0] + " " + v[1]));
	}
}
