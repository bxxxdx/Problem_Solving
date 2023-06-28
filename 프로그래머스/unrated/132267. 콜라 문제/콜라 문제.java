class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            int temp = n / a;
            if(temp == 0){
                break;
            }
            answer += temp * b;
            n = (temp * b) + (n % a);
        }
        return answer;
    }
}