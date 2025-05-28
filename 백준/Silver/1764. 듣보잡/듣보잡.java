import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        Set<String> noListen = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            noListen.add(br.readLine());
        }

        Set<String> noSeen = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            noSeen.add(br.readLine());
        }

        noListen.retainAll(noSeen);
        sb.append(noListen.size() + "\n");
        for (String str : noListen){
            sb.append(str + "\n");
        }

        System.out.println(sb);
    }
}