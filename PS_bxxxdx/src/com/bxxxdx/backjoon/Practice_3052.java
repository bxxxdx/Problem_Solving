//모르겠다 싀발

package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arrRest[] = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			int count = 0;
			for(int j=i;j<10;j++) {
				if(arr[i]%42==arr[j]%42) {
					count++;
				}
			}
			arrRest[i]=count;
			
			
		}
		
	}

}
