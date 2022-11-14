package com.bxxxdx.backjoon;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Practice_1929 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		//int input1 = sc.nextInt();
		//int input2 = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int input1 = Integer.parseInt(st.nextToken());
		int input2 = Integer.parseInt(st.nextToken());
		String msg = "";

		for(int i=input1;i<=input2;i++) {
			int remainder = 0;
			for(int j=1;j<=i;j++) {
				if(i%j == 0) {
					remainder++;
				}
			}
			if(remainder == 2) {
				System.out.println(i);
				//msg += i + "\n";
			}
		}
		//System.out.println(msg);
	}
}
