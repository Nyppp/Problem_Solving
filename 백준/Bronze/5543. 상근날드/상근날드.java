import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int burger1 = sc.nextInt();
        int burger2 = sc.nextInt();
        int burger3 = sc.nextInt();
        int coke = sc.nextInt();
        int cidar = sc.nextInt();

        int price = 0;
        if(burger1 > burger2){
            if(burger2 > burger3){
                price += burger3;
            }else{
                price += burger2;
            }
        }else{
            if(burger1 > burger3){
                price += burger3;
            }else{
                price += burger1;
            }
        }

        price += coke > cidar? cidar : coke;
        price -= 50;
        System.out.println(price);

        sc.close();
    }
}