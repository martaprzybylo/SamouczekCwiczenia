package metody;

import java.util.Scanner;

public class Power {
    private static double numb1;
    private static double numb2;
    private static double result;

    public static void main(String[] args) {
        Power power = new Power();
        power.userScanner();
        power.numberToPow3(numb1,numb2);

    }

    private void numberToPow3(double numb1, double numb2) {
       result = Math.pow(numb1,numb2);
        System.out.println(result);
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy si� w liczenie.");
        System.out.println("Podaj prosz� liczb�: ");
        numb1 = scanner.nextDouble();
        System.out.println("Teraz podaj, do kt�rej pot�gi mam podnie�� podan� przez Ciebie liczb�");
        numb2 = scanner.nextDouble();
    }
}
