package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int zeroCount = 0;
		int oneCount = 0;
		char pastState = S.charAt(0);
		char presentState = '0';
		for (int i = 1; i < S.length(); i++) {
			presentState = S.charAt(i);
			if(pastState == '0' && presentState == '1') {
				oneCount++;
			}
			else if(pastState == '1' && presentState == '0') {
				zeroCount++;
			}
			pastState = presentState;
		}
		int result = 0;
		if(zeroCount > oneCount) result = oneCount;
		else result = zeroCount;
		if((zeroCount == 1 && oneCount == 0)||(zeroCount == 0 && oneCount == 1)) result = 1;
		System.out.println(result);
	}
}
