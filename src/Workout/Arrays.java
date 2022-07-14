package Workout;

public class Arrays {
    public static void printIntArray(int[] array){
        for (int i = 0; i < array.length;i++) {
            System.out.print(" " + i);
        }
    }

    public static void printIntArraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length;i++){
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void printAvgIntArray(int[] array){
        int sum = 0;
        int avg;
        for(int i = 0; i < array.length;i++){
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println(avg);
    }

    public static void printMaxMinValueOfArray(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length;i++){
            //array[] = {4,7,3,1,9}
            //4 < 4 false 7 < 4 false 3 < 4 true 1 < 3 true 9 < 1 false so min value is  1.
            if(array[i] < min){
                min = array[i];
            }
            //4 > 4 false 7 > 4 true 3 > 7 false 1 > 7 false 9 > 7 true so max vale is 9.
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max value of the array : "+ max);
        System.out.println("Min value of the array : "+ min);
    }

    public static void printSelectionSortIntArray(int[] array){
        // let say our array[4, 2, 7, 1, 8, 5, 9]
        int temp;
        //temp is a holder.

        for(int i = 0; i < array.length; i++){
            for(int a = i + 1; a<array.length;a++){
                if(array[i]> array[a]){
                    temp = array[i];
                    array[i] = array[a];
                    array[a] = temp;
                }
            }
            // So the logic is simple we look side by side the values.
            // first index is bigger than the second index swap.
        }
        for(int i = 0; i<array.length;i++){
            System.out.print(" "+array[i]);
        }

    }

    public static void printInsertionSortIntArray(int[] array){
        //Insert Sort one of the other sorting technique start with first index[1] and compare the zero index[0].
        //If the [1]>[0] swap it and look for the next indexes.
        int temp;
        int a;
        for(int i = 1; i < array.length;i++){
             temp = array[i];//Index 1
             a = i -1;//Index 0
             while (a>=0 && array[a] > temp){
                 array[a+1] = array[a];
                 a = a-1;
             }
             array[a+1] = temp;
        }
        for(int i = 0; i<array.length;i++){
            System.out.print(" "+array[i]);
        }

    }
}
