import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] personArr = new int[N][2];

        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();

            personArr[i][0] = weight;
            personArr[i][1] = height;
        }

        for (int i = 0; i < N; i++) {
            int grade = 1;
            for (int j = 0; j < N; j++) {
                if(personArr[i][0] < personArr[j][0] &&
                personArr[i][1] < personArr[j][1]){
                    grade++;
                }
            }
            System.out.print(grade + " ");
        }


        sc.close();
    }
}