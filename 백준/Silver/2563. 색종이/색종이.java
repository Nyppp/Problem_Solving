import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int paperCount = sc.nextInt();
        int blackPaperArea = paperCount * 100;

        int[][] whitePaper = new int[101][101];
        for(int i = 1; i <= 100; i++){
            for (int j = 0; j <= 100 ; j++) {
                whitePaper[i][j] = 0;
            }
        }

        for(int i = 0; i < paperCount; i++){
            int startX = sc.nextInt();
            int startY = sc.nextInt();

            for(int y = startY; y < startY+10; y++){
                for (int x = startX; x < startX+10 ; x++) {
                    whitePaper[y][x]++;
                }
            }
        }

        for(int i = 1; i <= 100; i++){
            for (int j = 0; j <= 100 ; j++) {
                if(whitePaper[i][j] > 1){
                    blackPaperArea = blackPaperArea - (whitePaper[i][j] -1);
                }
            }
        }

        System.out.println(blackPaperArea);
        sc.close();
    }
}