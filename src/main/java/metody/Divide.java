package metody;

import java.util.Scanner;

public class Divide {
    private static double numb1;

    public static void main(String[] args) {
        Divide divide = new Divide();
        divide.userScanner();
        boolean result = divide.isDividedBy3and5();
        System.out.println(result);
    }

    private boolean isDividedBy3and5() {
        if (numb1%3==0 && numb1%5 ==0){
            return true;
        }
        return false;
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz sprawdzimy, czy podana przez Ciebie liczba jest podzielna przez 3 i 5");
        System.out.println("Najpierw podaj pierwsz¹ liczbê: ");
        numb1 = scanner.nextDouble();
    }
}
