import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList(Arrays.asList(strings));
        Collections.sort(answer, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) == s2.charAt(n)){
                    return s1.compareTo(s2);
                } else {
                    return s1.charAt(n) - s2.charAt(n);
                }
            }
        });
        
        return answer.toArray(new String[answer.size()]);
    }
}