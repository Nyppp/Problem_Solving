import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int arraySize = 9;
        int[][] array = new int[arraySize][arraySize];

        int maxValue = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if(maxValue <= array[i][j]){
                    maxValue = array[i][j];

                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(x + " " +y);

        sc.close();
    }
}