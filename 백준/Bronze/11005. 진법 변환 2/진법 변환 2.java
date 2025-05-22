import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> num = new ArrayList<>();

        while(N / B > 0){
            num.add(N%B);
            N /= B;
        }
        if(N%B > 0){
            num.add(N%B);
        }

        String changedNum = new String();

        for (int i = num.size()-1; i >= 0 ; i--) {
            if(num.get(i) >= 10){
                changedNum += (char)('A' + num.get(i) - 10);
            }else{
                changedNum += (char)('0' + num.get(i));
            }
        }


        System.out.println(changedNum);


        sc.close();
    }
}