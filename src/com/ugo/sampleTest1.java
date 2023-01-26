package com.ugo;

public class sampleTest1 {
    public static void main(String[] args) {
        int [] result = new int[]{1,2,3,4,5};
        int[] result1 = new int[]{3, 2, 1, 4, 5};
        int[] result2 = new int[]{3, 2, 1, 4, 1};
        int[] result3 = new int[]{1,2,3,4};
        int[] result4 = new int[]{};
        int[] result5 = new int[]{10};
        System.out.println(getOneOrZero(result));
        System.out.println(getOneOrZero(result1));
        System.out.println(getOneOrZero(result2));
        System.out.println(getOneOrZero(result3));
        System.out.println(getOneOrZero(result4));
        System.out.println(getOneOrZero(result5));

    }

    public static int getOneOrZero(int[] arr) {
//       System.out.println("length is " + arr.length);
       if (arr == null || arr.length % 2 == 0){
           return 0;
       }
       int mid = arr.length/2;
       int middleNumb = arr[mid];

        for (int i = 0; i < arr.length; i++) {
            if (i != mid && middleNumb >= arr[i])
                return 0;
        }
        return 1;
    }
}