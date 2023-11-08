import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Set<String> set = new HashSet<String>();
        int num = 0;
        for(int i=0;i<input.length();i++){
            for(int j=0;j<input.length();j++){
                if(j+num >= input.length())
                    continue;
                //System.out.println(i + " / " + j + " / " +  input.substring(j,j+num+1));
                set.add(input.substring(j,j+num+1));
            }
            num++;
        }
        System.out.println(set.size());
    }
}
