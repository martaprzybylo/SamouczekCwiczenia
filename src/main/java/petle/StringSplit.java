package petle;

import java.util.Scanner;

public class StringSplit {
    private static String word;

    public static void main(String[] args) {
        StringSplit stringSplit = new StringSplit();
        stringSplit.userScanner();
        stringSplit.printReversString(word);
    }

    private void printReversString(String word) {
            char[] charArray = word.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy siê s³owami.");
        System.out.println("Podaj dowolny wyraz, a ja wyœwietlê jego akronim :) ");
        word = scanner.nextLine();
    }
}
