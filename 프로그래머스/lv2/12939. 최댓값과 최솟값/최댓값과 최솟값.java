class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            int temp = Integer.parseInt(arr[i]);
            max = temp > max ? temp : max;
            min = temp < min ? temp : min;
        }
        answer = min + " " + max;
        return answer;
    }
}