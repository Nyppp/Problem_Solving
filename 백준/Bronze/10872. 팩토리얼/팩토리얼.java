import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        long ans = 1;

        for (int i = 1; i <= N ; i++) {
            ans *= i;
        }
        sb.append(ans);
        
        System.out.println(sb);
    }
}