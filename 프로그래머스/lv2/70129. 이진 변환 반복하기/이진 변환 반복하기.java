class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            int zeroCount = 0;
            int afterZeroCount = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '0'){
                    zeroCount++;
                }
            }
            afterZeroCount = s.length() - zeroCount;
            answer[1] += zeroCount;
            s = Integer.toBinaryString(afterZeroCount);
            answer[0]++;
        }
        return answer;
    }
}