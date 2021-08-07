public class MyClass3 {
    public static void main(String [] args) {
        byte[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (byte i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (byte i = 0; i < nums.length; i++) {
            if (nums[i] == 1) nums[i] = 0;
            else nums[i] = 1;
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) System.out.print(nums[i] + " ");
        System.out.println();




        int[] nums2 = new int[8];
        for (int i = 0; i < 22; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();



        byte[] nums3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (byte i = 0; i < nums3.length; i++) System.out.print(nums3[i] + " ");
        for (byte i = 0; i < nums3.length; i++) {
            if (nums3 [i] < 6) nums3[i] *= 2;
        }
        System.out.println();
        for (byte i = 0; i < nums3.length; i++) System.out.print(nums3[i] + " ");
        System.out.println();



        int peremen = 10;
        int [][] nums4 = new int[5][5];
        for (int i = 0; i < nums4.length; i++) {
            for (int j = 0; j < nums4[i].length; j++) {
                nums4 [i][j] = peremen;
                peremen++;
            }

        }
        for (int i = 0; i < nums4.length; i++) {
            for (int j = 0; j < nums4[i].length; j++) {
                if (i == j) nums4 [i][j] = 1;
            }

        }
        printArr(nums4);



        byte[] randArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = 0;
        for(int i = 0; i < randArray.length; i++){
            if(randArray[i] > max) max = randArray[i];
        }
        int min = max;
        for(int i = 0; i < randArray.length; i++){
            if(randArray[i] < min) min = randArray[i];
        }
        System.out.print("максимальное значение массива: " + max + ", " + "минимальное значение массива: " + min );
        System.out.println();



        int[] testArray1 = {1,2,2,1};
        int[] testArray2 = {0, 1, 1, 3, 1, 1, 1, 8};
        int[] testArray3 = {1, 2, 3, 4, 4, 3, 2, 200};
        int[] testArray4 = {1, 2, 3, 4, 5, 6, 7, 3};
        int[] testArray5 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(halfArray(testArray1));
        System.out.println(halfArray(testArray2));
        System.out.println(halfArray(testArray3));
        System.out.println(halfArray(testArray4));
        System.out.println(halfArray(testArray5));



    }
    public static void printArr(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static boolean halfArray(int [] array) {
        int summa = 0;
        int summatemp = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        int halfSumma = summa / 2;
        for (int i = 0; i < array.length; i++) {
            summatemp += array[i];
            if (summatemp == halfSumma) return true;
        }
        return false;
    }

}