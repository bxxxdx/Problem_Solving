class Solution {
    public long[] solution(long n, long m) {
        long[] answer = new long[2];
        long max = n>m?n:m;
        long min = n<m?n:m;
        for(long i=max;i>=1;i--){
            if(max%i==0 && min%i==0){
                answer[0] = i;
                break;
            }
        }
        answer[1] = (n * m ) / answer[0];
        
        return answer;
    }
}