import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = (left + right) /2;

            if(arr[mid] < target){
                left = mid+1;
            }else if(arr[mid] > target){
                right = mid-1;
            }else{
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        int[] inputArr = new int[N];
        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(inputs[i]);
        }

        int M = Integer.parseInt(br.readLine());
        inputs = br.readLine().split(" ");

        Arrays.sort(inputArr);

        for (int i = 0; i < M; i++) {
            sb.append(search(inputArr, Integer.parseInt(inputs[i])) + "\n");
        }

        System.out.println(sb);
    }
}