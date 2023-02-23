package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice_9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			Map<String, Integer> map = new HashMap();
			int N = Integer.parseInt(br.readLine());
			for (int j = 0; j < N; j++) {
				String[] temp = br.readLine().split(" ");
				if (map.containsKey(temp[1])) {
					map.put(temp[1], map.get(temp[1]) + 1);
				} else {
					map.put(temp[1], 1);
				}
			}
			int count = 1;
			Iterator it = map.keySet().iterator();
			while (it.hasNext()) {
				count *= map.get((String)it.next()) + 1;
			}
			sb.append(count - 1).append('\n');
		}
		System.out.println(sb);
	}

}
