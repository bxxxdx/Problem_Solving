class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] arr = {{4,2},
                         {1,1},{1,2},{1,3},
                         {2,1},{2,2},{2,3},
                         {3,1},{3,2},{3,3}};
        int[] left = {4,1};
        int[] right = {4,3};
        
        for(int i=0;i<numbers.length;i++){
            switch(numbers[i]){
                case 1:case 4: case 7:
                    answer += "L";
                    left = arr[numbers[i]];
                    break;
                case 3:case 6: case 9:
                    answer += "R";
                    right = arr[numbers[i]];
                    break;
                case 2:case 5:case 8:case 0:
                    int leftLength = Math.abs(arr[numbers[i]][0] - left[0]) + Math.abs(arr[numbers[i]][1] - left[1]);
                    int rightLength = Math.abs(arr[numbers[i]][0] - right[0]) + Math.abs(arr[numbers[i]][1] - right[1]);
                    System.out.println(leftLength + " " + rightLength);
                    if(leftLength < rightLength){
                        answer += "L";
                        left = arr[numbers[i]];
                    } else if(leftLength > rightLength){
                        answer += "R";
                        right = arr[numbers[i]];
                    } else if(hand.equals("right")){
                        answer += "R";
                        right = arr[numbers[i]];
                    } else {
                        answer += "L";
                        left = arr[numbers[i]];
                    }
                    break;
            }
        }
        return answer;
    }
}