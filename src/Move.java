public class Move {

    private int playerID;
    private int rowID;
    private int columnID;

    public Move(int playerID, int rowID, int columnID)
    {
        this.playerID = playerID;
        this.rowID = rowID;
        this.columnID = columnID;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getRowID() {
        return rowID;
    }

    public int getColumnID() {
        return columnID;
    }

}
