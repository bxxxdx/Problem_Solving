import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<Integer, String> map = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        for(int i=0;i<players.length;i++){
            map.put(i, players[i]);
            map2.put(players[i], i);
        }
        for(int i=0;i<callings.length;i++){
            int rank = map2.get(callings[i]);
            String temp = map.get(rank);
            map2.put(map.get(rank-1), rank);
            map2.put(map.get(rank), rank-1);
            map.put(rank, map.get(rank-1));
            map.put(rank-1, temp);
        }
        for(int i=0;i<players.length;i++){
            answer[i] = map.get(i);
        }
        return answer;
    }
}