package com.test.monitorLab;

public class Test_01 {
	public static void main(String[] args) {
		solution("2220281");
	}
 
	public static String solution(String s) { 
		String answer = "";
		char[][] arr = { { ' ', ' ', ' ' }, { '.', 'Q', 'Z' }, { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' },
				{ 'J', 'K', 'L' }, { 'M', 'N', 'O' }, { 'P', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y' } };
		char prev = s.charAt(0);
		char current = s.charAt(0);
		int index = 0;
		char temp = ' ';
		int j = -1;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			prev = current;
			current = s.charAt(i);
			if (prev == current) {
				index = (int) (current - '0');
				temp = arr[index][++j];
				if (i == s.length() - 1) {
					result += Character.toString(temp);
				}
			} else if (prev != current && current != '0') {
				result += Character.toString(temp);
				index = (int) (current - '0');
				temp = arr[index][0];
				j = 0;
				if(i == s.length() - 1) {
					result += Character.toString(temp);
				}
			}
		}
		System.out.println(result);
		return answer;
	}

}
