package jogo.visual;
    import jogo.acoes.Actions;
    import java.awt.*;
    import javax.swing.*;
public class Attributes extends Actions{
    public Attributes(){
        tela();
        score();
        squares();
        object();
        players();
        
        panels();
    }
    
    protected void tela(){
        getFrame_Projeto().setSize(500,600);
        getFrame_Projeto().setLayout(null);
        getFrame_Projeto().setDefaultCloseOperation(EXIT_ON_CLOSE);
        getFrame_Projeto().setLocationRelativeTo(null);
        getFrame_Projeto().setTitle("Jogo da Velha Pica");
        getFrame_Projeto().setResizable(false);
        getFrame_Projeto().setVisible(true);
        
        for (int i = 0; i < 2; i++) {
            getFrame_Projeto().add(getScore()[i]);
            
        }
        
        for (int i = 0; i < getPlayers().length; i++) {
            getFrame_Projeto().add(getPlayers()[i]);
        }
        
        for (int i = 0; i < getSquares().length; i++) {
            getFrame_Projeto().add(getSquares()[i]);
        }
        
    }
    
    private void score(){
        Font fonte = new Font("fonte", Font.BOLD, 50);
        
        getPlayers()[0].setBounds(100,30,60,50);
        getPlayers()[1].setBounds(310,30,60,50);
        
        getScore()[0].setBounds(170,32,60,50);
        getScore()[1].setBounds(370,32,60,50);
        
        for (int i = 0; i < 2; i++) {
            getPlayers()[i].setFont(fonte);
            getScore()[i].setFont(fonte);
        }
    }
    
    private void squares(){
        for (int i = 0; i < getSquares().length; i++) {
            getSquares()[i].setSize(120,120);
            getSquares()[i].setBackground(Color.white);
            getSquares()[i].setBorder(BorderFactory.createLineBorder(Color.black));
            getSquares()[i].setLayout(null);
            
        }
        
        getSquares()[0].setLocation(60, 140);
        getSquares()[1].setLocation(180, 140);
        getSquares()[2].setLocation(300, 140);
        
        getSquares()[3].setLocation(60, 260);
        getSquares()[4].setLocation(180, 260);
        getSquares()[5].setLocation(300, 260);
        
        getSquares()[6].setLocation(60, 380);
        getSquares()[7].setLocation(180, 380);
        getSquares()[8].setLocation(300, 380);
        
        addInSquares();
    }
    
    private void object(){
        Font fonte = new Font("fonte", Font.BOLD, 100);
        
        for (int i = 0; i < getObject().length; i++) {
            getObject()[i].setSize(110,100);
            getObject()[i].setFont(fonte);
            if (i == 0 | i % 2 == 0){
                getObject()[i].setLocation(20,10);
            } else{
                getObject()[i].setLocation(25,10);
            }
            getObject()[i].setVisible(false);
        }  
    }
    
    private void addInSquares(){
        getSquares()[0].add(getObject()[0]);
        getSquares()[0].add(getObject()[1]);
        
        getSquares()[1].add(getObject()[2]);
        getSquares()[1].add(getObject()[3]);
        
        getSquares()[2].add(getObject()[4]);
        getSquares()[2].add(getObject()[5]);
        
        getSquares()[3].add(getObject()[6]);
        getSquares()[3].add(getObject()[7]);
        
        getSquares()[4].add(getObject()[8]);
        getSquares()[4].add(getObject()[9]);
        
        getSquares()[5].add(getObject()[10]);
        getSquares()[5].add(getObject()[11]);
        
        getSquares()[6].add(getObject()[12]);
        getSquares()[6].add(getObject()[13]);
        
        getSquares()[7].add(getObject()[14]);
        getSquares()[7].add(getObject()[15]);
        
        getSquares()[8].add(getObject()[16]);
        getSquares()[8].add(getObject()[17]);
    }
    
    private void players(){
        for (int i = 2; i < 4; i++) {
            getPlayers()[i].setBounds(180,100,300,30);
            getPlayers()[i].setFont(new Font("fonte", Font.BOLD, 20));
        }
        
        getPlayers()[3].setVisible(false);
    }
}
