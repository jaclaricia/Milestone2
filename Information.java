package EmployeeApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.SystemColor;

public class Information {

	public JFrame frmMotorPhEmployee;
	private JLabel lblProfilePic;
	private JTextField txtBasicSalary;
	private JTextField txtPhone;
	private JTextField txtClothing;
	private JTextField txtRice;
	private JTextField txtBonus;
	private JTextField txtInsurance;
	private JTextField txtName;
	private JTextField txtDepartment;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtContact;
	private JTextField txtBirthday;
	private JTextField txtTax;
	private JTextField txtNet;
	private JTextField txtGross;
	private JTextField txtSSS;
	private JTextField txtPhilhealth;
	private JTextField txtPagibig;
	private JTextField txtTIN;
	private JTextField txtNameUp;
	private JTextField txtDepartmentUp;
	private JTextField txtEmailUp;
	private JTextField txtAddressUp;
	private JTextField txtContactUp;
	private JTextField txtSick;
	private JTextField txtEmergency;
	private JTextField txtVacation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information window = new Information();
					window.frmMotorPhEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Information() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Composition of frame (Label, Button, Text field, etc.)
		frmMotorPhEmployee = new JFrame();
		frmMotorPhEmployee.setBackground(SystemColor.desktop);
		frmMotorPhEmployee.getContentPane().setBackground(new Color(69, 69, 69));
		frmMotorPhEmployee.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(frmMotorPhEmployee, "Proceed closing the window?",
						"Close Window", JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					frmMotorPhEmployee.dispose();
				} else
					frmMotorPhEmployee.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		frmMotorPhEmployee.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmMotorPhEmployee.setBounds(100, 100, 514, 414);
		frmMotorPhEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorPhEmployee.setLocationRelativeTo(null);
		frmMotorPhEmployee.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 165, 89));
		tabbedPane.setBounds(10, 59, 478, 256);
		frmMotorPhEmployee.getContentPane().add(tabbedPane);
		tabbedPane.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		tabbedPane.setForeground(new Color(69, 69, 69));

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Information", null, panel, null);

		panel.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblName.setForeground(new Color(69, 69, 69));
		lblName.setBounds(10, 11, 63, 14);
		panel.add(lblName);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblDepartment.setForeground(new Color(69, 69, 69));
		lblDepartment.setBounds(10, 36, 81, 14);
		panel.add(lblDepartment);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblAddress.setForeground(new Color(69, 69, 69));
		lblAddress.setBounds(10, 86, 81, 14);
		panel.add(lblAddress);

		lblProfilePic = new JLabel("Picture");
		lblProfilePic.setForeground(new Color(255, 255, 255));
		lblProfilePic.setBounds(315, 11, 150, 150);
		panel.add(lblProfilePic);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblEmail.setForeground(new Color(69, 69, 69));
		lblEmail.setBounds(10, 61, 46, 14);
		panel.add(lblEmail);

		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblContact.setForeground(new Color(69, 69, 69));
		lblContact.setBounds(10, 111, 63, 14);
		panel.add(lblContact);

		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblBirthday.setForeground(new Color(69, 69, 69));
		lblBirthday.setBounds(10, 136, 63, 14);
		panel.add(lblBirthday);

		txtName = new JTextField();
		txtName.setForeground(new Color(69, 69, 69));
		txtName.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtName.setEditable(false);
		txtName.setBackground(new Color(255, 230, 199));
		txtName.setBounds(93, 9, 212, 20);
		panel.add(txtName);
		txtName.setColumns(10);

		txtDepartment = new JTextField();
		txtDepartment.setForeground(new Color(69, 69, 69));
		txtDepartment.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtDepartment.setEditable(false);
		txtDepartment.setBackground(new Color(255, 230, 199));
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(93, 33, 212, 20);
		panel.add(txtDepartment);

		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(69, 69, 69));
		txtEmail.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtEmail.setEditable(false);
		txtEmail.setBackground(new Color(255, 230, 199));
		txtEmail.setColumns(10);
		txtEmail.setBounds(93, 58, 212, 20);
		panel.add(txtEmail);

		txtAddress = new JTextField();
		txtAddress.setForeground(new Color(69, 69, 69));
		txtAddress.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtAddress.setEditable(false);
		txtAddress.setBackground(new Color(255, 230, 199));
		txtAddress.setColumns(10);
		txtAddress.setBounds(93, 83, 212, 20);
		panel.add(txtAddress);

		txtContact = new JTextField();
		txtContact.setForeground(new Color(69, 69, 69));
		txtContact.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtContact.setEditable(false);
		txtContact.setBackground(new Color(255, 230, 199));
		txtContact.setColumns(10);
		txtContact.setBounds(93, 108, 212, 20);
		panel.add(txtContact);

		txtBirthday = new JTextField();
		txtBirthday.setForeground(new Color(69, 69, 69));
		txtBirthday.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtBirthday.setEditable(false);
		txtBirthday.setBackground(new Color(255, 230, 199));
		txtBirthday.setColumns(10);
		txtBirthday.setBounds(93, 133, 212, 20);
		panel.add(txtBirthday);

		JLabel lblSSS = new JLabel("SSS No.");
		lblSSS.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblSSS.setForeground(new Color(69, 69, 69));
		lblSSS.setBounds(10, 175, 63, 14);
		panel.add(lblSSS);

		txtSSS = new JTextField();
		txtSSS.setForeground(new Color(69, 69, 69));
		txtSSS.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtSSS.setEditable(false);
		txtSSS.setBackground(new Color(255, 230, 199));
		txtSSS.setColumns(10);
		txtSSS.setBounds(94, 172, 139, 20);
		panel.add(txtSSS);

		JLabel lblPhilhealth = new JLabel("Philhealth");
		lblPhilhealth.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblPhilhealth.setForeground(new Color(69, 69, 69));
		lblPhilhealth.setBounds(10, 200, 81, 14);
		panel.add(lblPhilhealth);

		txtPhilhealth = new JTextField();
		txtPhilhealth.setForeground(new Color(69, 69, 69));
		txtPhilhealth.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtPhilhealth.setEditable(false);
		txtPhilhealth.setBackground(new Color(255, 230, 199));
		txtPhilhealth.setColumns(10);
		txtPhilhealth.setBounds(94, 197, 139, 20);
		panel.add(txtPhilhealth);

		JLabel lblPagibig = new JLabel("Pagibig No.");
		lblPagibig.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblPagibig.setForeground(new Color(69, 69, 69));
		lblPagibig.setBounds(242, 200, 74, 17);
		panel.add(lblPagibig);

		txtPagibig = new JTextField();
		txtPagibig.setForeground(new Color(69, 69, 69));
		txtPagibig.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtPagibig.setEditable(false);
		txtPagibig.setBackground(new Color(255, 230, 199));
		txtPagibig.setColumns(10);
		txtPagibig.setBounds(326, 197, 139, 20);
		panel.add(txtPagibig);

		JLabel lblTIN = new JLabel("TIN No.");
		lblTIN.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblTIN.setForeground(new Color(69, 69, 69));
		lblTIN.setBounds(243, 175, 63, 14);
		panel.add(lblTIN);

		txtTIN = new JTextField();
		txtTIN.setForeground(new Color(69, 69, 69));
		txtTIN.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtTIN.setEditable(false);
		txtTIN.setBackground(new Color(255, 230, 199));
		txtTIN.setColumns(10);
		txtTIN.setBounds(326, 173, 139, 20);
		panel.add(txtTIN);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Payroll", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblBasic = new JLabel("Basic Salary");
		lblBasic.setForeground(new Color(69, 69, 69));
		lblBasic.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblBasic.setBounds(10, 22, 91, 14);
		panel_1.add(lblBasic);

		JLabel lblAllowance = new JLabel("Allowances");
		lblAllowance.setForeground(new Color(69, 69, 69));
		lblAllowance.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblAllowance.setBounds(10, 47, 72, 14);
		panel_1.add(lblAllowance);

		JLabel lblClothing = new JLabel("Clothing");
		lblClothing.setForeground(new Color(69, 69, 69));
		lblClothing.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblClothing.setBounds(20, 72, 62, 14);
		panel_1.add(lblClothing);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(new Color(69, 69, 69));
		lblPhone.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblPhone.setBounds(20, 97, 46, 14);
		panel_1.add(lblPhone);

		JLabel lblRice = new JLabel("Rice Subsidy");
		lblRice.setForeground(new Color(69, 69, 69));
		lblRice.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblRice.setBounds(20, 122, 77, 14);
		panel_1.add(lblRice);

		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setForeground(new Color(69, 69, 69));
		lblBonus.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblBonus.setBounds(10, 147, 72, 14);
		panel_1.add(lblBonus);

		JLabel lblDeduction = new JLabel("Deductions");
		lblDeduction.setForeground(new Color(69, 69, 69));
		lblDeduction.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblDeduction.setBounds(249, 22, 72, 14);
		panel_1.add(lblDeduction);

		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setForeground(new Color(69, 69, 69));
		lblInsurance.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblInsurance.setBounds(259, 47, 62, 14);
		panel_1.add(lblInsurance);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(231, 61, 9, 3);
		panel_1.add(lblNewLabel_8);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(new Color(69, 69, 69));
		lblTax.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblTax.setBounds(259, 72, 46, 14);
		panel_1.add(lblTax);

		JLabel lblNet = new JLabel("Salary (Net)");
		lblNet.setForeground(new Color(69, 69, 69));
		lblNet.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblNet.setBounds(249, 97, 72, 14);
		panel_1.add(lblNet);

		JLabel lblGross = new JLabel("Salary (Gross)");
		lblGross.setForeground(new Color(69, 69, 69));
		lblGross.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblGross.setBounds(246, 122, 91, 14);
		panel_1.add(lblGross);

		txtBasicSalary = new JTextField();
		txtBasicSalary.setEditable(false);
		txtBasicSalary.setBackground(new Color(255, 230, 199));
		txtBasicSalary.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtBasicSalary.setBounds(111, 19, 118, 20);
		panel_1.add(txtBasicSalary);
		txtBasicSalary.setColumns(10);

		txtPhone = new JTextField();
		txtPhone.setBackground(new Color(255, 230, 199));
		txtPhone.setEditable(false);
		txtPhone.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtPhone.setBounds(111, 94, 118, 20);
		panel_1.add(txtPhone);
		txtPhone.setColumns(10);

		txtClothing = new JTextField();
		txtClothing.setBackground(new Color(255, 230, 199));
		txtClothing.setEditable(false);
		txtClothing.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtClothing.setBounds(111, 69, 118, 20);
		panel_1.add(txtClothing);
		txtClothing.setColumns(10);

		txtRice = new JTextField();
		txtRice.setBackground(new Color(255, 230, 199));
		txtRice.setEditable(false);
		txtRice.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtRice.setBounds(111, 119, 118, 20);
		panel_1.add(txtRice);
		txtRice.setColumns(10);

		txtBonus = new JTextField();
		txtBonus.setBackground(new Color(255, 230, 199));
		txtBonus.setEditable(false);
		txtBonus.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtBonus.setBounds(111, 144, 118, 20);
		panel_1.add(txtBonus);
		txtBonus.setColumns(10);

		txtInsurance = new JTextField();
		txtInsurance.setBackground(new Color(255, 230, 199));
		txtInsurance.setEditable(false);
		txtInsurance.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtInsurance.setBounds(347, 44, 118, 20);
		panel_1.add(txtInsurance);
		txtInsurance.setColumns(10);

		txtTax = new JTextField();
		txtTax.setBackground(new Color(255, 230, 199));
		txtTax.setEditable(false);
		txtTax.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtTax.setColumns(10);
		txtTax.setBounds(347, 69, 118, 20);
		panel_1.add(txtTax);

		txtNet = new JTextField();
		txtNet.setBackground(new Color(255, 230, 199));
		txtNet.setEditable(false);
		txtNet.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtNet.setColumns(10);
		txtNet.setBounds(347, 94, 118, 20);
		panel_1.add(txtNet);

		txtGross = new JTextField();
		txtGross.setBackground(new Color(255, 230, 199));
		txtGross.setEditable(false);
		txtGross.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtGross.setColumns(10);
		txtGross.setBounds(347, 119, 118, 20);
		panel_1.add(txtGross);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Update Profile", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(new Color(220, 220, 220));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 475, 234);
		panel_3.add(panel_4);

		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setForeground(new Color(69, 69, 69));
		lblName_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblName_1.setBounds(132, 37, 63, 14);
		panel_4.add(lblName_1);

		JLabel lblDepartment_1 = new JLabel("Department");
		lblDepartment_1.setForeground(new Color(69, 69, 69));
		lblDepartment_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblDepartment_1.setBounds(132, 62, 81, 14);
		panel_4.add(lblDepartment_1);

		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setForeground(new Color(69, 69, 69));
		lblAddress_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblAddress_1.setBounds(132, 112, 81, 14);
		panel_4.add(lblAddress_1);

		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setForeground(new Color(69, 69, 69));
		lblEmail_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblEmail_1.setBounds(132, 87, 46, 14);
		panel_4.add(lblEmail_1);

		JLabel lblContact_1 = new JLabel("Contact");
		lblContact_1.setForeground(new Color(69, 69, 69));
		lblContact_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblContact_1.setBounds(132, 138, 63, 14);
		panel_4.add(lblContact_1);

		txtNameUp = new JTextField();
		txtNameUp.setBackground(new Color(255, 230, 199));
		txtNameUp.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		txtNameUp.setColumns(10);
		txtNameUp.setBounds(208, 34, 150, 20);
		panel_4.add(txtNameUp);

		txtDepartmentUp = new JTextField();
		txtDepartmentUp.setBackground(new Color(255, 230, 199));
		txtDepartmentUp.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		txtDepartmentUp.setColumns(10);
		txtDepartmentUp.setBounds(208, 59, 150, 20);
		panel_4.add(txtDepartmentUp);

		txtEmailUp = new JTextField();
		txtEmailUp.setBackground(new Color(255, 230, 199));
		txtEmailUp.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		txtEmailUp.setColumns(10);
		txtEmailUp.setBounds(208, 84, 150, 20);
		panel_4.add(txtEmailUp);

		txtAddressUp = new JTextField();
		txtAddressUp.setBackground(new Color(255, 230, 199));
		txtAddressUp.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		txtAddressUp.setColumns(10);
		txtAddressUp.setBounds(208, 109, 150, 20);
		panel_4.add(txtAddressUp);

		txtContactUp = new JTextField();
		txtContactUp.setBackground(new Color(255, 230, 199));
		txtContactUp.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		txtContactUp.setColumns(10);
		txtContactUp.setBounds(208, 135, 150, 20);
		panel_4.add(txtContactUp);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(255, 230, 199));
		tabbedPane.addTab("Request Leave", null, panel_2, null);
		panel_2.setLayout(null);

		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().setBackground(new Color(255, 165, 89));
		calendar.getMonthChooser().getSpinner().setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		calendar.getDayChooser().getDayPanel().setForeground(new Color(255, 165, 89));
		calendar.getDayChooser().setSundayForeground(new Color(255, 165, 89));
		calendar.getDayChooser().setWeekdayForeground(new Color(255, 255, 255));
		calendar.getDayChooser().setForeground(new Color(69, 69, 69));
		calendar.getDayChooser().setDecorationBackgroundColor(new Color(255, 165, 89));
		calendar.getDayChooser().getDayPanel().setBackground(new Color(255, 230, 199));
		calendar.getYearChooser().getSpinner().setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		calendar.getMonthChooser().getComboBox().setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		calendar.setBounds(0, 0, 247, 228);
		panel_2.add(calendar);

		JComboBox cmbLeave = new JComboBox();
		cmbLeave.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		cmbLeave.addItem("....");
		cmbLeave.addItem("Sick Leave");
		cmbLeave.addItem("Vacation Leave");
		cmbLeave.addItem("Emergency Leave");
		cmbLeave.setBounds(267, 152, 187, 22);
		panel_2.add(cmbLeave);

		JLabel lblSick = new JLabel("Sick");
		lblSick.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		lblSick.setForeground(new Color(0, 0, 0));
		lblSick.setBounds(282, 55, 34, 14);
		panel_2.add(lblSick);

		txtSick = new JTextField();
		txtSick.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtSick.setBounds(357, 52, 86, 20);
		panel_2.add(txtSick);
		txtSick.setColumns(10);

		JLabel lblVacation = new JLabel("Vacation");
		lblVacation.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		lblVacation.setBounds(282, 80, 65, 14);
		panel_2.add(lblVacation);

		txtEmergency = new JTextField();
		txtEmergency.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtEmergency.setColumns(10);
		txtEmergency.setBounds(357, 102, 86, 20);
		panel_2.add(txtEmergency);

		JLabel lblEmergency = new JLabel("Emergency");
		lblEmergency.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		lblEmergency.setForeground(new Color(0, 0, 0));
		lblEmergency.setBounds(282, 105, 93, 14);
		panel_2.add(lblEmergency);

		txtVacation = new JTextField();
		txtVacation.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		txtVacation.setColumns(10);
		txtVacation.setBounds(357, 77, 86, 20);
		panel_2.add(txtVacation);

		JLabel lblEmployeeName = new JLabel("Employee No.");
		lblEmployeeName.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		lblEmployeeName.setForeground(new Color(255, 230, 199));
		lblEmployeeName.setBounds(10, 30, 101, 14);
		frmMotorPhEmployee.getContentPane().add(lblEmployeeName);

		// Methods & Event Handlers

		// Logout the Employee Window and brings back the Login Window
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(255, 96, 0));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginSystem login = new LoginSystem();
				frmMotorPhEmployee.setVisible(false);
				login.frmDfsf.setVisible(true);
			}
		});

		btnLogout.setBounds(406, 326, 79, 35);
		frmMotorPhEmployee.getContentPane().add(btnLogout);

		JComboBox<String> comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(255, 165, 89));
		comboBox.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBox.getSelectedItem().equals("1111")) {
					try {
						// Reads the CSV file from local directory
						BufferedReader readerEmp = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee1111.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String lineEmp = readerEmp.readLine();
						String[] dataEmp = lineEmp.split(",");

						// Displays employee information from CSV file
						txtName.setText(dataEmp[1]);
						txtDepartment.setText(dataEmp[2]);
						txtEmail.setText(dataEmp[3]);
						txtAddress.setText(dataEmp[4]);
						txtContact.setText(dataEmp[5]);
						txtBirthday.setText(dataEmp[6]);
						txtSSS.setText(dataEmp[7]);
						txtPhilhealth.setText(dataEmp[8]);
						txtTIN.setText(dataEmp[9]);
						txtPagibig.setText(dataEmp[10]);

						readerEmp.close();

						// Payroll
						// Reads the CSV file from local directory
						BufferedReader readerPay = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\payroll1111.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String linePay = readerPay.readLine();
						String[] dataPay = linePay.split(",");

						// Displays payroll information from CSV file
						txtBasicSalary.setText(dataPay[0]);
						txtClothing.setText(dataPay[1]);
						txtPhone.setText(dataPay[2]);
						txtRice.setText(dataPay[3]);
						txtBonus.setText(dataPay[4]);
						txtInsurance.setText(dataPay[5]);
						txtTax.setText(dataPay[6]);
						txtNet.setText(dataPay[7]);
						txtGross.setText(dataPay[8]);

						// Leaves
						BufferedReader readerLeave = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));

						String lineLeave = readerLeave.readLine();
						String[] dataLeave = lineLeave.split(",");
						txtSick.setText(dataLeave[0]);
						txtVacation.setText(dataLeave[1]);
						txtEmergency.setText(dataLeave[2]);

						lblProfilePic.setIcon(new ImageIcon(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\male.png"));

					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "File not found");
					}

				} else if (comboBox.getSelectedItem().equals("2222")) {
					try {
						// Reads the CSV file from local directory
						BufferedReader readerEmp = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee2222.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String lineEmp = readerEmp.readLine();
						String[] dataEmp = lineEmp.split(",");

						// Display employee information from CSV file
						txtName.setText(dataEmp[1]);
						txtDepartment.setText(dataEmp[2]);
						txtEmail.setText(dataEmp[3]);
						txtAddress.setText(dataEmp[4]);
						txtContact.setText(dataEmp[5]);
						txtBirthday.setText(dataEmp[6]);
						txtSSS.setText(dataEmp[7]);
						txtPhilhealth.setText(dataEmp[8]);
						txtTIN.setText(dataEmp[9]);
						txtPagibig.setText(dataEmp[10]);

						readerEmp.close();

						// Payroll
						// Reads the CSV file from local directory
						BufferedReader readerPay = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\payroll2222.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String linePay = readerPay.readLine();
						String[] dataPay = linePay.split(",");

						// Displays payroll information from CSV file
						txtBasicSalary.setText(dataPay[0]);
						txtClothing.setText(dataPay[1]);
						txtPhone.setText(dataPay[2]);
						txtRice.setText(dataPay[3]);
						txtBonus.setText(dataPay[4]);
						txtInsurance.setText(dataPay[5]);
						txtTax.setText(dataPay[6]);
						txtNet.setText(dataPay[7]);
						txtGross.setText(dataPay[8]);

						// Leaves
						BufferedReader readerLeave = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
						String lineLeave = readerLeave.readLine();
						String[] dataLeave = lineLeave.split(",");
						txtSick.setText(dataLeave[0]);
						txtVacation.setText(dataLeave[1]);
						txtEmergency.setText(dataLeave[2]);

						lblProfilePic.setIcon(new ImageIcon(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\female.png"));

					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "File not found");
					}

				} else if (comboBox.getSelectedItem().equals("....")) {
					// Sets the textfields to empty
					txtName.setText("....");
					txtDepartment.setText("....");
					txtEmail.setText("....");
					txtAddress.setText("....");
					txtContact.setText("....");
					txtBirthday.setText(".....");
					txtSSS.setText(".....");
					txtPhilhealth.setText(".....");
					txtTIN.setText(".....");
					txtPagibig.setText(".....");

					txtBasicSalary.setText(".....");
					txtClothing.setText(".....");
					txtPhone.setText(".....");
					txtRice.setText(".....");
					txtBonus.setText(".....");
					txtInsurance.setText(".....");
					txtTax.setText(".....");
					txtNet.setText(".....");
					txtGross.setText(".....");

					txtSick.setText("....");
					txtVacation.setText("....");
					txtEmergency.setText("....");

					lblProfilePic.setIcon(
							new ImageIcon("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\blank.png"));
				}
			}
		});

		comboBox.setToolTipText("");
		comboBox.setBounds(95, 26, 67, 22);
		comboBox.addItem("....");
		comboBox.addItem("1111");
		comboBox.addItem("2222");
		frmMotorPhEmployee.getContentPane().add(comboBox);

		// Payroll Print
		JButton btnPrint = new JButton("Print");
		btnPrint.setForeground(new Color(69, 69, 69));
		btnPrint.setBackground(new Color(255, 165, 89));
		btnPrint.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!comboBox.getSelectedItem().equals("....")) {
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\Payroll.txt", true));
						writer.write("Employee No.: " + comboBox.getSelectedItem() + "\n");
						writer.write("\n");
						writer.write("Basic Salary: " + txtBasicSalary.getText() + "\n");
						writer.write("Phone Allowance: " + txtPhone.getText() + "\n");
						writer.write("Clothing Allowance: " + txtClothing.getText() + "\n");
						writer.write("Rice Allowance: " + txtRice.getText() + "\n");
						writer.write("Bonus: " + txtBonus.getText() + "\n");
						writer.write("Insurance: " + txtInsurance.getText() + "\n");
						writer.write("Tax: " + txtTax.getText() + "\n");
						writer.write("Net: " + txtNet.getText() + "\n");
						writer.write("Gross: " + txtGross.getText() + "\n");
						writer.write("******************** \n");
						writer.close();

						JOptionPane.showMessageDialog(null, "Payroll Printed.");

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else
					JOptionPane.showMessageDialog(null, "Invalid Employee Number.");
			}
		});
		btnPrint.setBounds(200, 180, 75, 30);
		panel_1.add(btnPrint);

		// Update and Delete Data Method
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(255, 165, 89));
		btnUpdate.setForeground(new Color(69, 69, 69));
		btnUpdate.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Declaring variables to shorten the code
				String nameUp = txtNameUp.getText();
				String departmentUp = txtDepartmentUp.getText();
				String emailUp = txtEmailUp.getText();
				String addressUp = txtAddressUp.getText();
				String contactUp = txtContactUp.getText();

				if (comboBox.getSelectedItem().equals("....")) {
					JOptionPane.showMessageDialog(null, "Invalid Employee Number.");

				} else if (comboBox.getSelectedItem().equals("1111")) {
					try {
						// Reads the CSV file from the local path
						BufferedReader reader = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee1111.csv"));
						String line = reader.readLine();
						StringBuilder dataUpdate = new StringBuilder();

						// Reads the data that separated by "," and updates there values from the
						// textfield
						while (line != null) {
							String[] data = line.split(",");
							// Setting the inputs as the new data
							data[1] = nameUp;
							data[2] = departmentUp;
							data[3] = emailUp;
							data[4] = addressUp;
							data[5] = contactUp;

							// Appending the inputs and separate it with "," to format it as CSV file
							dataUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();
						}

						reader.close();

						// Updating the CSV file
						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee1111.csv"));
						// Writes the appended data to the CSV file
						writer.write(dataUpdate.toString());
						writer.flush();
						writer.close();

						JOptionPane.showMessageDialog(null, "Profile Updated.");

					} catch (Exception ex) {
						return;
					}

				} else if (comboBox.getSelectedItem().equals("2222")) {
					try {
						// Reads the CSV file from the local path
						BufferedReader reader = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee2222.csv"));
						String line = reader.readLine();
						StringBuilder dataUpdate = new StringBuilder();

						// Reads the data that separated by "," and updates there values from the
						// textfield
						while (line != null) {
							String[] data = line.split(",");
							// Setting the inputs as the new data
							data[1] = nameUp;
							data[2] = departmentUp;
							data[3] = emailUp;
							data[4] = addressUp;
							data[5] = contactUp;

							// Appending the inputs and separate it with "," to format it as CSV file
							dataUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();
						}

						reader.close();

						// Updating the CSV file
						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee2222.csv"));
						// Writes the appended data to the CSV file
						writer.write(dataUpdate.toString());
						writer.flush();
						writer.close();

						JOptionPane.showMessageDialog(null, "Profile Updated.");

					} catch (Exception ex) {
						return;
					}
				}
				// Clears the textfield after updating
				txtNameUp.setText("");
				txtDepartmentUp.setText("");
				txtEmailUp.setText("");
				txtAddressUp.setText("");
				txtContactUp.setText("");
			}
		});
		btnUpdate.setBounds(200, 180, 75, 30);
		panel_4.add(btnUpdate);

		// Request Leave Method & Event Handlers
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(255, 165, 89));
		btnSubmit.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 13));
		btnSubmit.setForeground(new Color(69, 69, 69));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbLeave.getSelectedItem().equals("....")) {
					JOptionPane.showMessageDialog(null, "Please choose you leave type.");
				} else if (comboBox.getSelectedItem().equals("....")) {
					JOptionPane.showMessageDialog(null, "Invalid Employee Number.");

					// Employee 1111 (Leave)
				} else if (comboBox.getSelectedItem().equals("1111")) {
					if (cmbLeave.getSelectedItem().equals("Sick Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[0]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[0] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough sick leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));

							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Vacation Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[1]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[1] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough vacation leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Emergency Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[2]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[2] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough emergency leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					}

					// Employee 2222 (Leave)
				} else if (comboBox.getSelectedItem().equals("2222")) {
					if (cmbLeave.getSelectedItem().equals("Sick Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[0]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[0] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough sick leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));

							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Vacation Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[1]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[1] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough vacation leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Emergency Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[2]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[2] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough emergency leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					}

				}
			}
		});

		btnSubmit.setBounds(325, 185, 75, 30);
		panel_2.add(btnSubmit);

		JLabel lblAvailable = new JLabel("Available Leaves");
		lblAvailable.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		lblAvailable.setForeground(new Color(0, 0, 0));
		lblAvailable.setBounds(267, 11, 98, 14);
		panel_2.add(lblAvailable);

		JSeparator separator = new JSeparator();
		separator.setBounds(267, 145, 187, 2);
		panel_2.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(267, 36, 187, 2);
		panel_2.add(separator_1);
	}
}