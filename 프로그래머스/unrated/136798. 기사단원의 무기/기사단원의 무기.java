import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] temp = new int[number+1];
        for(int i = 1; i <= number; i++){
            for(int j=1;j * j<=i;j++){
                if(j * j == i)
                    temp[i]++;
                else if(i % j == 0)
                    temp[i] += 2;
            }
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i] <= limit)
                answer += temp[i];
            else 
                answer += power;
            //System.out.println(answer);
        }
        //System.out.println(Arrays.toString(temp));
        return answer;
    }
}