/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ENG Maha
 */
public class HelloFrame extends JFrame  implements ActionListener{

    protected JLabel firstNameLabel=new JLabel("First Name");
    protected JLabel lastNameLabel=new JLabel("Last Name");
    protected JTextField firstNameField=new JTextField();
    protected JTextField lastNameField=new JTextField();
    protected  JButton button=new JButton("Press Me");
    public HelloFrame(String title){
        this.setTitle(title);
        this.setLayout(new GridLayout(3,2));
        this.add(firstNameLabel);
        this.add(firstNameField);
         this.add(lastNameLabel);
        this.add(lastNameField);
        this.add(button);
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
                
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() ==button) {
            System.out.println("hihihi");
      JOptionPane.showMessageDialog(null, firstNameField.getText()+" "+lastNameField.getText());
        }
     }
    
}
