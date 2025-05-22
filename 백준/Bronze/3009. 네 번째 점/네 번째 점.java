import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] rect = new int[3][2];
        int ansX = 0;
        int ansY = 0;

        for (int i = 0; i < rect.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            rect[i][0] = x;
            rect[i][1] = y;
        }

        for (int i = 0; i < rect.length; i++) {
            boolean isUniqueX = true;
            boolean isUniqueY = true;
            for (int j = 0; j < rect.length; j++) {
                if(i==j){
                    continue;
                }

                if(rect[i][0] == rect[j][0]){
                    isUniqueX = false;
                }

                if(rect[i][1] == rect[j][1]){
                    isUniqueY = false;
                }
            }

            if(isUniqueX){
                ansX = rect[i][0];
            }

            if(isUniqueY){
                ansY = rect[i][1];
            }
        }

        System.out.println(ansX + " " + ansY);

        sc.close();
    }
}