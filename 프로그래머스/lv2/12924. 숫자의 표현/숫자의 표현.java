class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n/2;i++){
            int sum = 0;
            int idx = i;
            while(sum < n){
                sum += idx++;
            }
            if(sum == n){
                answer++;
            }
        }

        return ++answer;
    }
}