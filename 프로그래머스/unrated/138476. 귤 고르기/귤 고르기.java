import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i] , 0) + 1);
        }
        int[] arr = new int[map.size()];
        Iterator it = map.keySet().iterator();
        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(it.next());
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            k -= arr[i];
            answer++;
            if(k <= 0)
                break;
        }
        return answer;
    }
}