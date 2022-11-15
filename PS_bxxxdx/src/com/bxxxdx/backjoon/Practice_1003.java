package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice_1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int[] zeroArr = new int[41];
		int[] oneArr = new int[41];
		zeroArr[0] = 1;
		zeroArr[1] = 0;
		oneArr[0] = 0;
		oneArr[1] = 1;
		
		for(int i=2; i<41; i++) {
			zeroArr[i] = zeroArr[i-1] + zeroArr[i-2];
			oneArr[i] = oneArr[i-1] + oneArr[i-2];
		}
		
		
		for(int i=0;i<N;i++) {
			int input = Integer.parseInt(br.readLine());
			sb.append(zeroArr[input] + " " + oneArr[input] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	

}
