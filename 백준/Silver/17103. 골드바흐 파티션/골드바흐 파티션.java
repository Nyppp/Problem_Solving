import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int maxNum = Integer.MIN_VALUE;

        int[] inputs = new int[T];
        for (int i = 0; i < T; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            if (inputs[i] > maxNum) {
                maxNum = inputs[i];
            }
        }

        boolean[] isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= maxNum; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j <= maxNum; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        isPrime[1] = false;

        List<Integer> primeList = new ArrayList<>();
        List<Integer> skipIdx = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            primeList.clear();
            skipIdx.clear();
            boolean[] isPrimeCopy = isPrime.clone();

            int count = 0;

            for (int j = 2; j <= inputs[i]; j++) {
                if (isPrime[j]) {
                    primeList.add(j);
                }
            }

            for (int j = 0; j < primeList.size(); j++) {
                if (inputs[i] - primeList.get(j) < 0) {
                    break;
                }

                if (isPrimeCopy[inputs[i] - primeList.get(j)]) {
                    count++;
                    isPrimeCopy[inputs[i] - primeList.get(j)] = false;
                    isPrimeCopy[primeList.get(j)] = false;
                }

            }

            sb.append(count + "\n");
        }


        System.out.println(sb);
    }
}