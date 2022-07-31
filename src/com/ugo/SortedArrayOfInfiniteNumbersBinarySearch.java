package com.ugo;

public class SortedArrayOfInfiniteNumbersBinarySearch {
    //since its an infinite array we dont know start and end and also we cant use num.length since we dont knw the length of the array
    //we will double the size and find the range
    public static void main(String[] args) {
   int [] num = {3,5,7,9,10,90,100,130,140,160,270,280, 310, 350};
   int target = 130;
        System.out.println(ans(num,target));
    }

    public static int ans(int [] num, int target) {
        int start = 0;
        int end = 1;

        while (target > num[end]) {
            int newStart = end + 1;
            //end = previous end + sizeOfBox * 2
            end = end + (end - start + 1) * 2;

            start = newStart;

        }
       return binarySearch(num,target, start, end);
    }
   public static int binarySearch(int[] num, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
      return -1;
    }
}


