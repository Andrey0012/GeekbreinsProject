import java.util.Arrays;

public class MyClass {
    public static void main(String[] args){
        byte[] binArray = {1, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        for(int i = 0; i < binArray.length; i++) System.out.print(binArray[i] + " ");
        for(int i = 0; i < binArray.length; i++){
            if(binArray[i] == 0) binArray[i] = 1;
            else binArray[i] = 0;
        }
        System.out.println();
        for(int i = 0; i < binArray.length; i++) System.out.print(binArray[i] + " ");

        int[] intArray = new int[8];
        int a = 0;
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = a;
            a += 3;
        }
        System.out.println();
        for(int i = 0; i < intArray.length; i++) System.out.print(intArray[i] + " ");

        System.out.println();
        int[] randIntArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < randIntArray.length; i++) System.out.print(randIntArray[i] + " ");
        for(int i = 0; i < randIntArray.length; i++){
            if(randIntArray[i] < 6) randIntArray[i] *= 2;
        }
        System.out.println();
        for(int i = 0; i < randIntArray.length; i++) System.out.print(randIntArray[i] + " ");
        System.out.println();

        int[][] squareArray = new int[5][5];
        for(int i = 0; i < squareArray.length; i++){
            for( int j = 0; j < squareArray[i].length; j++){
                if(i == j) squareArray[i][j] = 1;
                else  squareArray[i][j] = 0;
            }
        }
        for(int i = 0; i < squareArray.length; i++){
            for( int j = 0; j < squareArray[i].length; j++){
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        int[] randArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = 0;
        for(int i = 0; i < randArray.length; i++){
            if(randArray[i] > max) max = randArray[i];
        }
        int min = max; //12
        for(int i = 0; i < randArray.length; i++){
            if(randArray[i] < min) min = randArray[i];
        }
        System.out.println("максимальное значение массива: " + max + ", " + "минимальное значение массива: " + min);

        int[] testArray1 = {1, 1, 1, 1, 1, 1, 2, 2};
        int[] testArray2 = {0, 1, 1, 3, 1, 1, 1, 1};
        int[] testArray3 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] testArray4 = {1, 2, 3, 4, 5, 6, 7, 280};
        int[] testArray5 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(halfArray(testArray1));
        System.out.println(halfArray(testArray2));
        System.out.println(halfArray(testArray3));
        System.out.println(halfArray(testArray4));
        System.out.println(halfArray(testArray5));

        moveArray(testArray5, 2);
        moveArray(testArray5, 0);
        moveArray(testArray5, - 4);

    }

    public static boolean halfArray(int[] array){
        int sumArray = 0;
        int sumTemp = 0;
        for(int i = 0; i < array.length; i++){
            sumArray +=array[i];
        }
        int halfSum = sumArray / 2;
        if((sumArray % 2) == 0){
            for(int i = 0; i < array.length; i++){
                sumTemp += array[i];
                if(sumTemp == halfSum) return true;
                else continue;
            }
            return false;
        }
        else return false;
    }
    public static void moveArray(int[] array, int pos){
        if(pos < 0){
            pos = -pos;
            int size = array.length;
            for(int i = 0; i < pos; i++){
                int temp = array[0];
                for(int j = 0; j < size - 1; j++){
                    array[j] = array[j+1];
                }
                array[size - 1] =temp;
            }
            System.out.println(Arrays.toString(array));
        }
        else if(pos > 0){
            int size = array.length;
            for(int i =0; i < pos; i++){
                int temp = array[size - 1];
                for(int j = size - 1; j > 0; j--){
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
        else System.out.println(Arrays.toString(array));
    }
}


