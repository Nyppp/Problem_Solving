import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();



        while(true) {
            String input = br.readLine();
            if(input == null || input.isBlank()){
                break;
            }
            int N = Integer.parseInt(input);
            char[] s = new char[(int)Math.pow(3, N)];
            for (int i = 0; i < Math.pow(3, N); i++) {
                s[i] =  '-';
            }

            splitLine(s, 0, s.length-1);
            for (int i = 0; i < s.length; i++) {
                sb.append(s[i]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void splitLine(char[] s, int start, int end){
        if(start == end){
            return;
        }

        int splitLength = end - start +1;


        splitLine(s, start, start + splitLength/3 -1);

        for (int i = start + (splitLength)/3; i < start + ((splitLength)/3)*2; i++) {
            s[i] = ' ';
        }

        splitLine(s, start + (splitLength/3)*2, end);

    }
}
