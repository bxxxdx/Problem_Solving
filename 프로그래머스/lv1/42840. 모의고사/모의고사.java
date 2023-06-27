import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> arr = new ArrayList();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int arr1Count = 0;
        int arr2Count = 0;
        int arr3Count = 0;
        int max = 0;
        for(int i=0;i<answers.length;i++){
            if(answers[i] == arr1[i % 5])
                arr1Count++;
            if(answers[i] == arr2[i % 8])
                arr2Count++;
            if(answers[i] == arr3[i % 10])
                arr3Count++;
            if(arr1Count > max) max = arr1Count;
            if(arr2Count > max) max = arr2Count;
            if(arr3Count > max) max = arr3Count;
        }
        if(arr1Count == max) arr.add(1);
        if(arr2Count == max) arr.add(2);
        if(arr3Count == max) arr.add(3);
        
        return arr;
    }
}