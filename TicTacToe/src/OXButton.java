import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OXButton extends JButton implements ActionListener {

    Icon o = new ImageIcon(this.getClass().getResource("symbol_O.png"));
    Icon x = new ImageIcon(this.getClass().getResource("symbol_X.png"));
    int flag = 0;
    static int counter = 0;

    public OXButton(){

        this.setBackground(Color.white);
        this.addActionListener(this);

    }

    public void setO(){
        this.setIcon(o);
        flag=1;
    }

    public void setX(){
        this.setIcon(x);
        flag=2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.getIcon()==null) {
            counter++;

            if (counter % 2 == 1) this.setX();
            else this.setO();
        }

    }

}
