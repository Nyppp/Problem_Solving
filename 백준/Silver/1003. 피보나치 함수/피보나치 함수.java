import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, nums[i]);
        }

        if (max < 1){
            max = 1;
        }

        int[][] fibo = new int[max+1][2];

        fibo[0][0] = 1;
        fibo[0][1] = 0;

        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for (int i = 2; i <= max; i++) {
            fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
            fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
        }

        for (int i = 0; i < N; i++) {
            sb.append(fibo[nums[i]][0] + " "+ fibo[nums[i]][1] + "\n");
        }

        System.out.println(sb);
    }
}