package com.bxxxdx.backjoon;
import java.util.Scanner;
public class Practice_10870_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(pibonacci(input));

	}
	public static int pibonacci(int x) {
		int sum;
		if(x==0) {
			sum=0;
		}
		else if(x==1) {
			sum=1;
		}
		else {
			sum = pibonacci(x-1) + pibonacci(x-2);
		}
		return sum;
	}
}
