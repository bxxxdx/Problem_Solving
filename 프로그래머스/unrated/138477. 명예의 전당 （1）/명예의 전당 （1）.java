import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList();
        answer[0] = score[0];
        answer[1] = score[0] < score[1] ? score[0] : score[1];
        answer[2] = answer[1] < score[2] ? answer[1] : score[2];
        arr.add(score[0]);
        arr.add(score[1]);
        arr.add(score[2]);
        for(int i=3;i<score.length;i++){
            arr.add(score[i]);
            Collections.sort(arr, Collections.reverseOrder());
            answer[i] = k-1 < i ? arr.get(k-1) : arr.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}