package sortowanie;

import java.util.Scanner;
import static sortowanie.MainSorting.*;

public class UserInput {
    public void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy si� w sortowanie tablicy " +
                "\n(stworzonej z liczb randomowych) na r�ne sposoby.");
        System.out.println("\nPodaj prosze dowoln� liczb�, kt�ra b�dzie rozmiarem tablicy ");
        size = scanner.nextInt();
        System.out.println("Podaj prosze dowoln� liczb�, kt�ra b�dzie maxymaln� liczb� zawart� w tablicy ");
        upperBound = scanner.nextInt();
    }
}
