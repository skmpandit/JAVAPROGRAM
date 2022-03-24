import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Demo1 extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JPasswordField password;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1 frame = new Demo1();
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
	Connection con=null;
	public Demo1() {
		con=(Connection) DB.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 439);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(56, 27, 102, 30);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(168, 27, 204, 30);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(56, 109, 100, 30);
		contentPane.add(lblNewLabel_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(168, 70, 204, 30);
		contentPane.add(email);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(56, 68, 100, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(58, 163, 100, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				String n=name.getText();
				String el=email.getText();
				String p=password.getText();
				String a=address.getText();
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into signup(name,email,password,address) values(?,?,?,?)");
					pst.setString(1, n);
					pst.setString(2, el);
					pst.setString(3,p);
					pst.setString(4, a);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Date added");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(170, 259, 202, 30);
		contentPane.add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(168, 111, 204, 30);
		contentPane.add(password);
		
		JTextArea address = new JTextArea();
		address.setBounds(168, 170, 204, 57);
		contentPane.add(address);
	}
}
