package sortowanie;
import static sortowanie.MainSorting.*;

public class SelectSort {

    public void sort(int [] arrayToSort){

        for (int i = 0; i<size-1; i++){
            minIndex = i;
            for (int j = i+1; j<size; j++){
                if (arrayToSort[minIndex]>arrayToSort[j]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                Swap.swap(arrayToSort,minIndex,i);
            }
        }
    }
}
