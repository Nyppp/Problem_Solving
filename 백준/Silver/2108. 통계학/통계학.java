import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int modeCount = 0;
        List<Integer> modes = new ArrayList<>();
        List<Integer> keyList = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(!map.containsKey(input)){
                map.put(input, 1);
            }else{
                map.put(input, map.get(input)+1);
            }

            if(map.get(input) >= modeCount){
                modeCount = map.get(input);
            }

            sum += input;
            keyList.add(input);
        }

        for(Integer num : map.keySet()){
            if(map.get(num) == modeCount){
                modes.add(num);
            }
        }


        Collections.sort(keyList);
        Collections.sort(modes);

        sb.append(Math.round((double)sum / N) + "\n");
        sb.append(keyList.get((keyList.size()/2)) + "\n");
        sb.append((modes.size() == 1 ? modes.get(0) : modes.get(1)) + "\n");
        sb.append(keyList.get(keyList.size()-1) - keyList.get(0));

        System.out.println(sb);
    }
}