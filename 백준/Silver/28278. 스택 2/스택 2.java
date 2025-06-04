import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");

            if(s.length > 1){
                list.add(Integer.parseInt(s[1]));
            }else{
                switch (Integer.parseInt(s[0])){
                    case 2:{
                        if(list.isEmpty()){
                            sb.append(-1 + "\n");
                        }else{
                            sb.append(list.remove(list.size()-1) + "\n");
                        }
                        break;
                    }
                    case 3:{
                        sb.append(list.size() + "\n");
                        break;
                    }
                    case 4:{
                        if (list.isEmpty()){
                            sb.append(1 + "\n");
                        }else{
                            sb.append(0 + "\n");
                        }
                        break;
                    }
                    case 5:{
                        if(list.isEmpty()){
                            sb.append(-1 + "\n");
                        }else{
                            sb.append(list.get(list.size()-1) + "\n");
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}