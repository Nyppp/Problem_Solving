import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        int[] spots = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            spots[i] = Integer.parseInt(s[i]);
            list.add(spots[i]);
        }
        Collections.sort(list);

        int idx = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(!map.containsKey(list.get(i))) {
                map.put(list.get(i), idx);
                idx++;
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(spots[i]) + " ");
        }
        System.out.println(sb);
    }
}