package com.bxxxdx.backjoon;

import java.util.Scanner;
import java.util.Arrays;

public class Practice_2775 {
	//실패.. 어렵다 담에 다시하자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String ans = "";
		//int floor = 0;
		for(int i=0;i<testCase;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int floor[][] = new int[k][n];
			for(int j=0;j<n;j++) {
				floor[0][j] = j+1;
			}
			for(int l=1;l<k;l++) {
				for(int m=0;m<n;m++) {
					floor[l][m] = floor[l][m] + floor[l-1][m];
				}
			}
			System.out.println(Arrays.deepToString(floor));	
						
		}
	}

}
