import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> mapX = new HashMap();
        Map<Character, Integer> mapY = new HashMap();
        for(int i=0;i<X.length();i++){
            mapX.put(X.charAt(i), mapX.getOrDefault(X.charAt(i) , 0) + 1);
        }
        for(int i=0;i<Y.length();i++){
            mapY.put(Y.charAt(i), mapY.getOrDefault(Y.charAt(i) , 0) + 1);
        }
        System.out.println(mapX.get('5'));
        System.out.println(mapY.get('5'));
        int count = 0;
        for(int i=0;i<10;i++){
            count += Math.min(mapX.getOrDefault((char)(i+'0'), 0), mapY.getOrDefault((char)(i+'0'), 0));
        }
        System.out.println(count);
        if(count == 0){
            return "-1";
        } else{
            char[] answer = new char[count];
            int k = 0;
            for(int i=9;i>=0;i--){
                int min = Math.min(mapX.getOrDefault((char)(i+'0'), 0), mapY.getOrDefault((char)(i+'0'), 0));
                for(int j=0;j<min;j++){
                    answer[k++] = (char)(i+'0');
                }
            }
            String last = new String(answer);
            if(last.charAt(0) == '0' && last.charAt(last.length()-1) == '0'){
                last = "0";
            }
            return last;
        }
    }
}