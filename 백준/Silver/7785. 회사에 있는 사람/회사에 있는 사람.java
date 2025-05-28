import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int ans = 0;

        int N = Integer.parseInt(br.readLine());

        Set<String> persons = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            if(str[1].equals("enter")){
                persons.add(str[0]);
            }else{
                persons.remove(str[0]);
            }
        }
        List<String> list = new ArrayList<>(persons);
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + "\n");
        }

        System.out.println(sb);
    }
}