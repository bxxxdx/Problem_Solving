package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class Practice_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int i=0;i<input;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0 && !stack.isEmpty()) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		Iterator it = stack.iterator();
		while(it.hasNext()) {
			sum += (Integer)it.next();
		}
		System.out.println(sum);
		
	}
}
