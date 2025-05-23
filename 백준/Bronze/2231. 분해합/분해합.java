import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= N; i++){
            int num = i;

            String tmp = Integer.toString(i);

            for (int j = 0; j < tmp.length(); j++) {
                num += (tmp.charAt(j) - '0');
            }

            if(num == N){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}