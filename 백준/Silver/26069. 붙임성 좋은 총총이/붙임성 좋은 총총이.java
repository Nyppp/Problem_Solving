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
        users.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if(users.contains(input[0]) || users.contains(input[1])){
                users.add(input[0]);
                users.add(input[1]);
            }
        }

        sb.append(users.size());
        System.out.println(sb);
    }
}