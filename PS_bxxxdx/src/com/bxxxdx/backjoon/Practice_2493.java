package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice_2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}
		int[] ans = new int[N];
		Stack<Integer> s = new Stack<Integer>();
		s.push(N-1);
		for (int i = N-2; i >= 0 ; i++) {
			while(!s.isEmpty() && a[i] > a[s.peek()]) {
				s.push(i);
			}
			
			
			
			
			
			s.push(i);
		}
	}
}
