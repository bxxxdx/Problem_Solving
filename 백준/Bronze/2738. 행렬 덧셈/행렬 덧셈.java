import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        int[][] arrA = new int[a][b];
        int[][] arrB = new int[a][b];
        int[][] ans = new int[a][b];

        for(int i=0;i<a; i++){
            temp = br.readLine().split(" ");
            for(int j=0; j<b; j++){
                arrA[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for(int i=0;i<a; i++){
            temp = br.readLine().split(" ");
            for(int j=0; j<b; j++){
                arrB[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for(int i=0;i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(arrA[i][j] + arrB[i][j] + " ");
            }
            System.out.println();
        }

    }
}
