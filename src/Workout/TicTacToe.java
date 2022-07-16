package Workout;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        //Board
        char[][] board = new char[3][3];

        //Need to fill the board

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }

        //Players
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 name : ");
        String p1 = input.nextLine();
        System.out.println("Player 2 name : ");
        String p2 = input.nextLine();
System.out.println("Player 1 : "+ p1+"Player 2 : "+ p2);


        //Draw the board
        drawBoard(board);

        //Define whose turn it is
        boolean isPlayer1 = true;

        //Define the player symbol
        char symbol = ' ';
        if(isPlayer1){
            symbol = 'x';
        }
        else{
            symbol = 'o';
        }
        int row = 0;
        int col = 0;
while(true) {
    //Get row and col from the user
    System.out.println("Enter row number (0 ,1 ,2): ");
     row = input.nextInt();
    System.out.println("Enter col number (0, 1, 2): ");
     col = input.nextInt();

    //Check the row and col are valid
    if (row < 0 || col < 0 || row > 2 || col > 2) {
        System.out.println("Wrong input!");
    }
    else if (board[row][col] != '-') {
        System.out.println("Already played look for different row or column");
    }
    else {
        //Valid
        break;
    }

    //Setting the position of the board for player's
    board[row][col] = symbol;
    drawBoard(board);

}

    }

    public static void drawBoard(char[][] board){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

}
