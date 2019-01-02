public class NoughtsAndCrosses {
    private Input[][] board;

    public void newGame() {
        board = new Input[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = Input.EMPTY;
            }
        }

        System.out.println("-------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("|");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col].representation + "|");
            }
            System.out.println("\n-------");
        }
    }

    private enum Input {
        EMPTY(' '), NOUGHT('o'), CROSS('x');

        private char representation;

        Input(char representation) {
            this.representation = representation;
        }
    }
}
