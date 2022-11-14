package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuffer msg = new StringBuffer();		
		while(true) {
			str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			msg.append(checking(str)?"yes":"no").append("\n");	
		} 
		System.out.println(msg);
	}

	public static boolean checking(String str) {
		Stack<Character> stk = new Stack<Character>();
		boolean ret = true;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '[') {
				stk.push(c);
			}
			else if(c == ')') {
				if(!stk.isEmpty() && stk.peek() == '(') {
					stk.pop();
				}
				else {
					ret = false;
					break;
				}
			}
			else if(c == ']') {
				if(!stk.isEmpty() && stk.peek() == '[') {
					stk.pop();
				}
				else {
					ret = false;
					break;
				}			
			}		
		}
		if(!stk.isEmpty()) {
			ret = false;
		}
		return ret;
	}
}
