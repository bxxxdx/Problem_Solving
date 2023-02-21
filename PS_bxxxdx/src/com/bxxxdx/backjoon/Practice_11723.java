package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice_11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String temp = br.readLine();
			if (temp.equals("all")) {
				set = new HashSet<Integer>(
						Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
			} else if (temp.equals("empty")) {
				set.clear();
			} else {
				String command = temp.split(" ")[0];
				int num = Integer.parseInt(temp.split(" ")[1]);
				if (command.equals("add")) {
					set.add(num);
				} else if (command.equals("remove")) {
					set.remove(num);
				} else if (command.equals("check")) {
					if(set.contains(num)) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
				} else if (command.equals("toggle")) {
					if (set.contains(num)) {
						set.remove(num);
					} else {
						set.add(num);
					}
				}
			}
		}
		System.out.println(sb);
	}

}
