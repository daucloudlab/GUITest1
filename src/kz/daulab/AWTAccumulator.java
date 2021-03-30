package kz.daulab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame implements ActionListener {
    private Label lblInput ;
    private Label lblOutput ;
    private TextField tfInput ;
    private TextField tfOutput ;
    private int sum = 0 ;

    public AWTAccumulator(){
        setLayout(new FlowLayout());

        lblInput = new Label("Enter an Integer: ") ;
        add(lblInput) ;

        tfInput = new TextField(10) ;
        add(tfInput) ;
        tfInput.addActionListener(this);

        lblOutput = new Label("The Accumulate sum is: ") ;
        add(lblOutput) ;

        tfOutput = new TextField(10) ;
        tfOutput.setEditable(false);
        add(tfOutput) ;

        setTitle("AWT Accumulatro");
        setSize(350, 120);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int numberIn = Integer.parseInt(tfInput.getText()) ;
        sum += numberIn ;
        tfInput.setText("");
        tfOutput.setText(sum + "");
    }
}
