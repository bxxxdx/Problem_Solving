package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_16953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int A = Integer.parseInt(temp[0]);
		int B = Integer.parseInt(temp[1]);
		int count = 1;
		boolean flag = true;
		while (flag) {
			if (B % 10 == 1 && B > A) {
				B /= 10;
				count++;
			} else if (B > A && B % 2 == 0) {
				B /= 2;
				count++;
			} else {
				flag = false;
			}
			if (A == B) {
				break;
			}
		}
		if (flag)
			System.out.println(count);
		else
			System.out.println(-1);
	}
}
