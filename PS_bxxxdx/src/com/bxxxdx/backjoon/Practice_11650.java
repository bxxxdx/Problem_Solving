package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<String> arr = new ArrayList();
		for (int i = 0; i < N; i++) {
			arr.add(br.readLine());
		}
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				int result = 0;

				int front1 = Integer.parseInt(o1.split(" ")[0]);
				int front2 = Integer.parseInt(o2.split(" ")[0]);
				if (front1 > front2) {
					result = 1;
				} else if (front1 < front2) {
					result = -1;
				} else {
					int back1 = Integer.parseInt(o1.split(" ")[1]);
					int back2 = Integer.parseInt(o2.split(" ")[1]);
					if (back1 > back2) {
						result = 1;
					} else if (back1 < back2) {
						result = -1;
					}
				}
				return result;
			}
		});
		arr.stream().forEach(v->System.out.println(v));
	}
}
