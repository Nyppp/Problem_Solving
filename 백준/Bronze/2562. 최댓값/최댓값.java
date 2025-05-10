import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = 9;
        int[] Arr = new int[N];

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();

            if(Arr[i] >= max){
                max = Arr[i];
                ans = i;
            }
        }

        System.out.println(max);
        System.out.println(ans+1);
    }
}
