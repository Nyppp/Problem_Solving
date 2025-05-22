import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int dotCount = 2;
        for (int i = 0; i < N; i++) {
            dotCount += Math.pow(2, i);
        }

        System.out.println((int)Math.pow(dotCount, 2));


        sc.close();
    }
}