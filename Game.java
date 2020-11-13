import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game extends OXButton implements ActionListener{

    //JPanel board = new JPanel();

    OXButton btn[] = new OXButton[9];
    String win[] = new String[9];
    int counter = 0;

    int n = JOptionPane.showConfirmDialog( this,
            "Player 1 won! Would like to play again?",
            "An Inane Question",
            JOptionPane.YES_NO_OPTION);


    public Game(){
        initGame();

    }

    public void initGame(){

        this.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            btn[i] = new OXButton();
            btn[i].addActionListener(this);
            this.add(btn[i]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        OXButton click = (OXButton)e.getSource();
        for(int i =0; i<9;i++){
            if (click == btn[i]) win[i] = String.valueOf(btn[i].getIcon());
        }

            if (click.getIcon()==null) {
                counter++;
                //TicTacToe.bar.setText(String.valueOf(OXButton.counter));


                if (counter % 2 == 1) {
                    click.setX();
                    //TicTacToe.bar.setText(String.valueOf(x));
                }

                else {
                    click.setO();
                    //TicTacToe.bar.setText(String.valueOf(o));
                }
            }

         checkIfWin();

    }

    public void checkIfWin(){
        if (win [0] == win [1] && win [1] == win [2]) ;
        else if (win [3] == win [4] && win [4] == win [5]) ;
        else if (win [6] == win [7] && win [7] == win [8]) ;
        else if (win [0] == win [3] && win [3] == win [6]) ;
        else if (win [1] == win [4] && win [4] == win [7]) ;
        else if (win [2] == win [5] && win [5] == win [8]) ;
        else if (win [0] == win [4] && win [4] == win [8]) ;
        else if (win [2] == win [4] && win [4] == win [8]) ;


    }

}
