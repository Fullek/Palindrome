package main;

import java.util.Scanner;

public class PalindromeChecker {

    public String givenWord;

    void programLogic() {
        getWordFromUser();
        System.out.println(wordsComparison(givenWord));
    }

    void getWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a word and program will check if is a palindrome");
        givenWord = scanner.nextLine();
        givenWord = givenWord.replaceAll("[^a-zA-Z0-9]", ""); //"[^a-zA-Z0-9]" replaces all special characters
        scanner.close();
    }

    private String wordsComparison(String givenWord) {

        return (!givenWord.isEmpty()) ?
                (givenWord.equalsIgnoreCase(reverseWord()) ?
                        "This word is a Palindrome" : "This word is NOT a Palindrome")
                : "You must input a word to check!";

    }

    private String reverseWord() {

        char[] chrBoard = new char[givenWord.length()];
        int counter = givenWord.length() - 1;
        int i = 0;

        do {
            chrBoard[i] = givenWord.charAt(counter);
            i++;
            counter--;
        } while (counter >= 0);

        return new String(chrBoard);
    }
}