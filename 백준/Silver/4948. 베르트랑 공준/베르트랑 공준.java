import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> inputs = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            } else {
                inputs.add(num);
                if (num > maxNum) {
                    maxNum = num;
                }
            }
        }

        boolean[] isPrime = new boolean[(2 * maxNum) + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i < inputs.size(); i++) {
            int primeCount = 0;
            for (int j = inputs.get(i)+1; j <= inputs.get(i) * 2; j++) {
                if (j == 1) {
                    continue;
                }

                if (isPrime[j]) {
                    primeCount++;
                }
            }
            sb.append(primeCount + "\n");
        }

        System.out.println(sb);
    }
}