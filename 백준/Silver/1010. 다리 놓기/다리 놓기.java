import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] inputs = br.readLine().split(" ");

            int N = Integer.parseInt(inputs[0]);
            int M = Integer.parseInt(inputs[1]);

            BigInteger ans = BigInteger.ONE;
            for (int j = 1; j <= N ; j++) {
                ans = ans.multiply(BigInteger.valueOf(M-j+1));
                ans = ans.divide(BigInteger.valueOf(j));
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}