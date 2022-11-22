package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
//10 
//ABB
//BB
//BB
//BB
//BB
//BB
//BB
//BB
//BB
//BB
//일 경우 A=9, B=8을 넣으면 1780이 나오고 / A=8, B=9를 넣으면 1790이 나온다.
//고로 내 처음 식은 틀렸다..
public class Practice_1339 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][8];

		Map<Character, Integer> map = new HashMap();
		
		for (int n = 0; n < N; n++) {
			String str = br.readLine();
			int spaceLength = 8 - str.length();
			for (int i = 0; i < spaceLength; i++) {
				arr[n][i] = ' ';
			}
			for (int i = 0; i < str.length(); i++) {
				arr[n][i + spaceLength] = str.charAt(i);
			}
		}
		int insertCount = 9;
//		int [][] result = new int[N][8];
		int[] intResult = new int[N];
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < N; i++) {
				if(!map.containsKey(arr[i][j]) && arr[i][j] != ' ') {
					map.put(arr[i][j], insertCount--);
//					result[i][j] = map.get(arr[i][j]);
					intResult[i] = intResult[i] * 10 + map.get(arr[i][j]);
				}
				else if(map.containsKey(arr[i][j]) && arr[i][j] != ' ') {
//					result[i][j] = map.get(arr[i][j]);
					intResult[i] = intResult[i] * 10 + map.get(arr[i][j]);
				}
			}
		}
		int output = 0;
//		for(int i=0;i<result.length;i++) {
//			System.out.println(Arrays.toString(result[i]));
//		}
		for(int i=0;i<intResult.length;i++) {
			output += intResult[i];
		}
		System.out.println(output);
		

	}
}
