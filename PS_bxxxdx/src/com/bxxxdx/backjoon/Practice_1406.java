package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Practice_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int repeat = Integer.parseInt(br.readLine());

		Stack<Character> leftStack = new Stack<Character>();
		Stack<Character> rightStack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			leftStack.push(str.charAt(i));
		}
		for (int i = 0; i < repeat; i++) {
			str = br.readLine();
			char c = str.charAt(0);
			switch (c) {
			case 'L':
				if (!leftStack.isEmpty()) {
					rightStack.push(leftStack.pop());
				}
				break;
			case 'D':
				if (!rightStack.isEmpty()) {
					leftStack.push(rightStack.pop());
				}
				break;
			case 'B':
				if (!leftStack.isEmpty()) {
					leftStack.pop();
				}
				break;
			case 'P':
				char ch = str.charAt(2);
				leftStack.push(ch);
				break;
			default:
				break;
			}
		}
		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}
		while (!rightStack.isEmpty()) {
			bw.write(String.valueOf(rightStack.pop()));
		}
		bw.flush();
		bw.close();
	}

//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder initial = new StringBuilder(br.readLine());
//		int repeat = Integer.parseInt(br.readLine());
//		int cursor = initial.length();
//		LinkedList<Character> initialArray = new LinkedList<Character>();
//		for(int i=0;i<initial.length();i++) {
//			initialArray.add(initial.charAt(i));
//		}
//		for (int i = 0; i < repeat; i++) {
//			String s = br.readLine();
//			char c = s.charAt(0);
//			switch (c) {
//			case 'L':
//				if (cursor > 0) {
//					cursor--;
//				}
//				break;
//			case 'R':
//				if (cursor < s.length()) {
//					cursor++;
//				}
//				break;
//			case 'B':
//				if (cursor > 0) {
//					initialArray.remove(cursor-1);	
//					cursor--;
//				}
//				break;
//			case 'P':
//				char ch = s.charAt(2);
//				if (cursor <= initial.length()) {
//					initialArray.add(cursor, ch);	
//					cursor++;
//				}
//				break;
//			default:
//				break;
//			}	
//		}
//		initialArray.forEach(f->System.out.print(f));
//		System.out.println();
//	}
}
