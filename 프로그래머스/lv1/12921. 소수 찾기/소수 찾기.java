class Solution {
    public int solution(int n) {
        int answer = 0;
        //false가 소수
        boolean[] pNums = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            for(int j=i*2;j<=n;j+=i){
                pNums[j] = true;
            }
        }
        for(int i=2;i<=n;i++){
            if(!pNums[i]) answer++;
        }
        return answer;
    }
}