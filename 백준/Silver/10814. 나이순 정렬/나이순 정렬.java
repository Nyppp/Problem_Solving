import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1Age = Integer.parseInt(o1.split(" ")[0]);
                int o2Age = Integer.parseInt(o2.split(" ")[0]);
                return o1Age - o2Age;
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(strs[i] + "\n");
        }

        System.out.println(sb);
    }
}