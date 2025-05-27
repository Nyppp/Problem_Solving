import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();


        int[] countArr = new int[10];
        Arrays.fill(countArr, 0);
        for (int i = 0; i < N.length(); i++) {
            countArr[N.charAt(i)-'0']++;
        }

        for (int i = 9; i >=0; i--) {
            while(countArr[i] > 0){
                sb.append(i);
                countArr[i]--;
            }
        }
        System.out.println(sb);
    }
}