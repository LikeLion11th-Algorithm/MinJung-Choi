import java.util.*;
public class BOJ_2480 {	
	static int max3(int a, int b, int c){
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() ,b = sc.nextInt(), c= sc.nextInt();
		
		if(a == b && b == c) {
			int C1 = 10000 + a*1000;
			System.out.println(C1);
		}else if(a != b && b != c && a != c) {
			 int C2 = max3(a,b,c) * 100;
			 System.out.println(C2);
		}else {
			int same = a == b ? a : c;
			int C3 = 1000 + same * 100;
			System.out.println(C3);
		}
	}
}
