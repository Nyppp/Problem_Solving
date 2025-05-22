import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();

        int num = 0;

        for (int i = str.length()-1; i >=0 ; i--) {
            char key;
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                key = '0';
            }else{
                key = 'A' - 10;
            }

            num += (str.charAt(i)-key) * (Math.pow(N, (str.length()-1)-i));
        }

        System.out.println(num);


        sc.close();
    }
}