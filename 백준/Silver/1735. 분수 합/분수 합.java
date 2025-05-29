import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int aNumor = Integer.parseInt(s[0]);
        int aDenom = Integer.parseInt(s[1]);

        s = br.readLine().split(" ");
        int bNumor = Integer.parseInt(s[0]);
        int bDenom = Integer.parseInt(s[1]);

        int numor = aNumor*bDenom + bNumor*aDenom;
        int denom = aDenom * bDenom;

        for (int i = Math.min(numor,denom); i >= 1 ; i--) {
            if(numor % i == 0 & denom % i == 0){
                numor /= i;
                denom /= i;
                break;
            }
        }

        sb.append(numor + " "+ denom);
        System.out.println(sb);
    }
}