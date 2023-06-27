import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        //소수 구하기 false가 소수
        boolean[] pNums = new boolean[3001];
        for(int i=2;(i*i)<=pNums.length;i++){
            for(int j=i*2; j<pNums.length;j+=i){
                pNums[j] = true;
            }
        }
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int index = nums[i] + nums[j] + nums[k];
                    if(!pNums[index]) {
                        answer++;
                        System.out.println(i+j+k);
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(pNums));
        return answer;
    }
}