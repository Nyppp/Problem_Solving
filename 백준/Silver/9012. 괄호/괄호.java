import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            int bracketCount = 0;
            List<Character> list = new ArrayList<>();

            for (int j = 0; j < s.length() ; j++) {
                if(!list.isEmpty() && list.get(list.size()-1) == '('){
                    if(s.charAt(j) == ')'){
                        list.remove(list.size()-1);
                    }else{
                        list.add(s.charAt(j));
                    }
                }else{
                    list.add(s.charAt(j));
                }
            }

            if(list.isEmpty()){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}