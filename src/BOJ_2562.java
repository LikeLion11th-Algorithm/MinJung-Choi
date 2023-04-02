import java.util.*;
import java.io.IOException;
public class BOJ_2562 {

	static int search(int[] a, int key) {
		for(int i = 0; i <= a.length-1; i++) 
			if(a[i] == key) 
				return i+1;
		return -1;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = 9;
		int[] Num = new int[N];
						
		for(int i = 0; i <= N-1; i++) {
			Num[i] = sc.nextInt();
		}
		
		int max = Num[0];
		for(int i = 0; i <= N-1; i++) {
			if(Num[i] > max)
				max = Num[i];	
		}
		
		int ord = search(Num,max);
		System.out.println(max +"\n"+ ord);
	}
}