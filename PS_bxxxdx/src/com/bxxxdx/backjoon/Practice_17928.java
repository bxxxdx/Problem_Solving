package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice_17928 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] arr = new int[input];
		int[] ans = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		for (int i = 0; i < input; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = i+1; j < input; j++) {
				if (arr[i] < arr[j]) {
					stack.push(arr[j]);
					break;
				}
			}
			if (!stack.isEmpty()) {
				ans[i] = stack.pop();
			} else {
				ans[i] = -1;
			}
		}
		for (int i : ans) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}
}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int input = Integer.parseInt(br.readLine());
//		int[] arr = new int[input];
//		Stack<Integer> leftStk = new Stack<Integer>();
//		Stack<Integer> rightStk = new Stack<Integer>();
//
//		String[] s = br.readLine().split(" ");
//		for (int i = 0; i < s.length; i++) {
//			arr[i] = Integer.parseInt(s[i]);
//			leftStk.push(Integer.parseInt(s[i]));
//		}
//		for (int i = 0; i < s.length; i++) {
//			int max = -1;
//			for (int j = s.length - 1; j > i; j--) {
//				if (arr[i] < arr[j]) {
//					max = arr[j];
//				}
//			}
//			arr[i] = max;
//		}
//		for (int i = 0; i < s.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//}
