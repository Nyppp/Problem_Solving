import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], '*');
        }


        divide(0,0,N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void divide(int x, int y, int size){
        int count = size / 3;

        for (int i = x+count; i < x + 2*count; i++) {
            for (int j = y+count; j < y+2*count ; j++) {
                arr[i][j] = ' ';
            }
        }

        if(count > 1){
            for (int i = 0; i < size/count; i++) {
                for (int j = 0; j < size/count ; j++) {
                    divide(x + (i*count) , y + (j*count), count);
                }
            }
        }
    }
}