import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonPanel extends JPanel {
    private Player winner;
    private Player playerX;
    private Player playerO;
    Player currentPlayer;
    Statistics statistics;
    JButton [][] buttons = new JButton[3][3];
    GridBagConstraints gc = new GridBagConstraints();
    ButtonListener listener = new ButtonListener(buttons);


    public ButtonPanel(Player playerX, Player playerO, Statistics statistics) {
        this.playerX = playerX;
        this.playerO = playerO;
        currentPlayer = playerX;
        this.statistics = statistics;
        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        //setVisible(true);
        Dimension dimension = new Dimension();
        dimension.height = 100;
        dimension.width = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setPreferredSize(dimension);
                gc.gridx = i;
                gc.gridy = j;
                add(buttons[i][j], gc);
                buttons[i][j].addActionListener(listener);
            }
        }
    }

    public class ButtonListener implements ActionListener {


        public void actionPerformed(ActionEvent e){
            JButton button = (JButton)e.getSource();

            if(isButtonEmpty(button)){
                button.setText(currentPlayer.getMark());

                if(checkBoardForMatch()){

                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                    //statistics.addResult(new RoundResult(round.getWinner(), "wins"));
                    initializeRound();
                } else if(isBoardFull()){
                    JOptionPane.showMessageDialog(null, "The game is draw. No one looses!");
                    initializeRound();
                } else changeCurrentPlayer();


            }
        }

        private JButton[][] button;
        public ButtonListener(JButton[][] buttons){
            this.button = buttons;
        }
        public boolean isButtonEmpty(JButton button) {
            if (button.getText().equals("")) {
                return true;
            }
            System.out.println("Selected cell is blocked.");
            return false;
        }

        public void initializeRound(){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttons[i][j].setText("");
                }
            }
            currentPlayer=playerX;

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

        private void setWinner(Player p) {
            winner = p;
        }

        private Player getWinner() {
            return winner;
        }

        public boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (button[i][j].getText().equals("")) {
                        return false;
                    }
                }
            }
            return true;
        }

        private void changeCurrentPlayer() {
            if (currentPlayer.getMark().equals("X")) {
                currentPlayer = playerO;
            } else {
                currentPlayer = playerX;
            }
        }
    }


}