class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pNum = Integer.parseInt(p);
        for(int i=0;i<t.length()-p.length()+1;i++){
            System.out.println(t.substring(i, i+p.length()));
            int tNum = Integer.parseInt(t.substring(i,i+p.length()));
            if(pNum < tNum){
                answer++;
            }
        }
        return answer;
    }
}