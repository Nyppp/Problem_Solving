import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();

        int keyCount = 0;

        int[] numArr = new int[n];
        int[] ans = new int[n];



        for(int i = 0; i < n; ++i){
            numArr[i] = sc.nextInt();

            if(numArr[i] < key){
                ans[keyCount] = numArr[i];
                keyCount++;
            }
        }

        for(int i = 0 ; i < keyCount; ++i){
            System.out.print(ans[i] + " ");
        }
    }
}
