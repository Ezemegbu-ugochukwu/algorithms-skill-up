package com.ugo;

import java.math.BigDecimal;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {
        int[] result = new int[]{1, 2, 3};
        int[] result1 = new int[]{1, 2, 3, 4};
        int[] result2 = new int[]{3, 3, 4, 4};
        int[] result3 = new int[]{3, 2, 3, 4};
        int[] result4 = new int[]{4, 1, 2, 3};
        int[] result5 = new int[]{1, 2};


        System.out.println(getDifferenceBetweenSumOfEvenAndOdd(result));
        System.out.println(getDifferenceBetweenSumOfEvenAndOdd(result1));
        System.out.println(getDifferenceBetweenSumOfEvenAndOdd(result2));
        System.out.println(getDifferenceBetweenSumOfEvenAndOdd(result3));
        System.out.println(getDifferenceBetweenSumOfEvenAndOdd(result4));
        System.out.println(getDifferenceBetweenSumOfEvenAndOdd(result5));

    }

    public static BigDecimal getDifferenceBetweenSumOfEvenAndOdd(int [] arr) {

        int oddNumb = 0;
        int evenNumb = 0;

        BigDecimal oddN = null;
        BigDecimal evenN = null;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                evenNumb = evenNumb + arr[i];
            }else oddNumb = oddNumb + arr[i];

            oddN = BigDecimal.valueOf(oddNumb);
            evenN = BigDecimal.valueOf(evenNumb);
        }

        BigDecimal result = oddN.subtract(evenN);
        return result;
    }

}
