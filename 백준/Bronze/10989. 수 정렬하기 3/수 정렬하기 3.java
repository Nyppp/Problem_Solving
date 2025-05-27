import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(br.readLine());

            if(numArr[i] > maxValue){
                maxValue = numArr[i];
            }
        }

        int[] countArr = new int[maxValue+1];
        Arrays.fill(countArr, 0);
        for (int i = 0; i < N; i++) {
            countArr[numArr[i]]++;
        }

        for (int i = 1; i <= maxValue; i++) {
            while(countArr[i] > 0){
                sb.append(i + "\n");
                countArr[i]--;
            }
        }
        System.out.println(sb);
    }
}