import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0 ; i < N ; i++){
            for(int j = 0; j < Math.abs((N-1) - i); j++){
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i +1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = N-2 ; i >= 0 ; i--){
            for(int j = 0; j < Math.abs((N-1) - i); j++){
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i +1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}