package com.ugo;

public class CharacterCount {

    public static void main(String[] args) {
        System.out.println(charCount("ugochukwu", 'u'));
    }

    public static int charCount(String word, char x) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == x) {
              count++;
          }
        }
        return count;
    }
}
