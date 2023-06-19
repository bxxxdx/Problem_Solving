class Solution {
    public int solution(int n) {
        long num = (long)n;
        int answer = 0;
        while(true){
            if(num == 1 || answer >= 500){
                break;
            }
            if(num % 2 == 0)
                num = num / 2;
            else 
                num = num * 3 + 1;
            answer++;
        }
        return answer < 500 ? answer : -1;
    }
}