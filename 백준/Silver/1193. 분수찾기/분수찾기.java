import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 0;
        int term = 0;
        for (int i = 1; i <= N; i++) {
            num += i;

            if(num >= N){
                term = i;
                break;
            }
        }

        int numerator;
        int denominator;

        if(term % 2 == 0){
            numerator = term - (num-N);
            denominator = 1 + (num-N);
        }else{
            numerator = 1 + (num-N);
            denominator = term - (num-N);
        }
        System.out.println(numerator + "/" + denominator);
        sc.close();
    }
}