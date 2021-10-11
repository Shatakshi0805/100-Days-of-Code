package com.company;

import java.util.ArrayList;
import java.util.List;

public class buildArray {
    public static void main(String[] args) {
        int[] target = {3};
        List<String> list = new ArrayList<>();
        list =  buildArrayFromOperations(target, 4);
        System.out.println(list);
    }

    public static List<String> buildArrayFromOperations(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int numIsPresent = 1;
// if current ele of array is not equal to numsIsPresent then simply add push and pop and increase value of nip and again
// compare the first ele of array. if curr ele is equal to nip then simply add push and increment both nip and i
//
        int i = 0;

        while (numIsPresent <= target[target.length-1] && i < target.length) {

                if (numIsPresent != target[i]) {
                    list.add("Push");
                    list.add("Pop");
                } else {
                    list.add("Push");
                    i++;
                }
                numIsPresent += 1;
            }
        return list;
        }

}
