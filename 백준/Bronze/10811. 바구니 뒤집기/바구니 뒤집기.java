import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] bascket = new int[N];
        for(int i = 0; i < bascket.length; i++){
            bascket[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int[] reverseArr = bascket.clone();

            for(int j = start-1; j < end; j++){
                bascket[j] = reverseArr[(end-1) - (j -(start-1))];
            }
        }

        for(int i = 0; i < bascket.length; i++){
            System.out.print(bascket[i] + " ");
        }

        sc.close();
    }
}
