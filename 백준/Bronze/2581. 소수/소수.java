import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = M; i <= N ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i ; j++) {
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i > 1) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.print(min);
        }
        sc.close();
    }
}