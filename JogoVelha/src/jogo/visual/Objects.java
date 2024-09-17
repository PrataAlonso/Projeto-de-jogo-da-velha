package jogo.visual;
    import javax.swing.*;
    import java.awt.*;
public class Objects extends JFrame{
    public final JFrame frame_Projeto = new JFrame();
    
    private JPanel panel_Square1 = new JPanel(), panel_Square2 = new JPanel(), panel_Square3 = new JPanel();
    private JPanel panel_Square4 = new JPanel(), panel_Square5 = new JPanel(), panel_Square6 = new JPanel();
    private JPanel panel_Square7 = new JPanel(), panel_Square8 = new JPanel(), panel_Square9 = new JPanel();
    
    private JLabel txt_PlayerO = new JLabel("O:");
    private JLabel txt_PlayerX = new JLabel("X:");
    private JLabel txt_PlayerOScore = new JLabel("0"), txt_PlayerXScore = new JLabel("0");
    private JLabel txt_Player1 = new JLabel("Vez de: Player 1");
    private JLabel txt_Player2 = new JLabel("Vez de: Player 2");
    
    private static JLabel txt_O1 = new JLabel("O"), txt_O2 = new JLabel("O"), txt_O3 = new JLabel("O"), txt_O4 = new JLabel("O"), txt_O5 = new JLabel("O");
    private static JLabel txt_O6 = new JLabel("O"), txt_O7 = new JLabel("O"), txt_O8 = new JLabel("O"), txt_O9 = new JLabel("O");
    
    private static JLabel txt_X1 = new JLabel("X"), txt_X2 = new JLabel("X"), txt_X3 = new JLabel("X"), txt_X4 = new JLabel("X"), txt_X5 = new JLabel("X");
    private static JLabel txt_X6 = new JLabel("X"), txt_X7 = new JLabel("X"), txt_X8 = new JLabel("X"), txt_X9 = new JLabel("X");
    
    private static boolean player1Check = false;
    
    private JPanel[] squares = new JPanel[]{panel_Square1, panel_Square2, panel_Square3, panel_Square4, panel_Square5, panel_Square6, panel_Square7, panel_Square8, panel_Square9};
    private JLabel[] players = new JLabel[]{txt_PlayerO, txt_PlayerX, txt_Player1, txt_Player2};
    private JLabel[] score = new JLabel[]{txt_PlayerOScore, txt_PlayerXScore};
    private JLabel[] object = new JLabel[]{txt_O1, txt_X1, txt_O2, txt_X2, txt_O3, txt_X3, txt_O4, txt_X4, txt_O5, txt_X5, txt_O6, txt_X6, txt_O7, txt_X7, txt_O8, txt_X8, txt_O9, txt_X9};

    public JFrame getFrame_Projeto() {
        return frame_Projeto;
    }

    public JLabel[] getObject() {
        return object;
    }

    public JLabel[] getScore() {
        return score;
    }

    public JPanel[] getSquares() {
        return squares;
    }

    public JLabel[] getPlayers() {
        return players;
    }

    public boolean isPlayer1Check() {
        return player1Check;
    }

    public void setPlayer1Check(boolean player1Check) {
        this.player1Check = player1Check;
    }

    
}
