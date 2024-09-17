package popup.visual;
    import javax.swing.*;
    import java.awt.*;
public class ObjectsPop extends JDialog{
    private JDialog dialog_Tela = new JDialog();
    
    private static JLabel txt_Texto = new JLabel("<html>Clique no botão abaixo<br>para iniciar</html>");
    
    
    private static JButton bttn_Start = new JButton("Iniciar");
    
    public JDialog getTela(){
        return dialog_Tela;
    }

    public JLabel getTxt_Texto() {
        return txt_Texto;
    }

    public JButton getBttn_Start() {
        return bttn_Start;
    }
    
    
}
