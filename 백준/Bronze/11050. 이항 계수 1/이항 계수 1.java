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
        int K = Integer.parseInt(inputs[1]);
        long ans = 1;

        for (int i = 1; i <= N ; i++) {
            ans *= i;
        }
        for (int i = 1; i <= (N - K) ; i++) {
            ans /= i;
        }
        for (int i = 1; i <= K ; i++) {
            ans /= i;
        }


        sb.append(ans);
        
        System.out.println(sb);
    }
}