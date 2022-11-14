package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Practice_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int K = Integer.parseInt(strs[1]);
		ArrayList<Integer> arr = new ArrayList();
		StringBuffer sb = new StringBuffer("<");
		for (int i = 0; i < N; i++) {
			arr.add(i + 1);
		}
		int idx = K - 1;
		for (int i = 0; i < N; i++) {
			sb.append(arr.get(idx));
			if (i < N - 1) {
				sb.append(", ");
			}
			arr.remove(idx);
			if (arr.size() >= 1) {
				idx = (idx + K-1) % arr.size();
			}
			else {
				idx = 0;
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
