package obiektyIPakiety;

import java.math.BigInteger;
import java.util.Scanner;

public class MyNumber {
    private double number;
    private MyNumber result;

    public MyNumber(double number) {
        this.number = number;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bazow� liczb�, " +
                "a ja sprawdz�, czy jest przysta lub nieparzysta, " +
                "wylicz� jej pierwiastek kwadratowy" +
                "oraz co� dodatkowego)");
        System.out.println("Podaj prosz� liczb� bazow�. ");
        double number = scanner.nextDouble();
        System.out.println("Podaj prosz� jeszcze jedn� liczb�. ");
        MyNumber number2 = new MyNumber(scanner.nextDouble());


        MyNumber myNumber1 = new MyNumber(number);

        System.out.println("Czy Liczba jest nieparzysta? " + myNumber1.isOdd());
        System.out.println("Czy Liczba jest parzysta? " + myNumber1.isEven());
        System.out.println("Pierwiastek kwadratowy z liczby to: " + myNumber1.sqrt());
        System.out.println("Liczba bazowa podniesiona do pot�gi o warto�ci kt�r� poda�e� w drugiej " +
                "kolejno�ci " + myNumber1.power(number2));
        System.out.println("Suma podanych liczb to: " + myNumber1.add(number2));
        System.out.println("R�nica podanych liczb to: " + myNumber1.subtract(number2));


    }

    private MyNumber subtract(MyNumber number2) {
        result = new MyNumber(number-number2.number);
        return result;
    }

    private MyNumber add(MyNumber number2) {
        result = new MyNumber(number + number2.number);
        return result;
    }


    private double sqrt() {
        return Math.sqrt(number);
    }

    private boolean isEven() {
        if (number%2==0){
            return true;
        }
        return false;
    }

    private boolean isOdd() {
        if (!isEven()){
            return true;
        }
        return false;
    }

    public MyNumber power(MyNumber number2){

        result = new MyNumber(Math.pow(number, number2.number));
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
