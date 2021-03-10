import java.util.Scanner;

public class Application {

    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;

    public static  void main(String[] args) {
        TicTacToe game = new TicTacToe(3);

        Scanner myObj = new Scanner(System.in);
        int winner;

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Hey PLAYER1, make a move!");
                int row = myObj.nextInt();
                int col = myObj.nextInt();
                winner = game.playGame(new Move(PLAYER1, row, col));
            } else {
                System.out.println("Hey PLAYER2, make a move!");
                int row = myObj.nextInt();
                int col = myObj.nextInt();
                winner = game.playGame(new Move(PLAYER2, row, col));
            }
            System.out.println(getWinner(winner));
        }

    }
    public static String getWinner(int winID)
    {
        return switch (winID) {
            case 0 -> "OOPS! Its a DRAW!!";
            case 1 -> "Player1 won!!";
            case 2 -> "Player2 won!!";
            default -> "";
        };
    }
}
