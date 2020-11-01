import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    JLabel statusbar = new JLabel();


    public TicTacToe() {

        initUI();
    }

    private void initUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JLabel info = new JLabel("Player 1 has X and Player 2 has O");
        this.add(info, BorderLayout.NORTH);

        Game g = new Game();
        this.add(g, BorderLayout.CENTER);
        g.start();




    }



    public static void main (String[]args){

            EventQueue.invokeLater(() -> {
                var game = new TicTacToe();
                game.setVisible(true);
            });


    }


}
