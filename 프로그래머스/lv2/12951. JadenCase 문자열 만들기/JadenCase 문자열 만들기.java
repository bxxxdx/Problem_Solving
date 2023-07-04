class Solution {
    public String solution(String s) {
        String answer = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        char prev = ' ';
        char current = ' ';
        for(int i=1;i<answer.length();i++){
            current = answer.charAt(i);
            prev = answer.charAt(i-1);
            if(prev == ' ' && current != ' ' && i+1 <s.length()){
                answer = answer.substring(0, i) + answer.substring(i, i+1).toUpperCase() + answer.substring(i+1).toLowerCase();
                System.out.println(answer);
            }
        }
        return answer;
    }
}