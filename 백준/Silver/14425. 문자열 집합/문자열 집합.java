import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int ans = 0;

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        Set<String> nSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            if(nSet.contains(str)){
                ans++;
            }
        }

        sb.append(ans);
        System.out.println(sb);
    }
}