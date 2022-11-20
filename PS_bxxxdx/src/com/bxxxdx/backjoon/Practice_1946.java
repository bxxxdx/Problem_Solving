package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_1946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String result = "";
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			List<int[]> arr = new ArrayList();
			for (int n = 0; n < N; n++) {
				String[] temp = br.readLine().split(" ");
				int[] insertTemp = new int[2];
				insertTemp[0] = Integer.parseInt(temp[0]);
				insertTemp[1] = Integer.parseInt(temp[1]);
				arr.add(insertTemp);
			}
			Collections.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return o1[0] - o2[0];
				}
			});
			
			int passCount = 1;
			int highRank = arr.get(0)[1];
			for (int i = 1; i < arr.size(); i++) {
				if(arr.get(i)[1] < highRank){
					highRank = arr.get(i)[1];
					passCount++;
				}
			}
			result += passCount + "\n";
//			for(int i=0;i<arr.size();i++) {
//				result+= arr.get(i)[0] + " " + arr.get(i)[1] + "\n";
//			}
		}
		System.out.println(result);
	}
}
