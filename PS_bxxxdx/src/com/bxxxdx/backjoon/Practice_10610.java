package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		List<Character> arr = new ArrayList();
		boolean zeroFlag = false;
		int sum = 0;
		for(int i=0;i<temp.length();i++) {
			arr.add(temp.charAt(i));
			sum = sum + (temp.charAt(i) - '0');
			if(temp.charAt(i) == '0') {
				zeroFlag = true;
			}
		}
		Collections.sort(arr, new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		if(sum%3==0 && zeroFlag) {
			arr.forEach(v->System.out.print(v));
		}
		else {
			System.out.println(-1);
		}

		
		
		
	}

}
