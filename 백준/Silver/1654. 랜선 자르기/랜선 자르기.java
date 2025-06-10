import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static long searchHigher(int[] arr, int target){
        long left = 1;
        long right = 0;
        for (int i = 0; i < arr.length; i++) {
            right = Math.max(right, arr[i]);
        }

        while (left <= right){
            long mid = (left + right) / 2;

            long lineCount = 0;
            for (int i = 0; i < arr.length; i++) {
                lineCount += arr[i] / mid;
            }

            if(lineCount >= target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int[] lines = new int[N];
        for (int i = 0; i < N; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }

        sb.append(searchHigher(lines, M) -1 );


        System.out.println(sb);
    }
}