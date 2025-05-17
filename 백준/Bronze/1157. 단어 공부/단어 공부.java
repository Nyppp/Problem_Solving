import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphabetCount = new int[26];
        int maxCount = -1;
        int maxIdx = -1;

        str = str.toUpperCase();

        for(int i = 0 ; i< str.length(); i++){
            alphabetCount[str.charAt(i)-'A']++;
        }

        for(int i = 0; i < alphabetCount.length; i++){
            if(maxCount <= alphabetCount[i]){
                maxCount = alphabetCount[i];
                maxIdx = i;
            }
        }

        for(int i = 0; i < alphabetCount.length; i++){
            if(maxCount == alphabetCount[i] && maxIdx != i){
                maxIdx = -1;
                break;
            }
        }

        if(maxIdx == -1){
            System.out.println("?");
        }else{
            System.out.println((char)(maxIdx + 'A'));
        }
    }
}