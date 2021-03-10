public class TicTacToe {

    private final int[][] board;

    public TicTacToe(int n)
    {
        board = new int[n][n];
    }

    public int playGame(Move m) throws RuntimeException
    {
        if(board[m.getRowID()][m.getColumnID()] != 0)
           throw new IllegalArgumentException("Not a Valid Move");

        board[m.getRowID()][m.getColumnID()] = m.getPlayerID();
        boolean isWinner=true;

        // check the current row
        for(int i=0; i<board.length;i++)
        {
            if(board[m.getRowID()][i] != m.getPlayerID()) {
                isWinner = false;
                break;
            }
        }
        if(isWinner)
            return m.getPlayerID();

        // check the current column
        isWinner=true;
        for (int[] ints : board) {
            if (ints[m.getColumnID()] != m.getPlayerID()) {
                isWinner = false;
                break;
            }
        }
        if(isWinner)
            return m.getPlayerID();


        // check the diagonal 1
        isWinner=true;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][i] != m.getPlayerID()) {
                isWinner = false;
                break;
            }
        }
        if(isWinner)
            return m.getPlayerID();

        // check the diagonal 2
        isWinner= true;
        for(int i=0; i< board.length; i++)
        {
            if(board[i][board.length-i-1] != m.getPlayerID()) {
                isWinner = false;
                break;
            }
        }
        if(isWinner)
            return m.getPlayerID();
        return 0;

    }


}
