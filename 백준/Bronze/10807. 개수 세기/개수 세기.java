import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        int[] numArr = new int[n];

        for(int i = 0; i < n; ++i){
            numArr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        for(int i = 0; i < n; ++i){
            if(numArr[i] == key){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
