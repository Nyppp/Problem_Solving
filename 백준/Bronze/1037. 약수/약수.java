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

        String[] inputs = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            list.add(Integer.parseInt(inputs[i]));
        }

        Collections.sort(list);

        sb.append(list.get(0) * list.get(list.size()-1));

        System.out.println(sb);
    }
}