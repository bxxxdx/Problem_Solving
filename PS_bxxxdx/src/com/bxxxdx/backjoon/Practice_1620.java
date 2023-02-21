package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		Map<String, Integer> map = new HashMap(); 
		Map<Integer, String> map2 = new HashMap();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			map.put(tmp, i+1);
			map2.put(i+1, tmp);
		}
		
		for (int i = 0; i < M; i++) {
			String tmp = br.readLine();
			if(tmp.charAt(0) >= '0' && tmp.charAt(0) <= '9') {
				sb.append(map2.get(Integer.parseInt(tmp))).append('\n');
			} else {
				sb.append(map.get(tmp)).append('\n');
			}
		}
		System.out.println(sb);

	}
}
