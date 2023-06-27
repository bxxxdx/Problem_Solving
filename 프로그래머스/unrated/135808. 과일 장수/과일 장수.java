import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr, Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
        for(int i = m-1;i < score.length; i += m){
            answer += m * arr[i];
        }
        return answer;
    }
}