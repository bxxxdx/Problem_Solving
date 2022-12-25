package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int hour = Integer.parseInt(temp[0]);
		int minute = Integer.parseInt(temp[1]);
		int time = Integer.parseInt(br.readLine());
		
		minute += time;
		if(minute >= 60) {
			hour += minute / 60;
			minute -= minute / 60 * 60;
			if(hour >= 24) {
				hour -= 24;
			}
		}
		System.out.println(hour + " " + minute);
		
	}
}
