import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] alphabetIdxArr = new int[26];

        for(int i = 0; i < alphabetIdxArr.length; i++){
            if(str.indexOf('a'+i) >= 0){
                alphabetIdxArr[i] = str.indexOf('a'+i);
            }else{
                alphabetIdxArr[i] = -1;
            }
        }

        for(int i = 0; i < alphabetIdxArr.length; i++) {
            System.out.print(alphabetIdxArr[i] + " ");
        }

        sc.close();
    }
}
