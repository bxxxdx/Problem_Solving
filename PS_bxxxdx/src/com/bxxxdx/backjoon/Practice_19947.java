package com.bxxxdx.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_19947 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");

		int H = Integer.parseInt(temp[0]);
		int Y = Integer.parseInt(temp[1]);

		int dp[] = new int[11];
		// 초깃값 세팅
		dp[0] = H;
		if (Y > 0)
			dp[1] = (int) (H * 1.05);
		if (Y > 1)
			dp[2] = (int) ((int) (H * 1.05) * 1.05);
		if (Y > 2)
			dp[3] = (int) (H * 1.20);
		if (Y > 3)
			dp[4] = (int) (Math.max(dp[3] * 1.05, dp[1] * 1.20));
		if (Y > 4)
			dp[5] = (int) (H * 1.35);

		// 점화식 작성
		for (int i = 6; i <= Y; i++) {
			dp[i] = (int) (Math.max((dp[i - 1] * 1.05), Math.max((dp[i - 3] * 1.2), (dp[i - 5] * 1.35))));
		}

		System.out.println(dp[Y]);
	}
}
