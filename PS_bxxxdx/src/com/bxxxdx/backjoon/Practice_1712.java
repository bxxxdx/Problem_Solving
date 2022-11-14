package com.bxxxdx.backjoon;

import java.util.Scanner;

public class Practice_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ea = 0;
		int ans = -1;
//		while((A+B*ea)>=(C*ea)){
//			ea++;
//		}
//		if((A+B*ea)<(C*ea) && B<C) {
//			ans = ea;
//		}
//		System.out.println(ans);
		if(B>=C) {
			System.out.println(-1);
		}
		else {
			System.out.println(A/(C-B) + 1);
		}
			
	}
}
