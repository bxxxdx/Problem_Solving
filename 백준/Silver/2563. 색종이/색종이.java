import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[100][100];
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            for(int j=a;j<a+10;j++){
                for(int k=b;k<b+10;k++){
                    arr[j][k] = 1;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j] == 1)
                    ans++;
            }
        }

        System.out.println(ans);
    }
}
