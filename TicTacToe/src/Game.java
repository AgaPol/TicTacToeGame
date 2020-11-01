import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {

    OXButton btn[] = new OXButton[9];

    public Game(){
        initGame();

    }

    public void initGame(){

        this.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            btn[i] = new OXButton();
            this.add(btn[i]);
        }

    }

    public void start(){
//        if(btn[0].getIcon()==btn[1].getIcon() && btn[0].getIcon()==btn[2].getIcon() && btn[0].getIcon() != null){
//            btn[0].setBackground(Color.red);
//            btn[1].setBackground(Color.red);
//            btn[2].setBackground(Color.red);
        }

    }

}
