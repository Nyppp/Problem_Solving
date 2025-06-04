import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                list.remove(list.size()-1);
            }else{
                list.add(input);
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        sb.append(sum);
        System.out.println(sb);
    }
}