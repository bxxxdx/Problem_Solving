import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] point = new int[N+1];
        for(int i=0;i<stages.length;i++){
            point[stages[i]-1]++;
        }
        double[][] result = new double[N][2];
        for(int i=0;i<N;i++){
            result[i][1] = i+1;
        }
        double temp = stages.length;
        for(int i=0;i<N;i++){
            result[i][0] = point[i] / temp;
            temp -= point[i];
            if(temp == 0){
                point[i+1] = 0; temp = 1;
            }
        }
        Arrays.sort(result, (o1, o2) -> {
            return o1[0] != o2[0] ? Double.compare(o2[0],o1[0]) : (int)(o1[1] - o2[1]); 
        });
        for(int i=0;i<N;i++){
            answer[i] = (int)result[i][1];
        }

        return answer;
    }
}