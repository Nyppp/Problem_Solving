import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] lines = new int[3];
        int maxValue = Integer.MIN_VALUE;
        int maxIdx = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            lines[i] = sc.nextInt();

            if(maxValue < lines[i]){
                maxValue = lines[i];
                maxIdx = i;
            }
        }

        for (int i = 0; i < 3; i++) {
            if(i == maxIdx) {
                continue;
            }
            sum += lines[i];
        }

        while (sum <= lines[maxIdx]){
            lines[maxIdx]--;
        }

        System.out.println(lines[0] + lines[1] + lines[2]);

        sc.close();
    }
}