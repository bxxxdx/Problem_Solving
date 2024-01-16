import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        List<Integer> list = new ArrayList();

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(temp[i]), i+1);
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }


    }
}
