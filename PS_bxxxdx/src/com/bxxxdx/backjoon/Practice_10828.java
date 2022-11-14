package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;
		Stack<Integer> stack = new Stack<Integer>();
		int input = Integer.parseInt(br.readLine());
		String result = "";
		for (int i = 0; i < input; i++) {
			str = br.readLine();
			if (str.equals("pop")) {
				if (stack.isEmpty()) {
					result += -1 + "\n";
				} else {
					result += stack.pop() + "\n";
				}
			} else if (str.equals("size")) {
				result += stack.size() + "\n";
			} else if (str.equals("empty")) {
				if (stack.isEmpty()) {
					result += 1 + "\n";
				} else {
					result += 0 + "\n";
				}
			} else if (str.equals("top")) {
				if (stack.isEmpty()) {
					result += -1 + "\n";
				} else {
					result += stack.peek() + "\n";
				}
			} else {
				String[] line = str.split(" ");
				if (line.length == 2 && line[0].equals("push")) {
					//result += stack.push(Integer.parseInt(line[1])) + "\n";
					stack.push(Integer.parseInt(line[1]));
				}
			}
		}
		System.out.println(result);
	}
}
