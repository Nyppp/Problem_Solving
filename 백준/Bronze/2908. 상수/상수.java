import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String reverseA = new String();
        String reverseB = new String();

        for(int i = 1; i <= A.length(); i++){
            reverseA += A.charAt(A.length()-i);
            reverseB += B.charAt(B.length()-i);
        }

        if(Integer.parseInt(reverseA) > Integer.parseInt(reverseB)){
            System.out.println(reverseA);
        }else{
            System.out.println(reverseB);
        }

        sc.close();
    }
}