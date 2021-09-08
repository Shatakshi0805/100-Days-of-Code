import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   int[] nums = new int[arr.length];
   nums[0] = 1;
   int i,j;
   for (i = 1; i < arr.length; i++) {
       for (j = i-1; j >= 0; j--) {
           if(arr[j] > arr[i]) {
               nums[i] = i-j;
               break;
           }
       }
       if (j == -1) {
           nums[i] = i+1;
       }
   }
   return nums;
 }

}