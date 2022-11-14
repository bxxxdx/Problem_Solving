package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean odd = true;
		int front = 1;
		int back = 1;
		int count = 1;
		for(int i=2;i<=input;i++) {
			int j=1;
			while(j<i && count != input) {
				if(odd && front == 1) {
					back++;
				}
				else if(odd && front != 1) {
					front--;
					back++;
				}
				else if(!odd && back == 1){
					front++;
				}
				else if(!odd && back != 1) {
					front++;
					back--;
				}
				j++;	
				count++;
			}	
			if(count == input) {
				break;
			}
				
			odd = !odd;
		}
		System.out.println(front + "/" + back);	
		
	}

}
