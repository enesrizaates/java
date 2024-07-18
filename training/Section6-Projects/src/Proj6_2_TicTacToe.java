import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();

    }

    public static void runGame() {
        String winner = "";
        String gamer = "X";
        String[][] gameBoard = new String[3][3];
        initializeGame(gameBoard);
        printCurrentBoard(gameBoard);


        while (winner == "") {
            getUserInput(gameBoard, gamer);
            printCurrentBoard(gameBoard);
            if (gamer == "X") {
                gamer = "O";
            }
            else {
                gamer = "X";
            }
            winner = getWinner(gameBoard);
            if (isBoardFull(gameBoard)) {
                winner = "C";
            }
        }
    }

    public static void initializeGame(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }

    public static void printCurrentBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(gameBoard[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-\t-\t-\t-\t-");
        }
    }

    public static boolean isBoardFull(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (gameBoard[i][j] == " ") {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean cellAlreadyOccupied(String[][] gameBoard, int row, int col) {
        if (gameBoard[row][col].equals("X") || gameBoard[row][col].equals("O")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void getUserInput(String[][] gameBoard, String gamer) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("It is " + gamer + "'s turn");
        int row = keyboard.nextInt();
        System.out.println("\t");
        int col = keyboard.nextInt();

        if (cellAlreadyOccupied(gameBoard, row, col)) {
            System.out.println("Cell already occupied, try again!");
            if (gamer == "X") {
                gamer = "O";
            }
            else {
                gamer = "X";
            }
        }
        else {
            gameBoard[row][col] = gamer;
        }
    }

    public static String getWinner(String[][] gameBoard) {
        return "";
    }
}
