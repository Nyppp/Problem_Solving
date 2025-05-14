import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int divNum = 42;
        int[] numArr = new int[10];
        int[] remainArr = new int[10];
        int uniqueCount = 0;

        for(int i = 0 ; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        for(int i = 0; i < numArr.length; i++){
            remainArr[i] = numArr[i] % 42;
            boolean isUnique = true;

            for(int j = 0; j < i; j++){
                if(remainArr[i] == remainArr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                uniqueCount++;
            }
        }
        System.out.println(uniqueCount);
        sc.close();
    }
}
