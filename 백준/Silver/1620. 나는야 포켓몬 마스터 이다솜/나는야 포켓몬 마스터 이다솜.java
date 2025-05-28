import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);


        Map<String, String> map = new HashMap<>();
        String[] strs = new String[N+1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, Integer.toString(i));
            strs[i] = name;
        }
        
        for (int i = 1; i <= M; i++) {
            String input = br.readLine();

            if(map.containsKey(input)){
                sb.append(map.get(input) + "\n");
            }else{
                sb.append(strs[Integer.parseInt(input)] + "\n");
            }
        }
        System.out.println(sb);
    }
}