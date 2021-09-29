import java.io.*;
import java.util.*;

public class SlidingWindowPep{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    int[] nums = new int[a.length - k + 1];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int balance = 0;
        while (index < k) {//storing initial 3 numbers in the list
            list.add(a[index]);
            index += 1;
        }
        nums[0] = Collections.max(list);//adding max of 3 elements into nums array

        for (int i = 1; i <= a.length - k; i++) {
            list.remove(0);
            list.add(k-i+balance, a[i + k - 1]);
            balance += 1;
            nums[i] = Collections.max(list);
        }
        System.out.println(Arrays.toString(nums));
 }
}