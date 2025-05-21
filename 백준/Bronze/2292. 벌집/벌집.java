import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int level = 1;

        while(count < N){
            count += 6*level;
            level++;
        }

        System.out.println(level);

        sc.close();
    }
}