//import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args){

        int playerChoice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe.");
        System.out.println("Rules-");
        System.out.println("Player 1 plays with X");
        System.out.println("Player 2/Computer plays with O");
        System.out.println("Select the option of whom you want to play against-");
        System.out.println("1. Another Player");
        System.out.println("2. Computer");
        playerChoice = sc.nextInt();

        if(playerChoice == 1) {
            TicTacToeClass ticTacToeClass = new TicTacToeClass();
            ticTacToeClass.initializeBoard();
            ticTacToeClass.showBoardInstructions();
            System.out.println("Let us begin now!");
            ticTacToeClass.drawBoard();
            ticTacToeClass.setCurrentPlayerMove();
        }
        else if(playerChoice == 2){
            TicTacToeComputer ticTacToeComputer = new TicTacToeComputer();
            ticTacToeComputer.initializeBoard();
            ticTacToeComputer.showBoardInstructions();
            System.out.println("Let us begin now!");
            ticTacToeComputer.drawBoard();
            ticTacToeComputer.setCurrentPlayerMove();
        }else{
            System.out.println("Wrong Choice. Please start the program again.");
            System.exit(0);
        }


    }
}
