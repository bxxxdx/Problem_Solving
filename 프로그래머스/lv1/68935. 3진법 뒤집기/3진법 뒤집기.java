class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n, 3);
        char[] chars = temp.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char ch = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = ch;
        }

        return Integer.parseInt(new String(chars), 3);
    }
}