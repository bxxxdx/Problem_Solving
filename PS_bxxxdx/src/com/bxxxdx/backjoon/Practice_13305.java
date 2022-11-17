package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] distanceTemp = br.readLine().split(" ");
		long[] distance = new long[N - 1];
		for (int i = 0; i < N - 1; i++) {
			distance[i] = Integer.parseInt(distanceTemp[i]);
		}

		String[] priceTemp = br.readLine().split(" ");
		long[] price = new long[N];
		for (int i = 0; i < N; i++) {
			price[i] = Integer.parseInt(priceTemp[i]);
		}

		long result = 0; // 총 금액
		int i = 0;
		while (i < N - 1) {
//			System.out.println("i : " + i);
			long dis = distance[i]; // 단위거리
  
			int j = i + 1;
			while (j < N) {
//				System.out.println("i : " + i + " / j : " + j);
				if (price[i] >= price[j] || j == N - 1) {
					result = result + price[i] * dis;
					i = j;
					break;
				} else if (price[i] < price[j]) {
					dis = dis + distance[j];
				}
				j++;
			}
		}
		System.out.println(result);
	}
}
