import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] distances = new int[N-1];

        for (int i = 1; i < N; i++) {
            distances[i-1] = (trees[i] - trees[i-1]);
        }

        int gcd = distances[0];
        for (int i = 0; i < distances.length-1; i++) {
            int A = gcd;
            int B = distances[i+1];

            while(B != 0){
                int tmp = A;
                A = B;
                B = tmp % B;
            }
            gcd = A;
        }

        int answer = 0;
        for (int i = 0; i < distances.length ; i++) {
            answer += (distances[i] / gcd) -1;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}