package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Practice_5397_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split("");
			List<String> list = new LinkedList();
			int idx = 0;
			for (int j = 0; j < s.length; j++) {
				switch(s[j]) {
				case "<": if(idx > 0) idx--; break;
				case ">": if(idx < list.size()) idx++; 	 break;
				case "-": if(idx > 0 && idx <= list.size()) list.remove(idx-1); break;
				default: list.add(idx, s[j]); idx++; break;
				}
			}
			//list.forEach(f->sb.append(f));
			list.forEach(f->{
				try {
					bw.write(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
