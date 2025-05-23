import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int seiresCount = 0;
        int count = 1;

        while(true){
            count++;
            String str = Integer.toString(count);
            if(str.length() >= 3) {
                for (int i = 0; i < str.length()-2; i++) {
                    if (str.charAt(i) == '6') {
                        if(str.charAt(i) == str.charAt(i+1) &&
                        str.charAt(i) == str.charAt(i+2)){
                            seiresCount++;
                            break;
                        }
                    }
                }
            }

            if(seiresCount == N){
                System.out.println(count);
                break;
            }
        }



        sc.close();
    }
}