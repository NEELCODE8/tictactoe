
public class Main {
    public static void main(String[] args) {

        TicTacToeUI ui = new TicTacToeUI();

        TicTacToeWinner winner = new TicTacToeWinner(ui);
        TicTacToeLogic logic = new TicTacToeLogic(ui, winner);
    }
}
