package petle;

import java.util.Scanner;

public class NumbersFromZeroToX {
    private static int number1;
    private static int i;
    private static int num = 0;

    public static void main(String[] args) {
        NumbersFromZeroToX numbersFromZeroToX = new NumbersFromZeroToX();
        numbersFromZeroToX.userScanner();
        System.out.println("");
        numbersFromZeroToX.printNumbersFromZeroToX(number1);
        System.out.println("\n ******************");
        numbersFromZeroToX.printNumbersFromZeroToXOtherWay(number1);
    }

    private void printNumbersFromZeroToXOtherWay(int number1) {
        while (num<=number1){
            System.out.print(num++ + ", ");
        }
    }

    private void printNumbersFromZeroToX(int number1) {
        for (i = 0; i<=number1; i++){
            System.out.print(i + ", ");
        }
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj  liczbê X a wypiszê wszystkie liczby" +
                "od '0' do 'X' ");
        number1 = scanner.nextInt();
    }

}
