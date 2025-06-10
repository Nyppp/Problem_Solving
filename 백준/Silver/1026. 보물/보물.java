import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] aInputs = br.readLine().split(" ");
        String[] bInputs = br.readLine().split(" ");

        int[] aArr = new int[N];
        int[] bArr = new int[N];
        for (int i = 0; i < N; i++) {
            aArr[i] = Integer.parseInt(aInputs[i]);
            bArr[i] = Integer.parseInt(bInputs[i]);
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += aArr[i] * bArr[(N-1) - i];
        }
        sb.append(ans);

        System.out.println(sb);
    }
}