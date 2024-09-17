package popup.acoes;
    import popup.visual.ObjectsPop;
    import jogo.visual.Objects;
public class ActionsPop extends ObjectsPop{
    protected void bttnAct(){
        Objects obj = new Objects();
        
        getBttn_Start().addActionListener(e ->{
            if (getBttn_Start().getText().equalsIgnoreCase("reiniciar")){
                for (int i = 0; i < obj.getObject().length; i++) {
                    obj.getObject()[i].setVisible(false);
                }
                getTela().setVisible(false);
            }
            else{
                getTela().setVisible(false);
            }
        });
    }
}
