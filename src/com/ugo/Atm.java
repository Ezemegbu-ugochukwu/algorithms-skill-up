package com.ugo;

import java.util.ArrayList;
import java.util.Arrays;

public class Atm {
    public static void main(String[] args) {
        //250	[2,1,0]/
//        260	[2,0,3]
//        40	[0,0,2]
//        60	[0,0,3]
//        370	[3,1,1]
//        230	[1,1,4]
//        370	[3,1,1]
        System.out.println(withdraw(250));
        System.out.println(withdraw(260));
        System.out.println(withdraw(40));
        System.out.println(withdraw(370));
        System.out.println(withdraw(230));
    }
    public static ArrayList<Integer> withdraw(int amount) {
     int twenty = amount / 20; //230/20 = 11 rem 10
     int fifty  = 0;  //20+20+10(rem)
     int remainder = amount % 20; //230 % 20 ==10
    // 230 == 20(11)  rem 10 , 50 = 0
        //30 == 20(9)   , 50 (1)
     if (remainder == 10) {
         twenty -= 2;//twen -2
         fifty += 1; // 1 fift +1
     }
     //twent ==9
     // hund = twenty/ 5 ==1
        //twet = twent % 5 ==4
        // hund = 1, fitt = 1, twent = 4
     int hundred = twenty / 5;
     twenty %= 5;



        return new ArrayList<Integer>(Arrays.asList(hundred, fifty, twenty));
    }
}

//An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
//
//Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as few bills as possible, determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).
//
//Parameters
//amount: Integer - Amount of money to withdraw. Assume that the amount is always divisible into 100, 50 and 20 bills.

//        250	[2,1,0]
//        260	[2,0,3]
//        40	[0,0,2]
//        60	[0,0,3]
//        370	[3,1,1]
//        230	[1,1,4]
//        370	[3,1,1]