package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<String> arr = new ArrayList();
		for (int i = 0; i < N; i++) {
			arr.add(br.readLine() + " " + (i+1));
		}
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = 0;

				int n1 = Integer.parseInt(o1.split(" ")[0]);
				int n2 = Integer.parseInt(o2.split(" ")[0]);

				int rank1 = Integer.parseInt(o1.split(" ")[2]);
				int rank2 = Integer.parseInt(o2.split(" ")[2]);

				if (n1 > n2) {
					result = 1;
				} else if (n1 < n2) {
					result = -1;
				} else {
					if (rank1 > rank2) {
						result = 1;
					} else if (rank1 < rank2) {
						result = -1;
					}
				}

				return result;
			}
		});
		arr.stream().forEach(v -> System.out.println(v.split(" ")[0] + " " + v.split(" ")[1]));
	}

}
