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
        System.out.println("Podaj bazow¹ liczbê, " +
                "a ja sprawdzê, czy jest przysta lub nieparzysta, " +
                "wyliczê jej pierwiastek kwadratowy" +
                "oraz coœ dodatkowego)");
        System.out.println("Podaj proszê liczbê bazow¹. ");
        double number = scanner.nextDouble();
        System.out.println("Podaj proszê jeszcze jedn¹ liczbê. ");
        MyNumber number2 = new MyNumber(scanner.nextDouble());


        MyNumber myNumber1 = new MyNumber(number);

        System.out.println("Czy Liczba jest nieparzysta? " + myNumber1.isOdd());
        System.out.println("Czy Liczba jest parzysta? " + myNumber1.isEven());
        System.out.println("Pierwiastek kwadratowy z liczby to: " + myNumber1.sqrt());
        System.out.println("Liczba bazowa podniesiona do potêgi o wartoœci któr¹ poda³eœ w drugiej " +
                "kolejnoœci " + myNumber1.power(number2));
        System.out.println("Suma podanych liczb to: " + myNumber1.add(number2));
        System.out.println("Ró¿nica podanych liczb to: " + myNumber1.subtract(number2));


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
