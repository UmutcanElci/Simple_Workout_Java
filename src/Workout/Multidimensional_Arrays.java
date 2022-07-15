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
    //The thing I can't solve is when I call this method in my main program wants a array[][] with values I found one thing and that's not the actual solutions.
    //I give my array a value like[10][10] we give huge value cause when the program ask the row and col the values changed, and we can input the 2D array values.

    public static void printfSumOfTwoMatrix(int[][] array1,int[][] array2){
        Scanner input = new Scanner(System.in);
        int row = 0;
        int col = 0;
        row = input.nextInt();
        col = input.nextInt();
        int sum[][] = new int[row][col];
        for(int i = 0; i< row;i++){
            for(int a = 0; a< col;a++){
                sum[i][a] = array1[i][a] + array2[i][a];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int a = 0; a < sum.length; a++) {
                System.out.print(sum[i][a] + " ");
            }
            System.out.println();
        }
    }

    public static void printListArray(String [][] names){

    }
    }

