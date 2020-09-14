package proyectoconcurrente;

import javax.swing.*;

public class HBall extends Thread{
    private PanelBall panel;
    private MiX x;
    private MiY y;
    
    HBall(PanelBall panel,MiX x, MiY y){
        this.panel=panel;
        this.x=x;
        this.y=y;
    }
    
    
    
    HBall(){
        
    }
    public void run(){
        boolean rigth=true;
        boolean down=true;
        while(true){
            try{
                
                
                if(x.getX()==0){
                    rigth=true;
                }
                if(x.getX()==panel.getWidth()-20){
                    rigth=false;
                }
                if(y.getY()==0){
                    down=true;
                }
                if(y.getY()==panel.getHeight()-20){
                    down=false;
                }
                
                if(rigth==true)
                    x.setX(x.getX()+10);
                else
                    x.setX(x.getX()-10);
                if(down==true)
                    y.setY(y.getY()+10);
                else
                    y.setY(y.getY()-10);
                
                panel.repaint();
                Thread.sleep(100);
                
                
            }catch(Exception e){e.printStackTrace();}
        }
    }
}
