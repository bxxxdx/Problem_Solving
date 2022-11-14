package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_1065 {
	public static void main(String[] args) {
		//한수 구하기
		//1. 자릿수를 구한다.
		//2. 각 자릿수의 수를 비교해서 등차인지 확인한다.
		//한자리, 두자리일땐..? 그냥 한수처리하자
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		
		if(input < 100) {
			count = input;
		}
		else if(input>=100 && input<1000) {
			count = 99;
			for(int i=100;i<=input;i++) {
				int arr[] = new int[3];
				arr[0] = (i-i/1000*1000)/100; // 100의 자리 구하기
				arr[1] = (i-i/100*100)/10; // 10의 자리 구하기
				arr[2] = (i-i/10*10)/1; // 1의자리 구하기
				if((arr[0] - arr[1]) == (arr[1] - arr[2])) {
					count++;
				}			
			}	
		}
		else if(input == 1000) {
			count = 144;
		}
		System.out.println(count);
		
		
		
	}

}
