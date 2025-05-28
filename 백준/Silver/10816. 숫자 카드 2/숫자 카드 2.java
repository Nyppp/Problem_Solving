import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(s[i]);
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        s = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(s[i]);
            if(map.containsKey(num)) {
                sb.append(map.get(num) + " ");
            }else{
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
}