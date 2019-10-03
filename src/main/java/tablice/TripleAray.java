package tablice;

import java.util.Scanner;

public class TripleAray {
    private static int number1;
    private static int number2;
    private static int number3;
    private static int number4;
    private static int [] table = new int[]{1,8,9,2,4};

    public static void main(String[] args) {
        TripleAray tripleAray = new TripleAray();
//        tripleAray.userScanner();
        tripleAray.printNumbers();
        System.out.println("\n**********");
        tripleAray.printInOtherWay();

    }
    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby w dowolnej kolejno�ci. Najpierw" +
                        "wy�wietle pierwotn� tablic�, a nast�pnie odwr�c� kolejno��" +
                        "element�w tablicy");
        System.out.println("Podaj prosz� pierwsz� liczb�: ");
        number1 = scanner.nextInt();
        System.out.println("Podaj prosz� drug� liczb�: ");
        number2 = scanner.nextInt();
        System.out.println("Podaj prosz� trzeci� liczb�: ");
        number3 = scanner.nextInt();
        System.out.println("Na koniec podaj ostatni� liczb�: ");
        number4 = scanner.nextInt();
    }

    private void printNumbers() {
        for (int i:table
             ) {
            System.out.print(i + ", ");
        }
    }
    private void printInOtherWay(){
        for (int i = table.length-1; i>=0; i--){
            System.out.print(table[i] + ", ");
        }
    }



}
