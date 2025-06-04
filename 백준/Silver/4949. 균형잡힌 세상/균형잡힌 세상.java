import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = br.readLine();
            if(input.equals(".")){
                break;
            }

            List<Character> list = new ArrayList<>();
            String brackets = new String();

            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '[' || input.charAt(i) == ']' ||
                        input.charAt(i) == '(' || input.charAt(i) == ')'){
                    brackets += input.charAt(i);
                }
            }

            for (int i = 0; i < brackets.length(); i++) {
                if(!list.isEmpty()){
                    if(list.get(list.size()-1) == '(' && brackets.charAt(i) == ')'){
                        list.remove(list.size()-1);
                    }else if(list.get(list.size()-1) == '[' && brackets.charAt(i) == ']'){
                        list.remove(list.size()-1);
                    }else{
                        list.add(brackets.charAt(i));
                    }
                }else{
                    list.add(brackets.charAt(i));
                }
            }

            if(list.isEmpty()){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }
}