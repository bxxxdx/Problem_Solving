package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int day = 0;
		int distance = 0;
		for( ; ; ) {
			distance += a;
			day++;
			if(distance >= v) {
				break;
			}
			distance -= b;
			
		}
		System.out.println(day);

	}

}
