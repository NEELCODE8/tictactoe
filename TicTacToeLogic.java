// src/TicTacToeLogic.java
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeLogic implements ActionListener {
    private TicTacToeUI ui;
    private TicTacToeWinner winner; // Reference to the TicTacToeWinner class
    private boolean xTurn = true;

    // Constructor to initialize the UI and winner components
    public TicTacToeLogic(TicTacToeUI ui, TicTacToeWinner winner) {
        this.ui = ui;
        this.winner = winner; // Assign the winner object
        for (JButton button : ui.buttons) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (xTurn) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        button.setEnabled(false);
        xTurn = !xTurn;

        // Call winner detection
        winner.checkForWinner();
    }

    public void setXTurn(boolean xTurn) {
        this.xTurn = xTurn;
    }
}
