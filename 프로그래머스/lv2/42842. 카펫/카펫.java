class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int width = yellow;
        int height = 1;
        for(int i=1;i<yellow;i++){
            height = i;
            if(yellow % height == 0){
                width = yellow / height;
                if(2 * (width + 2) + 2 * (height + 2) - 4 == brown){
                    break;
                }
            }
        }
        answer[0] = (width + 2);
        answer[1] = (height + 2);
        return answer;
    }
}