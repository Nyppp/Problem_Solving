import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i) + "\n");
        }

        System.out.println(sb);


        sc.close();
    }
}