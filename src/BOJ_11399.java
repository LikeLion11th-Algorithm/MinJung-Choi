import java.io.*;
import java.util.*;

public class BOJ_11399 {
    static int ATM(ArrayList<Integer> arr, int index){
        int total=0;
        if(index == 0)
            total += arr.get(index);
        else
            total += ATM(arr, index-1) + arr.get(index);
        return total;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>();

        int Num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for(int i=0; i<Num; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr); // 정렬

        int totalTime=0;
        for(int i=0; i<arr.size(); i++) {
            totalTime += ATM((ArrayList<Integer>)arr, i);
        }

        bw.write(String.valueOf(totalTime));
        bw.flush();
        bw.close();
    }
}
