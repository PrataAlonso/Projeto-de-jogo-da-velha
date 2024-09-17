package popup.visual;
    import popup.acoes.ActionsPop;
    import java.awt.*;
public class AttributesPop extends ActionsPop{
    public AttributesPop(){
        label();
        bttn();
        
        tela();
    }
    
    protected void tela(){
        getTela().setModal(true);
        getTela().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getTela().setSize(300,400);
        getTela().setLocationRelativeTo(null);
        getTela().setLayout(null);
        
        getTela().add(getTxt_Texto());
        getTela().add(getBttn_Start());
        
        getTela().setVisible(false);
    }
    
    private void label(){
        getTxt_Texto().setBounds(40,140,400,50);
        getTxt_Texto().setFont(new Font("fonte", Font.BOLD, 20));
    }
    
    private void bttn(){
        getBttn_Start().setBounds(40,300, 200, 30);
        
        bttnAct();
    }
}
