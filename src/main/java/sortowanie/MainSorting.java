package sortowanie;

import java.util.Arrays;

public class MainSorting {
    protected static int size;
    protected static int iterator = 0;
    protected static int minIndex;
    protected static int upperBound;
    protected static int [] array1;
    protected static boolean swapped = true;

    public static void main(String[] args) {
        MainSorting mainSorting = new MainSorting();
        ArraysClass arraysClass = new ArraysClass();
        UserInput userInput = new UserInput();
        BubbleSort bubbleSort = new BubbleSort();
        SelectSort selectSort = new SelectSort();

        userInput.userScanner();
        arraysClass.createArray();
        int [] array2 = Arrays.copyOf(array1, array1.length);
        int [] array3 = Arrays.copyOf(array1, array1.length);
        int [] array4 = Arrays.copyOf(array1, array1.length);
        int [] array5 = Arrays.copyOf(array1, array1.length);

        System.err.println("Sortowanie b¹belkowe");
        arraysClass.printArray(array1);
        System.out.println();
        bubbleSort.sort(array1);
        arraysClass.printArray(array1);

        System.out.println("\n******************************");

        System.err.println("Select Sort");
        arraysClass.printArray(array2);
        System.out.println();
        selectSort.sort(array2);
        arraysClass.printArray(array2);

        System.err.println("");
    }








}
