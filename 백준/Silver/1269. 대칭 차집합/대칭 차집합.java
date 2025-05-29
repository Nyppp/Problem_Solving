import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int aCount = Integer.parseInt(s[0]);
        int bCount = Integer.parseInt(s[1]);

        Set<Integer> aSet = new HashSet<>();
        s = br.readLine().split(" ");
        for (int i = 0; i < aCount; i++) {
            aSet.add(Integer.parseInt(s[i]));
        }

        Set<Integer> bSet = new HashSet<>();
        s = br.readLine().split(" ");
        for (int i = 0; i < bCount; i++) {
            bSet.add(Integer.parseInt(s[i]));
        }

        Set<Integer> abSet = new HashSet<>(aSet);
        abSet.removeAll(bSet);

        Set<Integer> baSet = new HashSet<>(bSet);
        baSet.removeAll(aSet);

        sb.append(abSet.size() + baSet.size());

        System.out.println(sb);
    }
}