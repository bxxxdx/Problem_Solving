class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i=1; i*i <= n; i++){
            if(i * i == n) answer = i;
        }
        
        if(answer == 0)
            answer = -1;
        else 
            answer = (answer + 1) * (answer + 1);
        
        return answer;
    }
}