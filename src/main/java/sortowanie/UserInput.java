package sortowanie;

import java.util.Scanner;
import static sortowanie.MainSorting.*;

public class UserInput {
    public void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy siê w sortowanie tablicy " +
                "\n(stworzonej z liczb randomowych) na ró¿ne sposoby.");
        System.out.println("\nPodaj prosze dowoln¹ liczbê, która bêdzie rozmiarem tablicy ");
        size = scanner.nextInt();
        System.out.println("Podaj prosze dowoln¹ liczbê, która bêdzie maxymaln¹ liczb¹ zawart¹ w tablicy ");
        upperBound = scanner.nextInt();
    }
}
