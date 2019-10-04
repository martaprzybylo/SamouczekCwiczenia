package sortowanie;

import static sortowanie.MainSorting.*;

public class BubbleSort {

    public void sort(int [] arrayToSort) {
        while (iterator<size-1 && swapped){
            swapped = false;
            for (int i =0; i< size-1 - iterator; i++){
                if (arrayToSort[i]>arrayToSort[i+1]){
                    Swap.swap(arrayToSort,i,i+1);
                    swapped = true;
                }
            }
            iterator++;
        }

    }
}
