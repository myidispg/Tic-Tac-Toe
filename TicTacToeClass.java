import java.util.Scanner;


public class TicTacToeClass {

    public char[][] board = new char[3][3];
    public int currentPlayerMove = 1;
    public int moveNumber = 1;
    public int winner;

    Scanner sc = new Scanner(System.in);

    public void initializeBoard(){

        for(int i =0; i<3; i++){
            for(int j =0 ; j<3; j++){
                board[i][j] = '-';
            }
        }
    }
    public void showBoardInstructions(){
        System.out.println("The board is numbered as - ");
        System.out.println();
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();
        System.out.println("The player will chose the corresponding number to play his move.");
    }

    public void drawBoard(){
        System.out.println();
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | "+ board[0][2]);
        System.out.println("-----------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | "+ board[1][2]);
        System.out.println("-----------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | "+ board[2][2]);
    }

    public void setCurrentPlayerMove() {

        int currentMove;

        if (moveNumber != 0 && moveNumber < 10) {
            if (currentPlayerMove == 1) {
                System.out.println("Player 1's move -");
                currentMove = sc.nextInt();
                convertMoveToArray(currentMove);
                drawBoard();
                if (moveNumber >= 5) {
                    if(checkWinner())
                        playAgain();
                    else {
                        currentPlayerMove = 2;
                        moveNumber++;
                        setCurrentPlayerMove();
                    }
                }
                else {
                    moveNumber++;
                    currentPlayerMove = 2;
                    setCurrentPlayerMove();
                }
            }
            if (currentPlayerMove == 2) {
                System.out.println("Player 2's move - ");
                currentMove = sc.nextInt();
                convertMoveToArray(currentMove);
                drawBoard();
                if (moveNumber >= 5) {
                    if(checkWinner())
                        playAgain();
                    else {
                        currentPlayerMove = 1;
                        moveNumber++;
                        setCurrentPlayerMove();
                    }

                }
                else {
                    currentPlayerMove = 1;
                    moveNumber++;
                    setCurrentPlayerMove();
                }
            }
        }

        if(moveNumber == 10)
            System.out.println("The match is a draw.");
    }

    public void convertMoveToArray(int move){
        if(currentPlayerMove == 1){
            switch (move){
                case 1 : board[0][0] = 'X';
                        break;
                case 2 : board[0][1] = 'X';
                    break;
                case 3 : board[0][2] = 'X';
                    break;
                case 4 : board[1][0] = 'X';
                    break;
                case 5 : board[1][1] = 'X';
                    break;
                case 6 : board[1][2] = 'X';
                    break;
                case 7 : board[2][0] = 'X';
                    break;
                case 8 : board[2][1] = 'X';
                    break;
                case 9 : board[2][2] = 'X';
                    break;
            }
        }else if(currentPlayerMove == 2){
            switch (move){
                case 1 : board[0][0] = 'O';
                    break;
                case 2 : board[0][1] = 'O';
                    break;
                case 3 : board[0][2] = 'O';
                    break;
                case 4 : board[1][0] = 'O';
                    break;
                case 5 : board[1][1] = 'O';
                    break;
                case 6 : board[1][2] = 'O';
                    break;
                case 7 : board[2][0] = 'O';
                    break;
                case 8 : board[2][1] = 'O';
                    break;
                case 9 : board[2][2] = '0';
                    break;
            }

        }
    }

    public boolean checkWinner() {

        if(moveNumber >= 5){
            if (board[0][0] == board[0][1] && board[0][0] == board[0][2]) {
                if(board[0][0] == 'X')
                {
                    winner = 1;
                }else if(board[0][0] == 'O')
                    winner = 2;
            }
            else if (board[1][0] == board[1][1] && board[1][0] == board[1][2]) {
                if(board[1][0] == 'X')
                {
                    winner = 1;
                }else if(board[1][0] == 'O')
                    winner = 2;
            }
            else if (board[2][0] == board[2][1] && board[2][0] == board[2][2]) {
                if(board[2][0] == 'X')
                {
                    winner = 1;
                }else if(board[2][0] == 'O')
                    winner = 2;
            }
            else if (board[0][2] == board[1][1] && board[0][2] == board[2][1]) {
                if(board[0][2] == 'X')
                {
                    winner = 1;
                }else if(board[0][2] == 'O')
                    winner = 2;
            }
            else if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
                if(board[0][0] == 'X')
                {
                    winner = 1;
                }else if(board[0][0] == 'O')
                    winner = 2;
            }
            else if (board[0][0] == board[1][0] && board[0][0] == board[2][0]) {
                if(board[0][0] == 'X')
                {
                    winner = 1;
                }else if(board[0][0] == 'O')
                    winner = 2;
            }
            else if (board[0][1] == board[1][1] && board[0][1] == board[2][1]) {
                if(board[0][1] == 'X')
                {
                    winner = 1;
                }else if(board[0][1] == 'O')
                    winner = 2;
            }
            else if (board[0][2] == board[1][2] && board[0][2] == board[2][2]) {
                if(board[0][2] == 'X')
                {
                    winner = 1;
                }else if(board[0][2] == 'O')
                    winner = 2;
            }
        }

        if(winner == 1) {
            System.out.println("Player 1 wins!!!");
            winner = 0;
            return true;
        }
        else if(winner == 2){
            System.out.println("Player 2 wins!!!");
            winner = 0;
            return true;
        } else
            return false;
    }

    public void playAgain() {
        char playAgain;
        System.out.println("Do you want to play again?(Y/N)");
        playAgain = sc.next().charAt(0);
        if(playAgain == 'y' || playAgain == 'Y')
        {
            moveNumber = 1;
            currentPlayerMove = 1;
            initializeBoard();
            drawBoard();
            setCurrentPlayerMove();
        }
        else if(playAgain == 'n' || playAgain == 'N')
        {
            System.exit(0);
        }
    }
}
