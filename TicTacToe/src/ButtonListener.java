import javax.swing.*;
import java.awt.event.*;

public class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e){
        if(button.getText().equals("")){

        }
    }

    private JButton[][] button;
    public ButtonListener(JButton[][] button){
        this.button = button;
    }
    public boolean isButtonEmpty(int x, int y) {
        if (button[x][y].getText().equals("")) {
            return true;
        }
        System.out.println("Selected cell is blocked.");
        return false;
    }


    public boolean checkBoardForMatch() {
        for (int i = 0; i < 3; i++) {
            if (checkCellMatch(button[0][i], button[1][i], button[2][i])
                    || checkCellMatch(button[i][0], button[i][1], button[i][2])
                    || checkCellMatch(button[0][0], button[1][1], button[2][2])
                    || checkCellMatch(button[2][0], button[1][1], button[0][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCellMatch(JButton b1, JButton b2, JButton b3) {
        if (b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText()) && !b3.getText().equals("")) {
            if (b1.getText().equals('X')) {
                this.setWinner(playerX);
            } else {
                this.setWinner(playerO);
            }
            return true;
        }
        return false;
    }

    private void setWinner(Player c) {
        this.winner = c;
    }

    private Player getWinner() {
        return this.winner;
    }

    public boolean isButtonFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (button[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void doMove(int x, int y, Player p) {
        button[x][y].setText(p.getMark());
    }
}
