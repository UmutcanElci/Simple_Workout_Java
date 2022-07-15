package Workout;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];
        for(int i =0; i<3;i++){
            for (int a = 0; a<3;a++){
                board[i][a] = '-';
            }
        }
        char a = '-';

        int row;
        int col;
        System.out.println("Tic Tac Toe starting ");
        while(true) {
            System.out.println("Enter row number : ");
            row = input.nextInt();
            System.out.println("Enter col number : ");
            col = input.nextInt();
            if (row < 0 || col < 0 || row > 0 || col > 0) {
                System.out.println("Wrong row or col input!");
            } else {
                break;
            }
        }
            board[row][col] = a;

            System.out.println("Board : ");
            for (int i = 0; i<3;i++){
                for (int j = 0; j<3;j++){
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();


    }
}
