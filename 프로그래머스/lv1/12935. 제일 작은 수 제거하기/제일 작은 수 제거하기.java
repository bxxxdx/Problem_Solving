class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length > 1){
            answer = new int[arr.length-1];
            int minIndex = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[minIndex] > arr[i])
                    minIndex = i;
            }
            for(int i=0;i<answer.length;i++){
                if(i < minIndex){
                    answer[i] = arr[i];
                } else{
                    answer[i] = arr[i+1];
                }
            }
        }
        else {
            answer = new int[1];
            answer[0] = -1;
        } 
        return answer;
    }
}