package Workout;

import java.util.Scanner;

public class Multidimensional_Arrays {

    public static void printMultiArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array.length; a++) {
                System.out.print(array[i][a] + " ");
            }
            System.out.println();
        }
    }

    /* //Wrong need to solve again.
    public static void inputAndPrintf2DArray(int[][] array) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        row = input.nextInt();
        col = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int a = 0; a < col; a++) {
                array[i][a] = input.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array.length; a++) {
                System.out.print(array[i][a] + " ");
            }
            System.out.println();
        }

     */
    }

