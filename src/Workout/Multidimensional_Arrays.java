package Workout;

public class Multidimensional_Arrays {
    public static void printMultiArray(int[][] array){
        for(int i = 0; i< array.length;i++){
            for(int a = 0; a< array.length;a++){
                System.out.print(array[i][a] + " ");
            }
            System.out.println();
        }
    }
}
