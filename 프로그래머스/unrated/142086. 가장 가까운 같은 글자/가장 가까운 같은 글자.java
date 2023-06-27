class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            int count = 0;
            boolean flag = false;
            for(int j=i-1;j>=0;j--){
                char temp2 = s.charAt(j);
                if(temp == temp2){
                    answer[i] = count;
                    flag = true;
                    break;
                }
                count++;
            }
            if(!flag)
                answer[i] = -1;
        }
        return answer;
    }
}