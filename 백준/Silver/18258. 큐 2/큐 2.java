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

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");

            switch (inputs[0]) {
                case "push": {
                    list.add(Integer.parseInt(inputs[1]));
                    break;
                }
                case "pop": {
                    if (list.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(list.removeFirst() + "\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(list.size() + "\n");
                    break;
                }
                case "empty": {
                    if (list.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                }
                case "front": {
                    if (list.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(list.getFirst() + "\n");
                    }
                    break;
                }
                case "back": {
                    if (list.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(list.getLast() + "\n");
                    }
                    break;
                }
                default:
                    break;
            }
        }


        System.out.println(sb);
    }
}