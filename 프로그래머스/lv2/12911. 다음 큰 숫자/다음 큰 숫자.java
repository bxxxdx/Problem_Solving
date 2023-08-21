class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCount = Integer.toBinaryString(n).replace("0","").length();
        //System.out.println(oneCount);
        int num = n + 1;
        while(true){
           int temp = Integer.toBinaryString(num).replace("0","").length();
           if(temp == oneCount){
               answer = num;
               break;
           } 
           num++;
        }
        return answer;
    }
}