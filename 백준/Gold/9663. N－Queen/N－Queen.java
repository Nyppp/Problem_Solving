import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] board = new int[16];
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        nQueen(N, 1);

        sb.append(ans);

        System.out.println(sb);
    }

    static void nQueen(int N, int depth) {
        if(depth > N){
            ans++;
            return;
        }

        for (int i = 1; i <= N; i++) {
            board[depth] = i;

            boolean isVisit = false;
            for (int k = 1; k < depth; k++) {
                if(board[k] == board[depth] || Math.abs(board[depth]-board[k]) == depth-k){
                    isVisit = true;
                }
            }

            if(!isVisit){
                nQueen(N, depth+1);
            }
        }

    }
}
