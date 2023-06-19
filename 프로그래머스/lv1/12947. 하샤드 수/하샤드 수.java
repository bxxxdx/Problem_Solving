class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] temp = Integer.toString(x).split("");
        int sum = 0;
        for(int i = 0; i<temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }
        
        return x % sum == 0 ? true : false;
    }
}