import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] temp = new boolean[n];
        for(int i=0;i<section.length;i++){
            temp[section[i]-1] = true;
        }
        int flag = 0;
        for(int i=0;i<n;i++){
            if(temp[i]){
                flag = i + m;
                for(int j=i;j<i+m;j++){
                    temp[j] = false;
                    if(n-1 == j){
                        break;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}