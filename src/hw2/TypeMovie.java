/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TypeMovie extends JFrame {
JButton c1=new JButton("Action"),
c3=new JButton("Romantic"),
c4=new JButton("Comedy"),c5=new JButton("3D "),c6=new JButton(" Next ");

public TypeMovie() {
setTitle("Select Type Movie");
Container pane = getContentPane();
pane.setLayout(new GridLayout(3,3));
setBounds(0,0,300,100);
pane.add(c1); pane.add(c3);
pane.add(c4); pane.add(c5);  pane.add(c6);
}}
