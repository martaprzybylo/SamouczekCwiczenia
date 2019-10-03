package petle;

import java.util.Scanner;

public class Palindrom {
    private static String userInput;
    private static char [] array;

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        palindrom.userScanner();
        System.out.println(palindrom.isUserInputPalindrom(userInput));
        System.out.println("*********");
        System.out.println(palindrom.isUserInputPalindromOtherWayOnlyWord(userInput));

    }

    private boolean isUserInputPalindromOtherWayOnlyWord(String userInput) {
        array = userInput.toCharArray();
        for (int i = 0; i<array.length/2; i++){
            char currentFromStart = array[i];
            char currentFromEnd = array[array.length - i - 1];

            if (currentFromStart == currentFromEnd){
                return true;
            }
        }
        return false;
    }

    private boolean isUserInputPalindrom(String userInput) {
        userInput = userInput.replaceAll("\\s+","");
        if (userInput.equals(new StringBuilder(userInput).reverse().toString())){
            return true;
        }
        return false;
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy siê s³owami.");
        System.out.println("Podaj dowolny wyraz lub zdanie, a ja sprawdzê, czy jest PALINDROMEM :) ");
        userInput = scanner.nextLine();
    }


}
