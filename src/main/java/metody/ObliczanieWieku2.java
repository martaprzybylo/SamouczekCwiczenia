package metody;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ObliczanieWieku2 {
    private static int age;
    private static int year;
    private static int month;
    private static int day;
    private static LocalDate birthDate;

    public static void main(String[] args) {
        ObliczanieWieku2 obliczanieWieku2 = new ObliczanieWieku2();
        obliczanieWieku2.userScanner();

        birthDate = LocalDate.of(year,month,day);
        age = obliczanieWieku2.getAge(birthDate);
        System.out.println("Obecnie masz " + age + " lat:)");

    }

    private int getAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        age = Period.between(birthDate, today).getYears();
        return age;
    }

    private void userScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poprosze teraz o Twoj¹ datê urodzenia.");
        System.out.println("Najpierw podaj rok: ");
        year = scanner.nextInt();
        System.out.println("Teraz podaj miesi¹c w formacie mm: ");
        month = scanner.nextInt();
        System.out.println("Na koniec podaj dzieñ w formacie dd: ");
        day = scanner.nextInt();
    }
}
