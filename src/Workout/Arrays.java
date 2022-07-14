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
            //4 < 4 false 7 < 4 false 3 < 4 true 1 < 3 true 9 < 1 false so min value is  1
            if(array[i] < min){
                min = array[i];
            }
            //4 > 4 false 7 > 4 true 3 > 7 false 1 > 7 false 9 > 7 true so max vale is 9
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max value of the array : "+ max);
        System.out.println("Min value of the array : "+ min);
    }

    public static void printReversedIntArray(int[] array){
        // let say our array[4, 2, 7, 1, 8, 5, 9]
        int temp;
        //temp is a holder

    }
}
