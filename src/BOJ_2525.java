import java.util.*;
import java.io.IOException;
public class BOJ_2525 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
		int R = m + c;
		
		if(R >= 60) {
			R = R - 60;
			t++;
			while(R >= 60) {
				R = R - 60;
				t++;	
			}
			if(t >= 24) {
				t = t - 24;
			}
		}
		System.out.printf(t+" "+ R);
	}
}
