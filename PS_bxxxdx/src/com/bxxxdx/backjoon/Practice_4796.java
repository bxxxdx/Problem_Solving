package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4796 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int L = Integer.parseInt(str[0]);
		int P = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		int repeat = 1;
		String result = "";
		while(L != 0 && P != 0 && V != 0) {
			int count = 0;
			count += (V/P)*L;
			V = V - (V/P)*P;
			if(L < V) {
				count += L;
			}
			else {
				count += V;
			}
			result += "Case "+repeat+++": "+count + "\n";
			
			str = br.readLine().split(" ");
			L = Integer.parseInt(str[0]);
			P = Integer.parseInt(str[1]);
			V = Integer.parseInt(str[2]);
		}
		System.out.println(result);
	}
}
