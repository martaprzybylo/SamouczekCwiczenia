package metody;

import java.util.Scanner;

public class Pierwiastek {

    private static double numb1;
    private static double result;

    public static void main(String[] args) {
        Pierwiastek pierwiastek = new Pierwiastek();
        pierwiastek.userScanner();
        pierwiastek.sqrtOfNumber(numb1);

    }

    private void sqrtOfNumber(double numb1) {
        result = Math.sqrt(numb1);
        System.out.println("Wynik to: " + result);
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy si� w liczenie.");
        System.out.println("Podaj prosz� liczb�, a ja zwr�c� jej pierwiastek kwadratowy: ");
        numb1 = scanner.nextDouble();

    }
}
