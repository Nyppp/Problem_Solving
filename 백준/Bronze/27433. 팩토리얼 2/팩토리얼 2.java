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

        sb.append(factorial(N));

        System.out.println(sb);
    }

    public static long factorial(int N){
        if(N == 0){
            return 1;
        }

        long result = N * factorial(N-1);
        return result;
    }
}