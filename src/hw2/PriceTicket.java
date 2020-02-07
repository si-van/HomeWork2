/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import javax.swing.*;  
import java.awt.event.*; 
public class PriceTicket extends JFrame implements ActionListener{  
    JLabel l;  
    JCheckBox cb1,cb2,cb3;  
    JButton b;  
    PriceTicket(){  
                setTitle("Select Price");

        l=new JLabel("Ticket Ordering System");  
        l.setBounds(50,50,300,20);  
        cb1=new JCheckBox("VIP ticket 25000");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("SILVER ticket 15000");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("GOLD ticket 10000");  
        cb3.setBounds(100,200,150,20);  
        b=new JButton("Order ");  
        b.setBounds(100,250,80,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(cb1.isSelected()){  
            amount+=25000;  
            msg="VIP:25000";  
        }  
        if(cb2.isSelected()){  
            amount+=15000;  
            msg+="GOLD:15000";  
        }  
        if(cb3.isSelected()){  
            amount+=1000;  
            msg+="SILVER:10000";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }
    
}
