class Solution {
    public int solution(String s) {
        int answer = 0;
        char flag = s.charAt(0) == '+' ? '+' : (s.charAt(0) == '-' ? '-' : ' ');
        if(flag == '+' || flag == '-')
            s = s.substring(1, s.length());
        answer = Integer.parseInt(s);
        if(flag == '-')
            answer *= -1;
        return answer;
    }
}