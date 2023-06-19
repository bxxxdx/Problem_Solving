class Solution {
    public int[] solution(long n) {
        String[] temp = Long.toString(n).split("");
        int[] answer = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            answer[answer.length - (i+1)] = temp[i].charAt(0) - '0';
        }
        return answer;
    }
}