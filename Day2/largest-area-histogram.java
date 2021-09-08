import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    int count1 = 1;//to count the value of present or current ele as well
    int count2 = 0;//directly starting the count for eles right side of curr, as curr value already taken in count1
    int max = 0;
    int area;
    int i;
    for (i = 0; i < a.length; i++) {
        for (int left = i-1; left >= 0; left--) {
            if (a[left] > a[i]) {
                count1 += 1;
            } else {//first small ele found, move out of that loop
                break;
            }
        }
        
        for (int right = i+1; right <= a.length-1; right++) {//for elements on the right side of current ele
            if (a[right] > a[i]) {
                count2 += 1;
            } else {//first small ele found, move out of that loop
                break;
            }
        }
        
        area = (count1 + count2) * a[i];
        
        if (area > max) {
            max = area;
        }
    }
    
    System.out.println(max);
    
 }
}