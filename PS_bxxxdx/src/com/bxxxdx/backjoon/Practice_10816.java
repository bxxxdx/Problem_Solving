package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Practice_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(temp, 0) + " ");
		}
		System.out.println(sb);
	}
}
