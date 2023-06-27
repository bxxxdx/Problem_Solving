import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0;i<photo.length;i++){
            Map<String,Integer> map = new HashMap();
            for(int j=0;j<name.length;j++){
                map.put(name[j], yearning[j]);
            }
            for(int j=0;j<photo[i].length;j++){
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
        }
        return answer;
    }
}