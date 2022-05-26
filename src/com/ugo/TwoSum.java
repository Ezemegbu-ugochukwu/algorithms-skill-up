package com.ugo;

public class TwoSum {
    public static String howMuchILoveYou(int nb_petals) {
//        StringBuilder builder = new StringBuilder();
        String petals = String.valueOf(nb_petals);
        for (int i = 0; i < petals.length(); i++){
            String word = String.valueOf(petals.charAt(i));
            switch (word) {
                case "I love you" :
                    System.out.println("1");
                    break;
                case "a little" :
                    System.out.println("2");
                    break;
                case "a lot" :
                    System.out.println("3");
                    break;
                case "passionately" :
                    System.out.println("4");
                    break;
                case "madly" :
                    System.out.println("5");
                    break;
                case "not at all" :
                    System.out.println("6");
                    break;
            }
            return word;
        }

        //your code here :)
        return "";
    }
}
