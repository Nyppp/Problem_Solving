import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        int[] waits = new int[N];

        for (int i = 0; i < N; i++) {
            waits[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(waits);

        int totalTime = 0;
        for (int i = 0; i < N-1; i++) {
            waits[i+1] += waits[i];
        }

        for (int i = 0; i < N; i++) {
            totalTime += waits[i];
        }

        sb.append(totalTime);

        System.out.println(sb);
    }
}