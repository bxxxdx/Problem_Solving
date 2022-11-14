package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice_7785 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		Set<String> s = new HashSet();	
		for (int i = 0; i < n; i++) {
			String[] strs = br.readLine().split(" ");
			if(strs[1].equals("enter")){
				s.add(strs[0]);
			}
			else if(strs[1].equals("leave") && s.contains(strs[0])) {
				s.remove(strs[0]);
			}
		}	
		List<String> list = new ArrayList(s);
		Collections.sort(list, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});	
		list.forEach(f->System.out.println(f));
	}
}
