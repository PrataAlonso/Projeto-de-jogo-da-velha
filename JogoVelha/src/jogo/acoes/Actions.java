package jogo.acoes;
import java.awt.Color;
    import jogo.visual.Objects;
    import java.awt.event.*;
    import popup.visual.*;
    import popup.acoes.ActionsPop;
public class Actions extends Objects{
    private static boolean check1 = false, check2 = false, check3 = false, check4 = false, check5 = false, check6 = false, check7 = false, check8 = false, check9 = false;
    private String[][] array = new String[3][3];
    
    ObjectsPop obj = new ObjectsPop();
    Run run = new Run();
    ActionsPop act = new ActionsPop();
    
    protected void panels(){
        getSquares()[0].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check1 == false){
                    if (isPlayer1Check() == false){
                        getObject()[1].setVisible(true);
                        setPlayer1Check(true);
                        getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[0][0] = "X";
                        winCond1();
                    } else{
                        getObject()[0].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[0][0] = "O";
                        winCond2();
                    }
                    check1 = true;
                }
            }
        });
        
        getSquares()[1].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check2 == false){
                    if (isPlayer1Check() == false){
                        getObject()[3].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[0][1] = "X";
                        winCond1();
                    } else{
                        getObject()[2].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[0][1] = "O";
                        winCond2();
                    }
                    check2 = true;
                }
            }
        });
         
       getSquares()[2].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check3 == false){
                    if (isPlayer1Check() == false){
                        getObject()[5].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[0][2] = "X";
                        winCond1();
                    } else{
                        getObject()[4].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[0][2] = "O";
                        winCond2();
                    }
                    check3 = true;
                }
            }
        });
       
        getSquares()[3].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check4 == false){
                    if (isPlayer1Check() == false){
                        getObject()[7].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[1][0] = "X";
                        winCond1();
                    } else{
                        getObject()[6].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[1][0] = "O";
                        winCond2();
                    }
                    check4 = true;
                }
            }
        });
        
       getSquares()[4].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check5 == false){
                    if (isPlayer1Check() == false){
                        getObject()[9].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[1][1] = "X";
                        winCond1();
                    } else{
                        getObject()[8].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[1][1] = "O";
                        winCond2();
                    }
                    check5 = true;
                }
            }
        });
       
       getSquares()[5].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check6 == false){
                    if (isPlayer1Check() == false){
                        getObject()[11].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[1][2] = "X";
                        winCond1();
                    } else{
                        getObject()[10].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[1][2] = "O";
                        winCond2();
                    }
                    check6 = true;
                }
            }
        });
       
       getSquares()[6].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check7 == false){
                    if (isPlayer1Check() == false){
                        getObject()[13].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[2][0] = "X";
                        winCond1();
                    } else{
                        getObject()[12].setVisible(true);
                        setPlayer1Check(false);
                        getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[2][0] = "O";
                        winCond2();
                    }
                    check7 = true;
                }
            }
        });
       
       getSquares()[7].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check8 == false){
                    if (isPlayer1Check() == false){
                        getObject()[15].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[2][1] = "X";
                        winCond1();
                    } else{
                        getObject()[14].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[2][1] = "O";
                        winCond2();
                    }
                    check8 = true;
                }
            }
        });
       
       getSquares()[8].addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (check9 == false){
                    if (isPlayer1Check() == false){
                        getObject()[17].setVisible(true);
                        setPlayer1Check(true);
                         getPlayers()[2].setVisible(false);
                        getPlayers()[3].setVisible(true);
                        array[2][2] = "X";
                        winCond1();
                    } else{
                        getObject()[16].setVisible(true);
                        setPlayer1Check(false);
                         getPlayers()[3].setVisible(false);
                        getPlayers()[2].setVisible(true);
                        array[2][2] = "O";
                        winCond2();
                    }
                    check9 = true;
                }
            }
        });
    }
    
    private void winCond1(){
        int XcountV, XcountH, XcountD1, XcountD2;
        
        XcountV = XcountH = XcountD1 = XcountD2 = 0;
        //true = player 1 / false = player 2
        
        for (int i = 0; i < 3; i++) { //player 1
            for (int j = 0; j < 3; j++) {
                if (array[i][j] != null){
                    if (i == j & array[i][j].equals("X")){
                        XcountD1++;
                        
                        if (j == 2-i & array[i][j].equals("X")){
                            XcountD2++;
                        }
                        
                    }
                    else if (j == 2-i & array[i][j].equals("X")){
                        XcountD2++;
                        
                    }
                }
            }
            
            for (int k = 0; k < 3; k++) {
                    if (array[i][k] != null){
                        if (array[i][k].equals("X")){
                            XcountV++;
                            System.out.println("vertical " + XcountV);
                            break;
                        }
                        else{
                            XcountV = 0;
                        }
                    }
            }
            
            for (int k = 0; k < 3; k++) {
                if (array[k][i] != null){
                    if (!array[k][i].equals("O")){
                        if (array[k][i].equals("X")){
                            XcountH++;
                            System.out.println("horizontal " + XcountH);
                            break;
                        }
                        else{
                            XcountH = 0;
                        }
                    }
                }
            }
            if (XcountV == 3 | XcountH == 3 | XcountD1 == 3 | XcountD2 == 3){
           getScore()[1].setText(Integer.toString(Integer.parseInt(getScore()[1].getText()) + 1));
            obj.getTxt_Texto().setText("Player 1 venceu!");
            obj.getBttn_Start().setText("Reiniciar");
            
            run.telaPopup();
        }
        }
    }
    
    private void winCond2(){
        int OcountV, OcountH, OcountD1, OcountD2;
        OcountV = OcountH = OcountD1 = OcountD2 = 0;
        //true = player 1 / false = player 2
        
        for (int i = 0; i < 3; i++) { //player 1
            for (int j = 0; j < 3; j++) {
                if (array[i][j] != null){
                    if (i == j & array[i][j].equals("O")){
                        OcountD1++;
                        
                        if (j == 2-i & array[i][j].equals("O")){
                            OcountD2++;
                        }
                        
                    }
                    else if (j == 2-i & array[i][j].equals("O")){
                        OcountD2++;
                    }
                }
            }
            
            for (int k = 0; k < 3; k++) {
                    if (array[i][k] != null){
                        if (array[i][k].equals("O")){
                            OcountV++;
                            break;
                        }
                        else{
                            OcountV = 0;
                        }
                    }
            }
            
            for (int k = 0; k < 3; k++) {
                if (array[k][i] != null){    
                        if (array[k][i].equals("O")){
                            OcountH++;
                            break;
                        }
                        else{
                            OcountH = 0;
                        }
                    }
            }
        }
       if (OcountV == 3 | OcountH == 3 | OcountD1 == 3 | OcountD2 == 3){
            getScore()[0].setText(Integer.toString(Integer.parseInt(getScore()[0].getText()) + 1));
            obj.getTxt_Texto().setText("Player 2 venceu!");
            obj.getBttn_Start().setText("Reiniciar");
            
            run.telaPopup();
        }
    }
}
