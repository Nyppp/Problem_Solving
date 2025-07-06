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

        sb.append(fibonacci(N));

        System.out.println(sb);
    }

    public static int fibonacci(int N){
        if(N == 0){
            return 0;
        }

        if(N == 1){
            return 1;
        }

        int result = fibonacci(N-1) + fibonacci(N-2);
        return result;
    }
}