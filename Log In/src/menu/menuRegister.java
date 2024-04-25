package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    	

    	import java.sql.*;
    	import java.awt.BorderLayout;
    	import java.awt.EventQueue;

    	import javax.swing.JFrame;
    	import javax.swing.JPanel;
    	import javax.swing.border.EmptyBorder;
    	import javax.swing.JLabel;
    	import javax.swing.JOptionPane;

    	import java.awt.Color;
    	import java.awt.Font;
    	import javax.swing.SwingConstants;
    	import javax.swing.JTextField;
    	import javax.swing.JPasswordField;
    	import javax.swing.JButton;
    	import java.awt.event.ActionListener;
    	import java.awt.event.ActionEvent;

    	public class menuRegister extends JFrame {
    		public static Connection con;

    		private JPanel contentPane;
    		private JTextField textField;

    		/**
    		 * Launch the application.
    		 */
    		public static void main(String[] args) {
    			EventQueue.invokeLater(new Runnable() {
    				public void run() {
    					try {
    						menuLogin frame = new menuLogin();
    						frame.setVisible(true);
    					} catch (Exception e) {
    						e.printStackTrace();
    					}
    				}
    			});
    		}

    		/**
    		 * Create the frame.
    		 */
    		public menuRegister() {
    			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			setBounds(100, 100, 981, 712);
    			contentPane = new JPanel();
    			contentPane.setForeground(new Color(0, 0, 0));
    			contentPane.setBackground(UIManager.getColor("Button.background"));
    			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    			setContentPane(contentPane);
    			contentPane.setLayout(null);
    			
    			JPanel panel = new JPanel();
    			panel.setBounds(346, 174, 272, 324);
    			panel.setBackground(new Color(255, 99, 71));
    			contentPane.add(panel);
    			panel.setLayout(null);
    			
    			textField = new JTextField();
    			textField.setBounds(122, 140, 96, 20);
    			panel.add(textField);
    			textField.setColumns(10);
    			
    			JLabel lblNewLabel = new JLabel("Register");
    			lblNewLabel.setBounds(81, 11, 109, 29);
    			panel.add(lblNewLabel);
    			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
    			lblNewLabel.setBackground(Color.ORANGE);
    			
    			JLabel lblNewLabel_1 = new JLabel("Nom d'Usuari:");
    			lblNewLabel_1.setBounds(10, 140, 79, 19);
    			panel.add(lblNewLabel_1);
    			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
    			
    			JButton btnNewButton_1 = new JButton("Register");
    			btnNewButton_1.setBounds(94, 247, 96, 29);
    			panel.add(btnNewButton_1);
    			btnNewButton_1.setBackground(new Color(240, 248, 255));
    			btnNewButton_1.setForeground(new Color(0, 0, 0));
    			btnNewButton_1.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
    					textField.setText(null);
    				}
    			});
    			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    		}
    	}

 