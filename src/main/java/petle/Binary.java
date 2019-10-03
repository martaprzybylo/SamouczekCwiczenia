package petle;

import java.util.Scanner;

public class Binary {
    private static int number;
    private static String binaryNumber;
    private static char[] array;

    public static void main(String[] args) {
        Binary binary = new Binary();
        binary.userScanner();
        binary.printBinary(number);
        System.out.println("************************************");
        System.out.print("Postaæ binarna podanej liczby to: ");
        System.out.print(binary.printBinaryOtherWay(number));
    }

    private char [] printBinaryOtherWay(int number) {

        while (number>0){
            binaryNumber = "" + number%2;
            number/=2;
        }
        array = binaryNumber.toCharArray();
        for (int i = array.length-1; i>=0;i--){
        }
        return array;
    }

    private void printBinary(int number) {
        binaryNumber = Integer.toBinaryString(number);
        System.out.println("Postaæ binarna podanej liczby to: " + binaryNumber);
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz przeksztalcê podan¹ przez Ciebie liczb¹ w postaæ binarn¹.");
        System.out.println("Podaj prosze dowoln¹ liczbê :) ");
        number = scanner.nextInt();
    }

}
