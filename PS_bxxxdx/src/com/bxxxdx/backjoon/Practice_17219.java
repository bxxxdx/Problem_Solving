package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
//-106
public class Practice_17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);

		Map<String, String> map = new HashMap();
		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			map.put(temp[0], temp[1]);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}

}
