import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            isPalindrome(inputs[i]);
        }
    }

    public static void recursion(String s, int l, int r, int cnt){
        cnt++;
        if(l >= r) System.out.println(1 + " " + cnt);
        else if(s.charAt(l) != s.charAt(r)) System.out.println(0 + " " + cnt);
        else recursion(s, l+1, r-1, cnt);
    }
    public static void isPalindrome(String s){
        recursion(s, 0, s.length()-1, 0);
    }
}