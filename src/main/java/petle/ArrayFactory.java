package petle;

public class ArrayFactory {
    private int size;
    private int [] array1;
    private int [][] array2;
    private int [][] matrix;

    public ArrayFactory(int size) {
        this.size = size;
    }

    private int [] oneDimension(){

        return array1 = new int[size];
    }

    private int [][] twoDimension(int size){

        array2 = new int[size][];
        for (int i=0; i<size; i++){
            array2[i] = new int[size];
        }
        return array2;
        // return array2 = new int [size][size];
    }

    private void buildmatrix() {
        matrix = twoDimension(5);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
            System.out.println(matrix);
        }

    }


    public static void main(String[] args) {
        ArrayFactory arrayFactory = new ArrayFactory(5);
        arrayFactory.buildmatrix();
    }
}
