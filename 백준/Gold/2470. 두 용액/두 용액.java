import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long[] solutions = new long[N];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            solutions[i] = Long.parseLong(inputs[i]);
        }

        Arrays.sort(solutions);

        int left = 0;
        int right = solutions.length-1;

        int ansLeft = left;
        int ansRight = right;
        long min = Long.MAX_VALUE;

        while(left < right){
            long prop = solutions[left] + solutions[right];
            if(Math.abs(prop) < min){
                min = Math.abs(prop);
                ansLeft = left;
                ansRight = right;
            }

            if(prop > 0){
                right--;
            }else if(prop < 0){
                left++;
            } else{
                break;
            }
        }
        sb.append(solutions[ansLeft] + " " + solutions[ansRight]);

        System.out.println(sb);
    }
}