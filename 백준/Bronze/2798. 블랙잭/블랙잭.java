import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int distance = Integer.MAX_VALUE;

        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if(cards[i] + cards[j] + cards[k] <= M){
                        int sum = cards[i] + cards[j] + cards[k];
                        if(M - sum < distance){
                            distance = M-sum;
                        }
                    }
                }
            }
        }

        System.out.println(M - distance);

        sc.close();
    }
}