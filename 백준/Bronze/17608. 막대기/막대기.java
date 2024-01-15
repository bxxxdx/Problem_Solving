import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();

        for(int i = 0; i< n; i++){
            int temp = Integer.parseInt(br.readLine());
            stack.add(temp);
        }

        int max = stack.pop();
        int result = 1;

        while(stack.size() > 0){
            int temp = stack.pop();
            if(temp > max){
                result++;
                max = temp;
            }
        }

        System.out.print(result);

    }
}
