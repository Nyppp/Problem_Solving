import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");

            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            int lcm = 0;

            for (int j = Math.min(A,B); j >= 1  ; j--) {
                if(A%j == 0 && B%j ==0){
                    lcm = A*B / j;
                    break;
                }
            }

            sb.append(lcm + "\n");
        }

        System.out.println(sb);
    }
}