import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = Integer.MAX_VALUE;

        for (int i = 0; i <= N/5; i++) {
            for (int j = 0; j <= N/3; j++) {
                if((5*i) + (3*j) == N){
                    if(i+j < count){
                        count = i+j;
                    }
                }
            }
        }

        if(count == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }

        sc.close();
    }
}