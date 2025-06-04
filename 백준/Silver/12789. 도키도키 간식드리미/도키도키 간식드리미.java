import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> waitList = new ArrayList<>();
        List<Integer> startList = new ArrayList<>();
        String[] inputs = br.readLine().split(" ");

        for (int i = 0; i <inputs.length ; i++) {
            startList.add(Integer.parseInt(inputs[i]));
        }

        for (int i = 1; i <= N; i++) {
            if(!startList.isEmpty() && startList.get(0) == i){
                startList.remove(0);
                continue;
            }else if(!waitList.isEmpty() && waitList.get(waitList.size()-1) == i){
                waitList.remove(waitList.size()-1);
                continue;
            }

            if(startList.isEmpty()){
                sb.append("Sad\n");
                break;
            }

            while (startList.get(0) != i){
                waitList.add(startList.remove(0));
                if(startList.isEmpty()){
                    break;
                }
            }

            if(!startList.isEmpty()) {
                startList.remove(0);
            }else{
                sb.append("Sad\n");
                break;
            }

        }

        if(startList.isEmpty() && waitList.isEmpty()){
            sb.append("Nice\n");
        }

        System.out.println(sb);
    }
}