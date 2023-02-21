package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//G5 to -113
public class Practice_1764{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		
		Map<String, String> map = new HashMap();
		for(int i=0;i<N;i++) {
			map.put(br.readLine(), " ");
		}
		StringBuilder sb = new StringBuilder();
		List<String> result = new ArrayList();
		for(int i=0;i<M;i++){
			String tmp = br.readLine();
			if(map.containsKey(tmp)) {
				result.add(tmp);
			}
		}
		Collections.sort(result);
		for(String s : result) {
			sb.append(s).append('\n');
		}
		System.out.println(result.size());
		System.out.println(sb);
	}
}















