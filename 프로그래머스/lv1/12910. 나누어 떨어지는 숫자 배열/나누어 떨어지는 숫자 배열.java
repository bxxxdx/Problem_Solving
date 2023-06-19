import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int len = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0)
                len++;
        }
        int[] answer = new int[len];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0)
                answer[j++] = arr[i];
        }
        if(len == 0){
            answer = new int[1];
            answer[0] = -1;
        } else {
            Arrays.sort(answer);
        }
        return answer;
    }
}