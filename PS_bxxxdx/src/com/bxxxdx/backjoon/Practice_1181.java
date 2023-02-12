package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<String> arr = new ArrayList();
		Map map = new HashMap();
		
		for(int i = 0; i<N;i++) {
			String str = br.readLine();
			if(!map.containsKey(str)) {
				map.put(str, str);
				arr.add(str);
			}
		}
		
		Collections.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		Collections.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		arr.stream().forEach(v->System.out.println(v));
	}
}
