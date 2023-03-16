package com.test.monitorLab;

public class Test_03 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };

		System.out.println(solution(10, arr));
	}

	public static int solution(int n, int[] v) {
		int answer = -1;

		int maxPrice = v[0];
		int temp;
		for (int i = 1; i < n; i++) {
			temp = maxPrice - v[i];
			if (temp > answer) {
				answer = temp;
			}
			if (v[i] > maxPrice) {
				maxPrice = v[i];
			}
		}
		return answer;
	}
}
