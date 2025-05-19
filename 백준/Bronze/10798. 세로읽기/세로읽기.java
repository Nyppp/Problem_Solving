import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int lineCount = 5;
        int maxLength = 15;
        String[] strArr = new String[5];

        for (int i = 0; i < lineCount; i++) {
            strArr[i] = sc.nextLine();
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < lineCount; j++) {
                if( i >= strArr[j].length()){
                    continue;
                }
                System.out.print(strArr[j].charAt(i));
            }
        }


        sc.close();
    }
}