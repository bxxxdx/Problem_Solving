package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sugar = input-input/5*5;
		int fiveBox = input/5;
		int fiveRemainder = sugar%5;
		int threeBox = sugar/3;
		int threeRemainder = sugar%3;
		while(fiveRemainder != 0 && threeRemainder != 0 && fiveBox>=0) {
			fiveBox--;
			sugar+=5;
			threeBox = sugar/3;
			threeRemainder = sugar%3;
		}
		int boxes = fiveBox + threeBox;
		if(fiveBox<0) {
			boxes = -1;
		}
		System.out.println(boxes);
		
		
		
		
		
	}

}
