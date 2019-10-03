package metody;

import java.util.Scanner;

public class Even {
    public static int numb1;


    public static void main(String[] args) {
        Even even = new Even();
        even.userScanner();
        boolean isEven = even.czyParzysta(numb1);
        System.out.println(isEven);
    }

    private boolean czyParzysta(int numb1) {
        if (numb1%2==0){
            return true;
        }
        return false;
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz sprawdzimy, czy podana przez Ciebie liczba jest parzysta.");
        System.out.println("Podaj proszê liczbê: ");
        numb1 = scanner.nextInt();

    }
}
