package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Practice_10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new ArrayDeque();
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();

			if (temp.indexOf(" ") > 0) {
				int num = Integer.parseInt(temp.split(" ")[1]);
				deque.addLast(num);
			} else if (temp.equals("pop")) {
				if (deque.size() > 0) {
					System.out.println(deque.pollFirst());
				} else {
					System.out.println(-1);
				}
			} else if (temp.equals("size")) {
				System.out.println(deque.size());
			} else if (temp.equals("empty")) {
				System.out.println(deque.isEmpty() ? "1" : "0");
			} else if (temp.equals("front")) {
				if (deque.size() > 0) {
					System.out.println(deque.peekFirst());
				} else {
					System.out.println(-1);
				}
			} else if (temp.equals("back")) {
				if (deque.size() > 0) {
					System.out.println(deque.peekLast());
				} else {
					System.out.println(-1);
				}
			}

		}
	}

}
