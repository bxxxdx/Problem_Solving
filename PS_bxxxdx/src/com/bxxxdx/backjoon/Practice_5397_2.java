package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Practice_5397_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			Stack<Character> frontstk = new Stack();
			Stack<Character> backstk = new Stack();
			for (int j = 0; j < s.length(); j++) {
				switch(s.charAt(j)) {
				case '<': 
					if(!frontstk.isEmpty()) backstk.push(frontstk.pop());
					break;
				case '>':
					if(!backstk.isEmpty()) frontstk.push(backstk.pop());
					break;
				case '-':
					if(!frontstk.isEmpty()) frontstk.pop();
					break;
				default :
					frontstk.push(s.charAt(j));
					break;			
				}
			}
			while(!frontstk.isEmpty()) {
				backstk.push(frontstk.pop());
			}
			while(!backstk.isEmpty()) {
				bw.write(backstk.pop());
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
