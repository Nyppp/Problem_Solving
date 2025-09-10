import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr = new int[10];
    static boolean[] visit = new boolean[10];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        printSeq(N, M, 1);


        System.out.println(sb);
    }

    static void printSeq(int N, int M, int depth) {
        if(depth > M){
            for (int i = 1; i <=M ; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(visit[i]){
                continue;
            }

            arr[depth] = i;
            visit[i] = true;

            printSeq(N,M,depth+1);
            visit[i] = false;
        }

    }
}
