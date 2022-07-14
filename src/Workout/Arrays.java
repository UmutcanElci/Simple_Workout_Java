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
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length;i++){
            
        }
    }
}
