class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] flags = new boolean[10];
        for(int i=0;i<numbers.length;i++){
           flags[numbers[i]] = true;
        }
        for(int i=0;i<10;i++){
            if(!flags[i])
                answer += i;
        }
        return answer;
    }
}