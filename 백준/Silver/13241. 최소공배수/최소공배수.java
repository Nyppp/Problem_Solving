import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");

        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);

        long ans = 0;

        for (long i = 1; i <= Math.min(A,B); i++) {
            long Amulti = A*i;
            long Bmulti = B*i;

            if(Amulti % B == 0){
                ans = Amulti;
                break;
            }

            if(Bmulti % A == 0){
                ans = Bmulti;
                break;
            }

        }

        sb.append(ans + "\n");
        System.out.println(sb);
    }
}