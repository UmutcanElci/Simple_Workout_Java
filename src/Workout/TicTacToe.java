package Workout;

import java.util.Scanner;

public class TicTacToe {
// That's a tutorial for ticktacktoe
    public static void main(String[] args) {
        //Board
        String[][] board = new String[3][3];

        //Need to fill the board

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
        //Define whose turn it is
        boolean isPlayer1 = true;
        //Players
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 name : ");
        String p1 = input.nextLine();
        System.out.println("Player 2 name : ");
        String p2 = input.nextLine();
//keep track if the game has ended
        boolean gameEnded = false;
while(!gameEnded) {
    //Draw the board
    drawBoard(board);


    //Define the player symbol
    String symbol = "-";

    if (isPlayer1) {
        symbol = "X";
    } else {
        symbol = "O";
    }
    //Turn
    if (isPlayer1) {
        System.out.println(p1 + "'s Turn");
    } else {
        System.out.println(p2 + "'s Turn");
    }
    int row = 0;
    int col = 0;

    while (true) {
        //Get row and col from the user
        System.out.println("Enter row number (0 ,1 ,2): ");
        row = input.nextInt();
        System.out.println("Enter col number (0, 1, 2): ");
        col = input.nextInt();

        //Check the row and col are valid
        if (row < 0 || col < 0 || row > 2 || col > 2) {
            System.out.println("Wrong input!");
        } else if (board[row][col] != "-") {
            System.out.println("Already played look for different row or column");
        } else {
            //Valid
            break;
        }

        //Setting the position of the board for player's
        board[row][col] = symbol;

        //Check if player has won
        if (hasWon(board) == "-") {
            System.out.println(p1 + "has won");

        } else if (hasWon(board) == "0") {
            System.out.println(p2 + "has won");
        } else {
            if (hasTied(board)) {
                System.out.println("Tie!");
            } else {

            }

        }

    }
}

    }

    public static void drawBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    public static String hasWon(String[][] board) {
        //Row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != "-") {
                return board[i][0];
            }
        }

        //Col
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != "-") {
                return board[0][j];
            }
        }

        //Diagonals

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "-" ) {
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != "-"){
            return board[2][0];
        }

        //Nobody won
        return "-";
    }

    //Check if the board is full

    public static boolean hasTied(String[][] board){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                if(board[i][j] == "-"){
                    return false;
                }
            }
        }
        return true;
    }
}
