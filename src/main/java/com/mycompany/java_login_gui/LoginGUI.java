/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_login_gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author qwertet
 */
public class LoginGUI extends JFrame {
    public LoginGUI(){
    super(CommonConstants.APP_NAME);
    CommonConstants m = new CommonConstants();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(m.FRAME_SIZE[0], m.FRAME_SIZE[1]);
    setLocationRelativeTo(null);
    
    addGUIComponents();
    }
    
    public void addGUIComponents(){
    SpringLayout springLayout = new SpringLayout();
    JPanel loginPanel = new JPanel();
    loginPanel.setLayout(springLayout);
    
    
    //username
    JLabel usernameLabel = new JLabel("Username");
    usernameLabel.setFont(new Font("Dialog",Font.PLAIN,18));
    
    CommonConstants m = new CommonConstants();
    JTextField usernameField = new JTextField(m.TEXTFIELD_SIZE);
    usernameField.setFont(new Font("Dialog",Font.PLAIN,18));
    
    springLayout.putConstraint(SpringLayout.WEST,usernameLabel, 35,SpringLayout.WEST , loginPanel);
    springLayout.putConstraint(SpringLayout.NORTH,usernameLabel, 85,SpringLayout.NORTH , loginPanel);
    springLayout.putConstraint(SpringLayout.WEST,usernameField, 135,SpringLayout.WEST , loginPanel);
    springLayout.putConstraint(SpringLayout.NORTH,usernameField, 85,SpringLayout.NORTH , loginPanel);

    loginPanel.add(usernameLabel);
    loginPanel.add(usernameField);
    
    
    //password
    JLabel PasswordLabel = new JLabel("Password");
    PasswordLabel.setFont(new Font("Dialog",Font.PLAIN,18));
    
    JTextField PasswordField = new JTextField(m.TEXTFIELD_SIZE);
    PasswordField.setFont(new Font("Dialog",Font.PLAIN,18));
    
    springLayout.putConstraint(SpringLayout.WEST,PasswordLabel, 35,SpringLayout.WEST , loginPanel);
    springLayout.putConstraint(SpringLayout.NORTH,PasswordLabel, 135,SpringLayout.NORTH , loginPanel);
    springLayout.putConstraint(SpringLayout.WEST,PasswordField, 135,SpringLayout.WEST , loginPanel);
    springLayout.putConstraint(SpringLayout.NORTH,PasswordField, 135,SpringLayout.NORTH , loginPanel);

    loginPanel.add(PasswordLabel);
    loginPanel.add(PasswordField);
    
    //login button
    JButton loginButton =new JButton("Login");
    loginButton.setFont(new Font("Dialog",Font.BOLD,18));
    springLayout.putConstraint(SpringLayout.WEST,loginButton,150,SpringLayout.WEST,loginPanel);
    springLayout.putConstraint(SpringLayout.NORTH,loginButton,250,SpringLayout.NORTH,loginPanel);
    loginButton.addActionListener( new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
    String username = usernameField.getText();
    String password = PasswordField.getText();
    
    if(username.equals("username")&&password.equals("password"))
    {
        System.out.println("LOFIN SUCCESSFUL!");    
    } else{
        System.out.println("LOGIN FAILED.....   }");
       }
     }

    
            });
    loginPanel.add(loginButton);
    this.getContentPane().add(loginPanel);

    
    }
}
