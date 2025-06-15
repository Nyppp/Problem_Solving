import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer[]> list = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < inputs.length; i++) {
            int tmp = Integer.parseInt(inputs[i]);
            list.add(new Integer[]{i+1 , tmp});
        }

        int cursur = 0;
        while (!list.isEmpty()){
            sb.append(list.get(cursur)[0] + " ");
            if(list.get(cursur)[1] < 0){
                cursur += list.remove(cursur)[1];
            }else{
                cursur += list.remove(cursur)[1] - 1;
            }

            if(list.isEmpty()){
                break;
            }


            if(cursur >= list.size()){
                cursur %= list.size();
            }else if(cursur < 0){
                cursur = (list.size() + (cursur % list.size())) % list.size();
            }
        }

        System.out.println(sb);
    }
}