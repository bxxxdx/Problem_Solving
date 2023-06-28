import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<win_nums.length;i++){
            map.put(win_nums[i], win_nums[i]);
        }
        int count = 0;
        int zeroCount = 0;
        for(int i = 0;i<lottos.length;i++){
            if(map.containsKey(lottos[i]))
                count++;
            else if(lottos[i] == 0)
                zeroCount++;
        }
        if(count >= 2) {
            answer[1] = 7 - count;
            answer[0] = answer[1] - zeroCount;
        }
        else if(count == 1){
            answer[1] = 6;
            answer[0] = answer[1] - zeroCount;
        }
        else{
            answer[1] = 6;
            if(zeroCount > 0){
                zeroCount--;
            }
            answer[0] = answer[1] - zeroCount;
        }
        
        return answer;
    }
}