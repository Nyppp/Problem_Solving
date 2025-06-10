import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> cards = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(br.readLine()));
        }

        int ans = 0;

        if(cards.size() < 2){
            sb.append(0);
        }else{
            while(cards.size() > 1){
                int a = cards.poll();
                int b = cards.poll();

                ans += a+b;
                cards.add(a+b);
            }

            sb.append(ans);
        }
        System.out.println(sb);
    }
}