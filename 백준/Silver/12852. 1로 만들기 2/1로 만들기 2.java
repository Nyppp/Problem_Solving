import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] path = new int[N+1]; //다음 최적 경로 숫자가 몇인지 담는 배열
        int[] count = new int[N+1]; //해당 경로가 1을 만들기 위해선 몇번의 연산이 필요한지?

        Arrays.fill(count, Integer.MAX_VALUE);
        count[1] = 0;

        for (int i = 2; i <= N ; i++) {
            if(i%2 == 0 && count[i/2] < count[i]){
                count[i] = count[i/2] + 1;
                path[i] = i/2;
            }

            if(i%3 == 0 && count[i/3] < count[i]){
                count[i] = count[i/3] + 1;
                path[i] = i/3;
            }

            if(count[i-1] < count[i]){
                count[i] = count[i-1] + 1;
                path[i] = i-1;
            }
        }
        sb.append(count[N] + "\n");

        int cursur = N;
        sb.append(N+ " ");
        while(path[cursur] != 0){
            sb.append(path[cursur] + " ");
            cursur = path[cursur];
        }


        System.out.println(sb);
    }
}