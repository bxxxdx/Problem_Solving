package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Practice_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int[] arr = new int[input];
		int[] arr2 = new int[input];
		int j=1;
		StringBuffer sb = new StringBuffer();
		int stackNum = 1;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<input;i++) { //i : 배열의 인덱스
			int num = Integer.parseInt(br.readLine());
			arr2[i] = num;
			while(true) {
				if(stackNum < num) {
					stack.push(stackNum++);
					sb.append("+\n");
				}
				else if(stackNum == num) {
					stack.push(stackNum++);
					sb.append("+\n");
					arr[i] = stack.pop();
					sb.append("-\n");
					break;
				}
				else {
					arr[i] = stack.pop();
					sb.append("-\n");
					break;
				}
				
			}
		}
		if(Arrays.equals(arr, arr2))
		System.out.println(sb);
		else
		System.out.println("NO");
	}
}
