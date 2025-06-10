import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        int coinCount = 0;

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(coins);

        while (K > 0){
            for (int i = coins.length-1; i >=0 ; i--) {
                while ( K >= coins[i]){
                    K -= coins[i];
                    coinCount++;
                }
            }
        }

        sb.append(coinCount);



        System.out.println(sb);
    }
}