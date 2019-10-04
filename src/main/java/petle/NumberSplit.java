package petle;

import java.util.Scanner;

public class NumberSplit {
    private static int number;

    public static void main(String[] args) {
        NumberSplit numberSplit = new NumberSplit();
        numberSplit.numberScanner();
        numberSplit.reversInput(number);
    }

    private void reversInput(int number) {
        String num = "" + number;
        char [] charArray = num.toCharArray();

        for (int i = charArray.length-1; i>=0; i-- ){
            System.out.println(charArray[i]);
        }
    }

    private void numberScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy siê na liczbach.");
        System.out.println("Podaj dowoln¹ liczbê: ");
        number = scanner.nextInt();

    }

}
