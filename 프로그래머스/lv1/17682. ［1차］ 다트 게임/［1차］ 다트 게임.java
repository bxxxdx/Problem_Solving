import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int j = 0;
        List<Integer> arr = new ArrayList();
        for(int i=0;i<dartResult.length();i++){
            char temp = dartResult.charAt(i);
            char tempNext = ' ';
            if(i < dartResult.length() -1)
                tempNext = dartResult.charAt(i+1);
            j = arr.size() - 1;
            if(temp == '1' && tempNext == '0'){
                arr.add(10);
                i++;
            }
            else if(temp >= '0' && temp <= '9')
                arr.add((int)temp - '0');
            else if(temp == 'D')
                arr.set(j, arr.get(j) * arr.get(j));
            else if(temp == 'T')
                    arr.set(j, arr.get(j) * arr.get(j) * arr.get(j));
            else if(temp == '#')
                    arr.set(j, arr.get(j) * -1);
            else if(temp == '*') {
                for(int k = j; k >= j-1 && k >= 0; k--){
                    arr.set(k, arr.get(k) * 2);
                }
            } 
            System.out.println(arr.toString());
        }
        for(int i=0;i<arr.size();i++){
            answer += arr.get(i);
        }
        return answer;
    }
}