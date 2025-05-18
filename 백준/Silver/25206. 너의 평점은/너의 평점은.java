import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int classCount = 20;
        double gradeSum = 0;
        double creditSum = 0;

        for(int i = 0; i < classCount; i++){
            String className = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if(grade.indexOf("P") >= 0){
                continue;
            }

            creditSum += credit;

            switch (grade){
                case "A+":
                    gradeSum+= (double)4.5 * credit;
                    break;
                case "A0":
                    gradeSum+= (double)4.0 * credit;
                    break;
                case "B+":
                    gradeSum+= (double)3.5 * credit;
                    break;
                case "B0":
                    gradeSum+= (double)3.0 * credit;
                    break;
                case "C+":
                    gradeSum+= (double)2.5 * credit;
                    break;
                case "C0":
                    gradeSum+= (double)2.0 * credit;
                    break;
                case "D+":
                    gradeSum+= (double)1.5 * credit;
                    break;
                case "D0":
                    gradeSum+= (double)1.0 * credit;
                    break;
                default:
                    break;
            }
        }

        System.out.println(gradeSum/creditSum);
        sc.close();
    }
}