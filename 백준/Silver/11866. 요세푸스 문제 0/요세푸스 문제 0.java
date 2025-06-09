import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N ; i++) {
            list.add(i);
        }

        sb.append("<");
        int cursur = 0;
        while (!list.isEmpty()){
            cursur += K -1;

            while(cursur >= list.size()){
                cursur -= list.size();
            }

            if(list.size() == 1){
                sb.append(list.remove(cursur));
            }else{
                sb.append(list.remove(cursur) + ", ");
            }


        }
        sb.append(">");

        System.out.println(sb);
    }
}