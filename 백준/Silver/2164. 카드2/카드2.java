import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N ; i++) {
            list.add(i);
        }

        int turn = 1;
        while (list.size() > 1){
            if(turn % 2 == 1){
                list.removeFirst();
            }else{
                list.add(list.removeFirst());
            }
            turn++;
        }

        sb.append(list.getLast() + "\n");

        System.out.println(sb);
    }
}