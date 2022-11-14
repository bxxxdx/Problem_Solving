package com.bxxxdx.backjoon;
import java.util.Scanner;
public class Practice_1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int k=1;
		int index = 0;
		int sum = 0;
		for(int i=1;i<=45;i++) {
			for(int j=1;j<=i;j++) {
				index++;
				if(index >= input1 && index <= input2) {
					sum += k;
					System.out.print(k);
				}
				else if(index > input2) {
					break;
				}
			}
			k++;
			System.out.println();
			if(index > input2) {
				break;
			}
		}
		System.out.println(sum);
		
	}

}
