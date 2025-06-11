import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");

            if(inputs.length == 2){
                if (inputs[0].equals("1")){
                    list.addFirst(Integer.parseInt(inputs[1]));
                }
                if (inputs[0].equals("2")){
                    list.addLast(Integer.parseInt(inputs[1]));
                }
            }else{
                if (inputs[0].equals("3")){
                    if (list.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(list.pollFirst() + "\n");
                    }
                }
                if (inputs[0].equals("4")){
                    if (list.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(list.pollLast() + "\n");
                    }
                }
                if (inputs[0].equals("5")){
                    sb.append(list.size() + "\n");
                }
                if (inputs[0].equals("6")){
                    if(list.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                }
                if (inputs[0].equals("7")){
                    if (list.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(list.peekFirst() + "\n");
                    }

                }
                if (inputs[0].equals("8")){
                    if (list.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(list.peekLast() + "\n");
                    }
                }
            }
        }

        System.out.println(sb);
    }
}