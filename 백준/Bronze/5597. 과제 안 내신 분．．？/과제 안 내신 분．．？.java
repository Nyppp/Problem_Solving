import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int studentCount = 30;
        
        int[] Arr = new int[studentCount];
        Arrays.fill(Arr, 0);
        
        for(int i = 0; i < 28; i++) {
        	int N = sc.nextInt();
        	
        	Arr[N-1] = 1;
        }
        
        for(int i = 0; i < studentCount; i++) {
        	if(Arr[i] == 0) {
        		System.out.println(i+1);
        	}
        }
    }
}
