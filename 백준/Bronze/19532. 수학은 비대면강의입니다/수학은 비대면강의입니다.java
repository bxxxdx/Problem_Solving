import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int c = Integer.parseInt(temp[2]);
        int d = Integer.parseInt(temp[3]);
        int e = Integer.parseInt(temp[4]);
        int f = Integer.parseInt(temp[5]);
        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                if(a*i + b*j  == c){ 
                    if(d*i + e*j  == f) { 
                        System.out.print(i + " " + j);
                        break;
                    }
                }
            }
        }
    }
}
