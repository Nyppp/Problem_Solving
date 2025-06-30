import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Set<String> users = new HashSet<>();
        int helloCount = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.equals("ENTER")){
                helloCount += users.size();
                users.clear();
                continue;
            }
            users.add(input);
        }

        helloCount += users.size();

        sb.append(helloCount);

        System.out.println(sb);
    }
}