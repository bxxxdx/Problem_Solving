import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int num1 = Integer.parseInt(temp[0]);
        int num2 = Integer.parseInt(temp[1]);

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        temp = br.readLine().split(" ");
        for(int i=0;i<num1;i++){
            int num = Integer.parseInt(temp[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        temp = br.readLine().split(" ");
        for(int i=0;i<num2;i++){
            int num = Integer.parseInt(temp[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //System.out.println(map);
        int ans = 0;
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            if(map.get((int)it.next()) == 1)
                ans++;
        }

        System.out.println(ans);
    }
}
