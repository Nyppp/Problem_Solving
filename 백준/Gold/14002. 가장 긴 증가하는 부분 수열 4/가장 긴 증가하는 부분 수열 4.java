import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];

        String[] inputs = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(inputs[i-1]);
        }

        int[] dp = new int[N+1];
        int[] count = new int[N+1];

        Arrays.fill(count, Integer.MIN_VALUE);
        Arrays.fill(dp, 0);
        count[1] = 1;

        for (int i = 2; i <= N ; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 1; j < i; j++) {
                if(arr[i] > arr[j] && count[j] >= maxValue){
                    dp[i] = j;
                    count[i] = count[j]+1;
                    maxValue = count[i];
                }else{
                    count[i] = Math.max(1, count[i]);
                }
            }
        }

        int maxCount = Integer.MIN_VALUE;
        int maxIdx = 0;
        for (int i = 1; i <= N ; i++) {
            if(maxCount < count[i]){
                maxCount = count[i];
                maxIdx = i;
            }
        }

        sb.append(count[maxIdx] + "\n");
        List<Integer> outputList = new ArrayList<>();
        while (dp[maxIdx] != 0){
            outputList.add(arr[maxIdx]);
            maxIdx = dp[maxIdx];
        }
        outputList.add(arr[maxIdx]);


        for (int i = outputList.size()-1; i >= 0 ; i--) {
            sb.append(outputList.get(i) + " ");
        }

        System.out.println(sb);
    }
}