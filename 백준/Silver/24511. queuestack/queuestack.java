import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int[] isStack = new int[N];

        for (int i = 0; i < s.length; i++) {
            isStack[i] = Integer.parseInt(s[i]);
        }

        int[] currentNums = new int[N];
        s = br.readLine().split(" ");
        for (int i = 0; i < s.length ; i++) {
            currentNums[i] = Integer.parseInt(s[i]);
        }

        int M = Integer.parseInt(br.readLine());

        int[] numArr = new int[M];

        List<Integer> pops = new ArrayList<>();
        s = br.readLine().split(" ");
        for (int i = 0; i < M; i++){
            numArr[i] = Integer.parseInt(s[i]);
        }

        for (int i = N-1; i >= 0 ; i--) {
            if(isStack[i] == 0){
                pops.add(currentNums[i]);
                if(pops.size() == M){
                    break;
                }
            }
        }

        if(pops.size() < M){
            for (int i = 0; i < M; i++) {
                pops.add(numArr[i]);
                if(pops.size() == M){
                    break;
                }
            }
        }


        for (int i = 0; i < pops.size(); i++) {
            sb.append(pops.get(i) + " ");
        }



        System.out.println(sb);
    }
}