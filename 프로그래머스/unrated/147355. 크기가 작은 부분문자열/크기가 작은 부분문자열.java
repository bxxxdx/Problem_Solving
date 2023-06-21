class Solution {
    public long solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        for(int i=0;i<t.length()-p.length()+1;i++){
            //System.out.println(t.substring(i, i+p.length()));
            long tNum = Long.parseLong(t.substring(i,i+p.length()));
            if(pNum >= tNum){
                answer++;
            }
        }
        return answer;
    }
}