import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int answer = arr[arr.length-1];
        System.out.println(answer);
         while(true){
            boolean flag = true;
            for(int i=0;i<arr.length;i++){
                if(answer % arr[i] != 0){
                    flag = false;
                    answer++;
                    break;
                }
            }
            if(flag)
                break;
         }
        return answer;
    }
}