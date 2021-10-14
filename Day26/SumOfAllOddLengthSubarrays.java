//Leetcode Question
// Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

// A subarray is a contiguous subsequence of the array.

// Return the sum of all odd-length subarrays of arr.

class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int arrLength = 1;//acts as window size which'd be incn with 2 after every odd Length completion
        
        while (arrLength <= arrLength) {
            for (int i = 0; i < (arr.length - (arrLength - 1)); i++) {//no of elements that can fit for current odd length arrLength like 5 eles for 1 length, 3 eles for 3 length 7 so on for that particular array in this case taking 1st given array-[1,4,2,5,3] as reference 
                for (int j = i; j < i + arrLength; j++) {//taking sum one by one by being more specific, till the odd length of arrLength for that instance
                    sum += arr[j];
                }
            }//done with current odd length subarray, increase length of subarray by 2
            arrLength += 2;
        }
        return sum;
    }
}