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

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   int[] f = new int[arr.length];
   int i;
   for (i = 0; i < arr.length-1; i++) {
       for (int j = i+1; j < arr.length; j++) {
           if (arr[j] > arr[i]) {
               f[i] = arr[j];
               break;
           } 
       } 
       if (f[i] == 0) {
           f[i] = -1;
       }
   }
   f[i] = -1;
   return f;
 }

}