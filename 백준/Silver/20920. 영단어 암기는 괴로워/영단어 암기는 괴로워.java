import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                map.put(s, map.get(s)+1);
            }

            if(!indexMap.containsKey(s)){
                indexMap.put(s, i);
            }

        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) != map.get(o2)) {
                    return map.get(o2) - map.get(o1);
                }else{
                    if(o2.length() != o1.length()){
                        return o2.length() - o1.length();
                    }else{
                        return o1.compareTo(o2);
                    }
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() >= M){
                sb.append(list.get(i) + "\n");
            }
        }

        System.out.println(sb);
    }
}