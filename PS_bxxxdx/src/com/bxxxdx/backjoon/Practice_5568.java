package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Practice_5568 {

	static String[] arr;
	static int n, k;
	static HashSet<String> ans = new HashSet();
	static boolean[] visit;

	static void recur(int cnt, String cur) {
		//System.out.println(cnt + " / " + cur);
		if (cnt == k) {
			ans.add(cur);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visit[i])
				continue;
			visit[i] = true;
			recur(cnt + 1, cur + arr[i]);
			visit[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		arr = new String[n];
		visit = new boolean[n];
		for (int i = 0; i < n; i++)
			arr[i] = br.readLine();

		recur(0, "");

		System.out.println(ans.size());
	}
}
