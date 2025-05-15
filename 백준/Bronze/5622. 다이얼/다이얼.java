import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] dials = new String[] {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String str = sc.nextLine();
        int distance = 0;

        for(int i = 0 ; i < str.length(); i++){
            for(int j = 0; j < dials.length; j++){
                if(dials[j].indexOf(str.charAt(i)) >= 0){
                    distance += 3 + j;
                }
            }
        }

        System.out.println(distance);
        sc.close();
    }
}