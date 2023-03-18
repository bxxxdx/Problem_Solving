package com.test.windmeal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Windmeal_04 {

	static int n = 0;
	static List<Integer> list = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		for (int i = 0; i < m; i++) {
			temp = br.readLine().split(" ");
			int money = Integer.parseInt(temp[1]);
			switch (temp[0]) {
			case "deposit":
				deposit(money);
				break;
			case "pay":
				pay(money);
				break;
			case "reservation":
				reservation(money);
				break;
			}
		}
		System.out.println(n);
	}

	static void deposit(int num) {
		n += num;
		if (list.size() > 0) {
			int i = 0;
			while (true) {
				if (n >= list.get(i)) {
					n -= list.get(i);
					list.remove(i);
				} else {
					i++;
				}
				if (list.size() <= i)
					break;
			}
		}
	}

	static void pay(int num) {
		if (n >= num)
			n -= num;
	}

	static void reservation(int num) {
		if (list.size() > 0 || n < num) {
			list.add(num);
			int i = 0;
			while (true) {
				if (n >= list.get(i)) {
					n -= list.get(i);
					list.remove(i);
				} else {
					i++;
				}
				if (list.size() <= i)
					break;
			}
		} else {
			n -= num;
		}
	}
}
