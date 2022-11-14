package com.bxxxdx.backjoon;
//import java.util.Arrays;
import java.util.Scanner;
public class Practice_2693 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr[][] = new int[input][10];
		for(int i=0;i<input;i++) {
			for(int j=0;j<10;j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		//System.out.println(Arrays.toString(arr[0]));
		for(int i=0;i<input;i++) {
			for(int j=0;j<10;j++) {
				int count = 0;
				for(int k=0;k<10;k++) {
					if(arr[i][k] > arr[i][j]) {
						count++;
					}
				}
				if(count == 2) {
					System.out.println(arr[i][j]);
					break;
				}
			}
		}
		
	
	}

}
