import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] cardCounts = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            cardCounts[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(cardCounts);

        int M = Integer.parseInt(br.readLine());
        s = br.readLine().split(" ");
        int[] cardNumbers = new int[M];
        for (int i = 0; i < M; i++) {
            cardNumbers[i] = Integer.parseInt(s[i]);
            if(Arrays.binarySearch(cardCounts, cardNumbers[i]) >= 0){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}