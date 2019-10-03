package petle;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    private static int size;
    private static int iterator = 0;
    private static int upperBound;
    private static int [] array;
    private static boolean swapped = true;

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.userScanner();
        bubbleSort.createArray();
        bubbleSort.printArray(array);
        System.out.println();
        bubbleSort.sort(array);
        bubbleSort.printArray(array);
    }

    private void userScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz pobawimy siê w sortowanie b¹belkowe tablicy" +
                "\nstworzonej z liczb randomowych.");
        System.out.println("\nPodaj prosze dowoln¹ liczbê, która bêdzie rozmiarem tablicy ");
        size = scanner.nextInt();
        System.out.println("Podaj prosze dowoln¹ liczbê, która bêdzie maxymaln¹ liczb¹ zawart¹ w tablicy ");
        upperBound = scanner.nextInt();
    }

    private void printArray(int [] arrayToPrint) {
        for (int numb:arrayToPrint) {
            System.out.print(numb + ", ");
        }

    }

    private int [] createArray() {
        Random random = new Random();
        array = new int[size];
        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(upperBound+1);
        }
       return array;
    }

    public void sort(int [] arrayToSort) {
        while (iterator<size-1 && swapped){
            swapped = false;
            for (int i =0; i< size-1 - iterator; i++){
                if (arrayToSort[i]>arrayToSort[i+1]){
                    swap(arrayToSort,i,i+1);
                    swapped = true;
                }
            }
            iterator++;
        }

    }

    private void swap(int[] array, int inex1, int inex2) {
        int temp = array[inex1];
        array[inex1] = array[inex2];
        array[inex2] = temp;
    }


}
