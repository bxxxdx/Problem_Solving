package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());
		String str;
		String result = "";
		boolean flag = true;;
		Stack<Character> stack = null;
		for (int i = 0; i < input; i++) {
			str = br.readLine();
			stack = new Stack<Character>();
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					stack.push(str.charAt(j));
				}
				else if(str.charAt(j) == ')') {
					if(stack.empty()) {
						stack.push(str.charAt(j));
						flag = false;
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if (stack.empty()) {
				flag = true;
			} else {
				flag = false;
			}
			result += flag?"YES\n":"NO\n";
		}
		System.out.println(result);
	}
}
