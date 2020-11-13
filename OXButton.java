import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OXButton extends JButton  {


    Icon o = new ImageIcon(this.getClass().getResource("symbol_O.png"), "O");
    Icon x = new ImageIcon(this.getClass().getResource("symbol_X.png"), "X");


    static int counter = 0;

    public OXButton(){

        this.setBackground(Color.white);
        //this.addActionListener(this::actionPerformed);

    }

    public void setO(){
        this.setIcon(o);
    }

    public void setX(){
        this.setIcon(x);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("hahah");
////        checkIfWin();
////
////        if (this.getIcon()==null) {
////            counter++;
////            //TicTacToe.bar.setText(String.valueOf(OXButton.counter));
////
////
////            if (counter % 2 == 1) {
////                this.setX();
////                //TicTacToe.bar.setText(String.valueOf(x));
////            }
////
////            else {
////                this.setO();
////                //TicTacToe.bar.setText(String.valueOf(o));
////            }
////        }
//    }

}
