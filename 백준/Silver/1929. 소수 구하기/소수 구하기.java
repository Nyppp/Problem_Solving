import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputs = br.readLine().split(" ");
        int M = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);

        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= N; i++) {
            if(isPrime[i]){
                for (int j = i+i; j <= N; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if(isPrime[i] && i > 1){
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}