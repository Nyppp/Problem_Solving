import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        while(true){
            n = sc.nextInt();
            List<Integer> nums = new ArrayList<>();
            int sum = 0;
            if(n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if(n % i == 0){
                    nums.add(i);
                    sum += i;
                }
                if(n == 1){
                    break;
                }
            }
            if(sum == n){
                System.out.print(n + " = ");
                for (int i = 0; i < nums.size(); i++) {
                    System.out.print(nums.get(i));
                    if(i < nums.size()-1){
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}