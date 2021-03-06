public class Board {
    private Input[][] board;

    public Board() {
        this.board = new Input[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = Board.Input.EMPTY;
            }
        }
    }

    public void printBoard() {
        System.out.println("-------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("|");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col].getRepresentation() + "|");
            }
            System.out.println("\n-------");
        }
    }

    /*
        Positions on the board are defined as follows:
        -------
        |0|1|2|
        -------
        |3|4|5|
        -------
        |6|7|8|
        -------
     */
    public void setCell(Input input, int position) {
        board[position / 3][position % 3] = input;
    }

    public Input[][] getBoard() {
        return board;
    }

    public enum Input {
        EMPTY(' '), NOUGHT('o'), CROSS('x');

        private char representation;

        Input(char representation) {
            this.representation = representation;
        }

        public char getRepresentation() {
            return representation;
        }
    }
}
