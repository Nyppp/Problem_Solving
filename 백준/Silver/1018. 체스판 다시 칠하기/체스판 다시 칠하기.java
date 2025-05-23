import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int boradSize = 8;

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
        }

        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i <= N-boradSize; i++) {
            for (int j = 0; j <= M-boradSize; j++) {

                char[][] copyBoard = new char[boradSize][boradSize];

                for (int k = 0; k < boradSize; k++) {
                    for (int l = 0; l < boradSize; l++) {
                        copyBoard[k][l] = board[i+k][j+l];
                    }
                }

                char[] firstWord = {'W', 'B'};
                for(int letter = 0; letter < firstWord.length; letter++) {
                    int brushCount = 0;
                    for (int k = 0; k < boradSize; k++) {
                        for (int l = 0; l < boradSize; l++) {
                            if (k % 2 == 0) {
                                if (l % 2 == 1) {
                                    if (copyBoard[k][l] == firstWord[letter]) {
                                        brushCount++;
                                    }
                                } else {
                                    if (copyBoard[k][l] != firstWord[letter]) {
                                        brushCount++;
                                    }
                                }
                            } else {
                                if (l % 2 == 0) {
                                    if (copyBoard[k][l] == firstWord[letter]) {
                                        brushCount++;
                                    }
                                } else {
                                    if (copyBoard[k][l] != firstWord[letter]) {
                                        brushCount++;
                                    }
                                }
                            }
                        }
                    }
                    counts.add(brushCount);
                }

            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < counts.size(); i++) {
            if(counts.get(i) < min){
                min = counts.get(i);
            }
        }

        System.out.println(min);

        sc.close();
    }
}