import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int price = sc.nextInt();

            int q = (int)(price / 25);
            price -= q * 25;
            int d = (int)(price / 10);
            price -= d*10;
            int n = (int)(price / 5);
            price -= n*5;
            int p = (int)(price / 1);

            System.out.println(q+" "+d+" "+n+" "+p);
        }



        sc.close();
    }
}