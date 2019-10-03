package tablice;

import java.util.Scanner;

public class TablicaScanner {
    private static int number1;
    private static int number2;
    private static int number3;
    private static int number4;
    private static int [] table = new int[4];

    public static void main(String[] args) {
        TablicaScanner tablicaScanner = new TablicaScanner();
        tablicaScanner.userScanner();
        tablicaScanner.createTable();
        tablicaScanner.printTable(table);
        System.out.println("\n****************");
        tablicaScanner.printReverseTable(table);

    }
    private void createTable(){
        table = new int[]{number1, number2, number3, number4};
    }

    private void printTable(int [] tableInt) {
        for (int number:tableInt) {
            System.out.print(number + ", ");
        }
    }

    private void printReverseTable(int [] tableInt){
        for (int i = tableInt.length-1; i>=0; i-- ){
            System.out.print(tableInt[i] + ", ");
        }
    }

    public void userScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby w dowolnej kolejnoœci. Najpierw" +
                "wyœwietle pierwotn¹ tablicê, a nastêpnie odwrócê kolejnoœæ" +
                "elementów tablicy");
        System.out.println("Podaj proszê pierwsz¹ liczbê: ");
        number1 = scanner.nextInt();
        System.out.println("Podaj proszê drug¹ liczbê: ");
        number2 = scanner.nextInt();
        System.out.println("Podaj proszê trzeci¹ liczbê: ");
        number3 = scanner.nextInt();
        System.out.println("Na koniec podaj ostatni¹ liczbê: ");
        number4 = scanner.nextInt();
    }
}
