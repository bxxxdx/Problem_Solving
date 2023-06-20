import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> temp = new ArrayList();
        temp.add(arr[0]);
        int j = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != temp.get(j)){
                temp.add(arr[i]);
                j++;
            }
        }

        return temp;
    }
}