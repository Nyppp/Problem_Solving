import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] Arr = new int[N];
        
        for(int i = 0; i < N; i++) {
        	Arr[i] = i+1;
        }
        
        for(int i = 0; i < M; i++) {
        	int start = sc.nextInt();
        	int end = sc.nextInt();
        	
        	int endValue = Arr[end-1];
        	int startValue = Arr[start-1];
        	
        	Arr[end-1] = startValue;
        	Arr[start-1] = endValue;
        }
        
        for(int i = 0; i < N; i++) {
        	System.out.print(Arr[i] + " ");
        }
    }
}