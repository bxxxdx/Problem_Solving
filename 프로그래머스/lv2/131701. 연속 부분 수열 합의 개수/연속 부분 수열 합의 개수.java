import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet();
        for(int i=1;i<=elements.length;i++){
            //System.out.println("i : " + i);
            for(int j=0; j<elements.length; j++){
                int sum = 0;
                //System.out.println("j : " + j);
                for(int k=j; k<i+j; k++){
                    sum += elements[(k) % elements.length];
                    //System.out.println(k);
                }
                set.add(sum);
            }
        }
        //System.out.println(set);
        return set.size();
    }
}