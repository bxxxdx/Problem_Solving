package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2447 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i%3 == 1 && j%3 ==1) {
					System.out.print(' ');
				}
				else {
					System.out.print('*');
				}	
			}
			System.out.println();
		}
		
		
	}
	
	public void recur(int x) {
		if(x >= 3) {
			recur(x/3);
			
		}
		else {
			
		}
		
		
	}
}
