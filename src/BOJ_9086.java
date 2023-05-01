import java.util.Scanner;
public class BOJ_9086 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[testCase][2];
        for(int i=0; i<testCase; i++){
            String str = sc.nextLine();
            arr[i][0] = Character.toString(str.charAt(0));
            arr[i][1] = Character.toString(str.charAt(str.length()-1));
        }
        for(int i=0; i<testCase; i++) {
            System.out.println(arr[i][0]+arr[i][1]);
        }
    }
}