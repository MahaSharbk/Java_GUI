/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ENG Maha
 */
public class MyTest {
    public static void main(String [] args){
        JFrame window=new JFrame();
        window.setTitle("My test frame");
        window.setLayout(new GridLayout(3, 2));
        JLabel firstLabel=new JLabel("Enter first Name");
         JLabel secondLabel=new JLabel("Enter last Name");
         JTextField firstText=new JTextField();
         JTextField secondText=new JTextField();
         JButton button=new JButton("Press here");
         window.add(firstLabel);
         window.add(secondLabel);
         window.add(firstText);
          
         window.add(secondText);
         window.add(button);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.pack();
         window.setVisible(true);
       
    }
}
