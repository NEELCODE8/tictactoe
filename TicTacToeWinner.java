// src/TicTacToeWinner.java
import javax.swing.*;

public class TicTacToeWinner {
    private TicTacToeUI ui;

    public TicTacToeWinner(TicTacToeUI ui) {
        this.ui = ui;
    }

    public void checkForWinner() {
        // Winner detection code remains unchanged
    }

    public void resetGame() {
        for (JButton button : ui.buttons) {
            button.setText("");
            button.setEnabled(true);
        }
    }
}
