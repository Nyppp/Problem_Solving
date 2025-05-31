import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long[] inputs = new long[n];

        for (int i = 0; i < n; i++) {
            inputs[i] = Long.parseLong(br.readLine());
        }

        for (int i = 0; i < inputs.length ; i++) {
            long input = inputs[i];

            if(input <= 2){
                sb.append(2 + "\n");
                continue;
            }
            while (true) {
                boolean isPrime = true;
                for (long j = 2; j <= Math.sqrt(input); j++) {
                    if (input % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    sb.append(input + "\n");
                    break;
                }else{
                    input++;
                }
            }
        }

        System.out.println(sb);
    }
}