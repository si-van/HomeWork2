/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
public class TypeTicket extends JFrame {

   public static void main(String[] args) {
     EventQueue.invokeLater(new Runnable() {

public void run() {

TypeTicket frame = new TypeTicket();

frame.setVisible(true);

}

});

}

public TypeTicket() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 343, 273);

setTitle("Select Type Ticket");

getContentPane().setLayout(null);

final JRadioButton radio1 = new JRadioButton("VIP Ticket");

radio1.setBounds(119, 58, 109, 23);

getContentPane().add(radio1);

 

final JRadioButton radio2 = new JRadioButton("Gold Ticket");

radio2.setBounds(119, 84, 109, 23);

getContentPane().add(radio2);
final JRadioButton radio3 = new JRadioButton("Silver Ticket");

radio3.setBounds(119, 110, 109, 23);

getContentPane().add(radio3);

ButtonGroup group = new ButtonGroup();

group.add(radio1);

group.add(radio2);

group.add(radio3);
JButton btn = new JButton("DONE");
btn.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent arg0) { 

if(radio1.isSelected()){

JOptionPane.showMessageDialog(null,"You select : VIP Ticket");

} else if (radio2.isSelected()) {
JOptionPane.showMessageDialog(null,"You select : Gold Ticket");

} else if (radio3.isSelected()) {

JOptionPane.showMessageDialog(null,"You select : Silver Ticket"); 

} else {

JOptionPane.showMessageDialog(null,"You not select.");
}
}
});



btn.setBounds(125, 154, 89, 23);

getContentPane().add(btn); 

}
    
}