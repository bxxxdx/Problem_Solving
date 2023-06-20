import java.util.*;

class Solution {
    public String solution(String s, int n) {
        char[] temp = s.toCharArray();
        for(int i=0;i<temp.length;i++){
            if('a' <= temp[i] && temp[i] <= 'z'){
                if('a' <= temp[i] + n && temp[i] + n <= 'z'){
                    temp[i] = (char)((int)temp[i] + n);
                } else {
                    temp[i] = (char)((int)temp[i] + n - 26);
                }
            } else if('A' <= temp[i] && temp[i] <= 'Z'){
                if('A' <= temp[i] + n && temp[i] + n <= 'Z'){
                    temp[i] = (char)((int)temp[i] + n);
                } else {
                    temp[i] = (char)((int)temp[i] + n - 26);
                }
            } 
        }
        return new String(temp);
    }
}