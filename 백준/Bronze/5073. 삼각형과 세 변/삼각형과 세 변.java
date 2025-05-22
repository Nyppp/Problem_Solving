import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int[] lines = new int[3];
            int maxValue = Integer.MIN_VALUE;
            int maxIdx = 0;
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                lines[i] = sc.nextInt();
            }

            if(lines[0] == 0 && lines[1] == 0 && lines[2] == 0){
                break;
            }

            for (int i = 0; i < 3; i++) {
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

            if (sum <= maxValue){
                System.out.println("Invalid");
                continue;
            }

            if(lines[0] == lines[1] && lines[0] == lines[2]){
                System.out.println("Equilateral");
            }else if(lines[0] == lines[1] || lines[1] == lines[2] || lines[0] == lines[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }

        sc.close();
    }
}