import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int[][] prop = new int[N][2];
        int[] values = new int[M+1];

        for (int i = 0; i < N; i++) {
            inputs = br.readLine().split(" ");

            prop[i][0] = Integer.parseInt(inputs[0]);
            prop[i][1] = Integer.parseInt(inputs[1]);
        }

        for (int i = 0; i < N; i++) {
            int propWeight = prop[i][0];
            int propValue = prop[i][1];
            for (int j = M; j >= propWeight ; j--) {
                values[j] = Math.max(values[j], values[j - propWeight] + propValue);
            }
        }

        sb.append(values[M]);
        System.out.println(sb);
    }
}