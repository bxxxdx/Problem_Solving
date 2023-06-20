class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        for(int i=0;i<strArr.length;i++){
            String[] temp = strArr[i].split("");
            for(int j=0;j<temp.length;j++){
                temp[j] = j%2==0?temp[j].toUpperCase():temp[j].toLowerCase();
                answer += temp[j];
            }
            answer += " ";
        }
        return answer.substring(0, answer.length()-1);
    }
}