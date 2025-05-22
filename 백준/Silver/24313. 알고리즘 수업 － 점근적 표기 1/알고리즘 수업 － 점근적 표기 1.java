import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if(a1 > c){
            System.out.println(0);
        }else{
            if ((a1 - c) * n0 + a2 <= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }


        sc.close();
    }
}