package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int index = 1;
		for(int j=0;j<9;j++) {
			if(arr[j] > max) {
				max = arr[j];
				index = j+1;
			}
		}
		System.out.println(max + "\n" + index);
		

	}

}
