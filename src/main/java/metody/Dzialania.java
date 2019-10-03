package metody;

import java.util.Scanner;

public class Dzialania {
    private static double numb1;
    private static double numb2;
    private static double result;


    public static void main(String[] args) {
        Dzialania dzialania = new Dzialania();
        dzialania.numberScanner();
        dzialania.sum(numb1,numb2);
        dzialania.mult(numb1,numb2);
        dzialania.div(numb1,numb2);
    }

    private void sum(double numb1, double numb2) {
        result = numb1+numb2;
        System.out.println("Suma dwóch cyfr: " + result);
    }

    private void mult(double numb1, double numb2){
        result = numb1*numb2;
        System.out.println("Wynik mno¿enia dwóch cyfr: " + result);
    }

    private void div(double numb1, double numb2){
        result = numb1/numb2;
        System.out.println("Wynik dzielenia dwóch cyfr: " + result);
    }

    private void numberScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy siê w liczenie.");
        System.out.println("Najpierw podaj pierwsz¹ liczbê: ");
        numb1 = scanner.nextDouble();
        System.out.println("Teraz podaj drug¹ liczbê: ");
        numb2 = scanner.nextDouble();

    }
}
