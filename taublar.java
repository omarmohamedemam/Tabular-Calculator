import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.util.Scanner;
import java.awt.event.InputMethodEvent;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class taublar extends JFrame {

private static final long serialVersionUID = -5624404136485946868L;

String userWord = "";
JTextField userInput;
JTextField userinput2;
String userWord2 = "";
JTextArea ans;
JTextArea ans2;

public taublar() {
    JFrame jf = new JFrame();
    JPanel panel = new JPanel();
    JLabel jl = new JLabel("Minterms:");
    jl.setFont(new Font("Tahoma", Font.PLAIN, 20));
    jl.setBounds(12, 125, 150, 45);
    JButton jButton = new JButton("Solve");
    jButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
    jButton.setBounds(170, 229, 143, 35);
    userInput = new JTextField("", 30);
    userInput.setForeground(Color.LIGHT_GRAY);
    userInput.setFont(new Font("Tahoma", Font.PLAIN, 24));
    userInput.setBounds(118, 128, 336, 27);
    jButton.addActionListener( (e) -> {
        submitAction();
    });
    jf.setSize(500, 500);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.getContentPane().add(panel);
    panel.setLayout(null);
    panel.add(jl);
    panel.add(userInput);
    panel.add(jButton);
    
    JLabel lblDontcares = new JLabel("Don'tCares:");
    lblDontcares.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblDontcares.setBounds(12, 165, 162, 52);
    panel.add(lblDontcares);
    
    userinput2 = new JTextField("", 30);
    userinput2.setForeground(Color.LIGHT_GRAY);
    userinput2.setFont(new Font("Tahoma", Font.PLAIN, 23));
    userinput2.setBounds(118, 183, 336, 27);
    panel.add( userinput2);
//ne().add(panel);
    panel.add(jl);
    panel.add(userInput);
    panel.add(jButton);
    
    JLabel lblNewLabel = new JLabel("Tabular Calculator");
    lblNewLabel.setForeground(Color.BLUE);
    lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
    lblNewLabel.setBounds(96, 13, 320, 35);
    panel.add(lblNewLabel);
    
    JLabel lbltermsAreSeprated = new JLabel("**Terms are seprated by spaces or commas");
    lbltermsAreSeprated.setBounds(12, 61, 320, 27);
    panel.add(lbltermsAreSeprated);
    
    JLabel lblIfThere = new JLabel("** If there are no don't cares leave it empty");
    lblIfThere.setBounds(12, 82, 320, 27);
    panel.add(lblIfThere);
    
    JLabel lblImportantInsstructions = new JLabel("Important insstructions :");
    lblImportantInsstructions.setBounds(12, 42, 320, 27);
    panel.add(lblImportantInsstructions);
    
    JLabel lblByOmar = new JLabel("By : Omar Emam");
    lblByOmar.setForeground(Color.RED);
    lblByOmar.setFont(new Font("Tekton Pro", Font.PLAIN, 18));
    lblByOmar.setBounds(343, 413, 320, 27);
    panel.add(lblByOmar);
    
    JLabel lblnumberOfVariables = new JLabel("**Number of variables is automticly deduced (No need to enter it)");
    lblnumberOfVariables.setBounds(12, 101, 392, 27);
    panel.add(lblnumberOfVariables);
    
    JLabel lblNewLabel_1 = new JLabel("Essential Prime Implicants:");
    lblNewLabel_1.setForeground(new Color(0, 128, 0));
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel_1.setBounds(12, 277, 261, 35);
    panel.add(lblNewLabel_1);
    
   ans = new JTextArea();
   ans.setFont(new Font("Monospaced", Font.BOLD, 15));
    ans.setBounds(12, 312, 432, 90);
    panel.add(ans);
    
}

public void submitAction() {
    userWord = userInput.getText();
    userWord2= userinput2.getText();
    Solver s = new Solver(userWord, userWord2);
    s.solve();
    s.printResults();


  
   
    
    
    
}

public static void main(String[] args) {
    new taublar();
}
}