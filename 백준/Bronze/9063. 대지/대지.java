import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] spots = new int[N][2];

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            spots[i][0] = sc.nextInt();
            spots[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(spots[i][0] < minX){
                minX = spots[i][0];
            }

            if(spots[i][0] > maxX){
                maxX = spots[i][0];
            }

            if(spots[i][1] < minY){
                minY = spots[i][1];
            }

            if(spots[i][1] > maxY){
                maxY = spots[i][1];
            }
        }

        System.out.println((maxX-minX) * (maxY - minY));
    }
}