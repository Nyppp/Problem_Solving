import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isPalinfrome = true;
        for(int i = 0; i < str.length(); i++){
            int reverseIdx = str.length()-1-i;
            if(str.charAt(i)!= str.charAt(reverseIdx)){
                isPalinfrome = false;
            }

            if(i == reverseIdx){
                break;
            }
        }

        if(isPalinfrome){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}