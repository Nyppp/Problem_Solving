import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int stickLength = 64;
        int count = 0;
        while(X > 0){
            for(int i = 6; i >= 0; i--){
                if(X >= Math.pow(2, i)){
                    X -= Math.pow(2,i);
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}