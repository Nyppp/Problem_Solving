import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];


        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        divide(0,0,N);
        sb.append(white+"\n"+blue);

        System.out.println(sb);
    }

    public static void divide(int x, int y, int size){
        if(isSameColor(x, y, size)){
            if(paper[x][y] == 0){
                white++;
            }else{
                blue++;
            }

            return;
        }

        int newsize = size/2;
        divide(x,y,newsize);
        divide(x+newsize,y,newsize);
        divide(x,y+newsize,newsize);
        divide(x+newsize,y+newsize,newsize);
    }

    public static boolean isSameColor(int x, int y, int size){
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(paper[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}