import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Stack<String> stack1 = new Stack();
        for(int i=cards1.length-1;i >= 0;i--){
            stack1.push(cards1[i]);
        }
        Stack<String> stack2 = new Stack();
        for(int i=cards2.length-1;i >= 0;i--){
            stack2.push(cards2[i]);
        }
        boolean flag = true;
        for(int i=0;i<goal.length;i++){
            if(!stack1.empty() && goal[i].equals(stack1.peek())){
                stack1.pop();
            } else if(!stack2.empty() && goal[i].equals(stack2.peek())){
                stack2.pop();
            } else {
                flag = false;
                break;
            }
        }
        return flag ? "Yes" : "No";
    }
}