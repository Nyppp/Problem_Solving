import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] strs = new String[N];

        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    for (int i = 0; i < o1.length(); i++) {
                        if(o1.charAt(i) != o2.charAt(i)){
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < N; i++) {
            if(sb.indexOf(strs[i]) < 0){
                sb.append(strs[i]+"\n");
            }
        }
        
        System.out.println(sb);
    }
}