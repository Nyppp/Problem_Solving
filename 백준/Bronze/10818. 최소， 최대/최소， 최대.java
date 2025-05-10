import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Arr = new int[N];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();

            if(Arr[i] <= min){
                min = Arr[i];
            }

            if(Arr[i] >= max){
                max = Arr[i];
            }
        }

        System.out.print(min + " " + max);
    }
}
