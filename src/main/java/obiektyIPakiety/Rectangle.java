package obiektyIPakiety;

import java.util.Scanner;

public class Rectangle {
    private double lenght;
    private double widht;
    private double result;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.userScaner();
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.getDiagonal();

    }

    private void getDiagonal() {
        result = Math.sqrt(Math.pow(lenght,2) + Math.pow(widht,2));
        System.out.println("Przek�tna prostok�ta wynosi " + result);
    }

    private void getArea() {
        result = lenght*widht;
        System.out.println("Pole prostok�ta wynosi " + result);
    }

    private void getPerimeter() {
        result = (lenght+widht)*2;
        System.out.println("Obw�d prostok�ta wynosi " + result);
    }

    private void userScaner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj d�ugo�ci bok�w prostok�ta, " +
                "a ja oblicz� pole, obw�d i przek�tn�");
        System.out.println("Najpierw podaj bok a: ");
        lenght = scanner.nextDouble();
        System.out.println("Teraz podaj bok b: ");
        widht = scanner.nextDouble();
    }


}
