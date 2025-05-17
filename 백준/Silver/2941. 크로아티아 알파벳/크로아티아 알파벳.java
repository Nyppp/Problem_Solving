import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cursur = 0;
        int count = 0;

        String str = sc.nextLine();

        while(cursur < str.length()){
            boolean isCroatia = false;
            for(int i = 0 ; i < croatiaAlpha.length; i++){
                if(str.indexOf(croatiaAlpha[i], cursur) == cursur){
                    cursur += croatiaAlpha[i].length();
                    isCroatia = true;
                    count++;
                    break;
                }
            }

            if(!isCroatia){
                cursur++;
                count++;
            }
        }

        System.out.println(count);


    }
}