import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = 0;
        
        boolean checkWord = false;
        for(int i = 0; i < str.length(); i++){
            if(!checkWord && str.charAt(i) != ' '){
                checkWord = true;
                ans++;
            }

            if(checkWord && str.charAt(i) == ' '){
                checkWord = false;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
