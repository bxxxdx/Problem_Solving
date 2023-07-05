import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet();
        char prev = words[0].charAt(0);
        for(int i=0;i<words.length;i++){
            if(!set.contains(words[i]) 
               && prev == words[i].charAt(0)){
                set.add(words[i]);
            } else {
                answer[0] = (i + 1) % n == 0 ? n : (i+1) %n;
                answer[1] = (int)Math.ceil((double)((i + 1) * 1.0) / n);
                break;
            }
            prev = words[i].charAt(words[i].length()-1);
        }
         
        System.out.println("Hello Java");

        return answer;
    }
}