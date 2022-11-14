package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_1302 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> m = new HashMap();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if(m.containsKey(s)) {
				m.put(s,m.get(s)+1);
			}
			else {
				m.put(s, 1);
			}
		}
		Set keys = m.keySet();
		Iterator it = keys.iterator();	
		int max = -1;
		String book;
		while(it.hasNext()) {
			book = (String)it.next();
			if(m.get(book) > max) {
				max = m.get(book);
			}
		}
		List<String> list = new ArrayList();
		Iterator it2 = keys.iterator();
		while(it2.hasNext()) {
			book = (String)it2.next();
			if(m.get(book) == max) {
				list.add(book);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
