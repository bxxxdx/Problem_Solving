class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i++);
            int xCount = 1;
            int yCount = 0;
            if(i == s.length()){
                answer++;
                break;
            }
            for(int j=i;j<s.length();j++){
                char temp = s.charAt(j);
                if(x == temp) xCount++;
                else yCount++;
                if(xCount == yCount || j == s.length() -1) {
                    i = j;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}