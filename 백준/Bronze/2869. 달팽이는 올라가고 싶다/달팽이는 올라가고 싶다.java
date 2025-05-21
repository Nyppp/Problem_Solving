import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();

        int day = 0;

        //달팽이가 하루 동안 하는 것 > A만큼 올라가고, B만큼 내려감
        //정상을 찍는 순간 > 올라갈 때 뿐임, 이후 잠들지 않음(전체 경로에서 B를 빼는 이유)
        //A-B 반복 + 마지막 A만큼 올라가기

        //시간제한이 있기에 반복문 대신 수식으로 치환
        day = (int)Math.ceil((double)(V-B) / (double)(A-B));

        System.out.println(day);

        sc.close();
    }
}