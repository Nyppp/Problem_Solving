import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] ballArr = new int[N];

        for(int i = 0; i < M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ballNumber = sc.nextInt();

            for(int j = start-1; j < end; j++){
                ballArr[j] = ballNumber;
            }
        }

        for(int i = 0; i < N; i++){
            System.out.print(ballArr[i] + " ");
        }
    }
}
