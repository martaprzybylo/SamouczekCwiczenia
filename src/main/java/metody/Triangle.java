package metody;

import java.util.Scanner;

public class Triangle {
    private static double sideA;
    private static double sideB;
    private static double sideC;

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.userScanner();
        boolean result = triangle.isTriangleRectangular(sideA, sideB, sideC);
        System.out.println(result);
    }

    private boolean isTriangleRectangular(double sideA, double sideB, double sideC) {
        if (Math.pow(sideA,2) + Math.pow(sideB,2) == Math.pow(sideC,2)||
                Math.pow(sideA,2) + Math.pow(sideC,2) == Math.pow(sideB,2)||
                Math.pow(sideC,2) + Math.pow(sideB,2) == Math.pow(sideA,2))
            return true;
        return false;
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj d³ugoœci trzech boków trójk¹ta, " +
                "a ja sprawdzê, czy mo¿emy z nich stworzyæ trójk¹t prostok¹tny");
        System.out.println("Najpierw podaj bok a: ");
        sideA = scanner.nextDouble();
        System.out.println("Teraz podaj bok b: ");
        sideB = scanner.nextDouble();
        System.out.println("Na koniec podaj bok c: ");
        sideC = scanner.nextDouble();
    }
}
