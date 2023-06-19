import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] tempString = Long.toString(n).split("");
        long[] tempLong = new long[tempString.length];
        for(int i=0;i<tempString.length;i++){
            tempLong[i] = Long.parseLong(tempString[i]);
        }
        Arrays.sort(tempLong);        
        for(int i = 0; i< tempLong.length; i++){
            answer = answer * 10 + tempLong[tempLong.length - i - 1];
        }
        return answer;
    }
}