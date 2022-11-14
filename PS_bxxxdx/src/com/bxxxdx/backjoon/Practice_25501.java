package com.bxxxdx.backjoon;
import java.util.Scanner;

public class Practice_25501 {
	static int count = 0;
	static String msg = "";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0;i<input;i++) {
			String a = sc.next();
			isPalindrome(a);
			count = 0;
		}
		System.out.println(msg);
		
	}
	
	public static int recursion(String str, int l, int r) {
		count++;
		if(l>=r) {msg += "1 " + count + "\n"; return 1;}
		else if(str.charAt(l) != str.charAt(r)) {msg += "0 " + count+ "\n"; return 0;}
		else { return recursion(str, l+1, r-1); }	
	}
	public static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
	
}
	