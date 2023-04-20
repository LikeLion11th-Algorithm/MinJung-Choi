import java.io.*;
import java.util.*;

public class BOJ_1427 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String number = sc.nextLine();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<number.length(); i++){
            list.add(Character.getNumericValue(number.charAt(i)));
        }
        Collections.sort(list); // 정렬

        for(int i=number.length()-1; i>=0; i--){
            System.out.print(list.get(i));
        }
    }
}
