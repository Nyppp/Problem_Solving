import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scoreArr = new int[N];
        double avg = 0;
        double sum = 0;
        int highscore = -1;

        for(int i = 0; i < scoreArr.length; i++){
            scoreArr[i] = sc.nextInt();

            if(highscore < scoreArr[i]){
                highscore = scoreArr[i];
            }
        }

        for(int i = 0; i < scoreArr.length; i++){
            sum += ((double) scoreArr[i]*(double) 100) / (double) highscore;
        }

        avg = sum / N;
        System.out.println(avg);

        sc.close();
    }
}
