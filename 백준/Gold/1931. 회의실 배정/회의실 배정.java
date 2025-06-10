import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] times = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");

            int start = Integer.parseInt(inputs[0]);
            int end = Integer.parseInt(inputs[1]);


            times[i][0] = start;
            times[i][1] = end;
        }

        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                else{
                    return o1[1] - o2[1];
                }
            }
        });

        int currentTime = times[0][1];
        int meetCount = 1;

        for (int i = 1; i < N; i++) {
            if(currentTime <= times[i][0]){
                currentTime = times[i][1];
                meetCount++;
            }
        }
        sb.append(meetCount);

        System.out.println(sb);
    }
}