package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] strArr = input.split("-");
//		System.out.println(strArr[0] + " / " + strArr[1] + " / " + strArr[2]);

		int result = 0;
		int num1 = 0;
		int num2 = 0;
		// 기준수 설정
		for (int i = 0; i < strArr[0].length(); i++) {
			char ch = strArr[0].charAt(i);
			if (ch >= '0' && ch <= '9') {
				num2 = num2 * 10 + (ch - '0');
			} else if (ch == '+') {
				num1 = num1 + num2;
				num2 = 0;
			}
		}
		num1 = num1 + num2;
		num2 = 0;
		result = num1;
//		System.out.println(num1 + " " + num2);

		for (int i = 1; i < strArr.length; i++) {
			num1 = 0;
			for (int j = 0; j < strArr[i].length(); j++) {
				char ch = strArr[i].charAt(j);
				if (ch >= '0' && ch <= '9') {
					num2 = num2 * 10 + (ch - '0');
				} else if (ch == '+') {
					num1 = num1 + num2;
					num2 = 0;
				}
			}
			num1 = num1 + num2;
			num2 = 0;
//			System.out.println(num1 + " " + num2);
			result -= num1;
		}

		System.out.println(result);
	}
}
