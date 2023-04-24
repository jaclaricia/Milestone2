package EmployeeApp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.*;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class LoginSystem {

	public JFrame frmDfsf;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frmDfsf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void initialize() {

		// Frame Compositions (Label, Button, Text Fields, etc.)

		frmDfsf = new JFrame();
		frmDfsf.setBackground(new Color(255, 255, 255));
		frmDfsf.getContentPane().setBackground(new Color(255, 165, 89));
		frmDfsf.addWindowListener(new WindowAdapter() {
			@Override

			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(frmDfsf, "Proceed closing the window?", "Close Window",
						JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					frmDfsf.dispose();
				} else
					frmDfsf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}

		});
		frmDfsf.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmDfsf.setBounds(200, 200, 500, 300);
		frmDfsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDfsf.setLocationRelativeTo(null);
		frmDfsf.getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 230, 199));
		lblNewLabel_2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 30));
		lblNewLabel_2.setBounds(323, 18, 98, 50);
		frmDfsf.getContentPane().add(lblNewLabel_2);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		txtUsername.setBounds(342, 93, 112, 20);
		frmDfsf.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(255, 87, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));

		// Read file from text upon click
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try (BufferedReader reader = new BufferedReader(
						new FileReader("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Login\\login.txt"))) {
					// Checks existing of login credentials from text
					if ((reader.readLine()).equals(txtUsername.getText())) {
						if (reader.readLine().equals(passwordField.getText())) {
							JOptionPane.showMessageDialog(null, "Login Successful!");
							frmDfsf.setVisible(false);
							Information info = new Information();
							info.frmMotorPhEmployee.setVisible(true);
							if (!(reader.readLine().equals(passwordField.getText()))) {
								JOptionPane.showMessageDialog(null, "Account not found.");
							}
						} else
							JOptionPane.showMessageDialog(null, "Account not found.");
					} else
						JOptionPane.showMessageDialog(null, "Account not found.");
				} catch (Exception ex) {
					return;
				}
			}
		});

		btnNewButton.setBounds(366, 190, 88, 27);
		frmDfsf.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setForeground(new Color(69, 69, 69));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));

		// Writes a text on a local directory to save login credentials
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtUsername.getText().equals("") || passwordField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Invalid Username/Password.");
				} else {
					try {
						BufferedWriter writer = new BufferedWriter(
								new FileWriter("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Login\\login.txt"));
						writer.write(txtUsername.getText() + "\n");
						writer.write(passwordField.getText() + "\n");
						writer.close();
					} catch (Exception ex) {
						return;
					}
					JOptionPane.showMessageDialog(null, "Registered");
				}
			}
		});

		btnNewButton_2.setBounds(277, 190, 87, 27);
		frmDfsf.getContentPane().add(btnNewButton_2);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		passwordField.setToolTipText("");
		passwordField.setBounds(342, 124, 112, 20);
		frmDfsf.getContentPane().add(passwordField);

		// Hide and unhide password toggle w/ checkbox
		JCheckBox showPass = new JCheckBox("Show");
		showPass.setForeground(new Color(69, 69, 69));
		showPass.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		showPass.setBackground(new Color(255, 165, 89));
		showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (showPass.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					passwordField.setEchoChar('•');
				}
			}
		});
		showPass.setBounds(404, 144, 63, 23);
		frmDfsf.getContentPane().add(showPass);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 239, 261);
		frmDfsf.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(LoginSystem.class.getResource("/Files/MotorPH Logo (1).png")));
		lblNewLabel.setBounds(0, 0, 239, 261);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(277, 97, 63, 14);
		frmDfsf.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_1_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(277, 127, 63, 14);
		frmDfsf.getContentPane().add(lblNewLabel_1_1);
	}
}
