package com.bxxxdx.backjoon;
import java.util.Scanner;
public class Practice_2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int smallNum = input1>input2?input2:input1;
		int lcm = -1; //최소공배수
		int gcd = -1; //최대공약수
		for(int i=2; i<=smallNum; i++) {
			if(input1%i == 0 && input2%i == 0) {
				gcd = i;
			}
		}
		for(int i=1; ; i++) {
			if((i*gcd)%input1==0 && (i*gcd)/input1>1 && (i*gcd)%input2==0 && (i*gcd)/input2>1) {
				lcm = i*gcd;
				break;
			}
		}
		System.out.println(gcd+"\n"+lcm);
	}

}
