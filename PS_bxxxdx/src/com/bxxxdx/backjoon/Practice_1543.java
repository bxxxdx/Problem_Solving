package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		int i = 0;
		int result = 0;
		while (i + str2.length() <= str1.length()) {
			if(str2.equals(str1.substring(i,i+str2.length()))) {
				result++;
				//System.out.println(i + " / " + result + " / " + str1.substring(i,i+str2.length()));
				i += str2.length();
			} else {
				i++;
			}
		}
		System.out.println(result);
	}
}
