import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap();
        for(int i=0; i<completion.length; i++){
            map.put(completion[i], map.getOrDefault(completion[i], 0) + 1);
        }
        for(int i=0;i<participant.length;i++){
            String temp = participant[i];
            if(map.containsKey(temp)){
                if(map.get(temp) > 1){
                    map.put(temp, map.get(temp) - 1);
                } else {
                    map.remove(temp);
                }
            } else {
                answer = temp;
                break;
            }
        }
        return answer;
    }
}