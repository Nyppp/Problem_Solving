import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int w = sc.nextInt();
        int h = sc.nextInt();

        int xDistance = (w-x) < x ? w-x : x;
        int yDistance = (h-y) < y ? h-y : y;

        if(xDistance < yDistance){
            System.out.println(xDistance);
        }else{
            System.out.println(yDistance);
        }


        sc.close();
    }
}