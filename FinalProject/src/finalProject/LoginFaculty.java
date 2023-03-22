package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFaculty extends JFrame {

	private JPanel contentPane;
	private JTextField username;


String UserName="";
private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFaculty frame = new LoginFaculty();
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
	public LoginFaculty() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacultyLogin = new JLabel("Faculty Login");
		lblFacultyLogin.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblFacultyLogin.setBounds(95, 8, 166, 39);
		contentPane.add(lblFacultyLogin);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(33, 58, 103, 20);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(38, 89, 103, 20);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(127, 58, 172, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Username = username.getText();
				String Password = passwordField.getText();
				String Pass = null;
				String Firstname = null;
				String Lastname = null;
				
				try {
					java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
				
					java.sql.Statement stmt = conn.createStatement();
				
					 ResultSet rs = stmt.executeQuery("select * from Faculty where Username= "+"'"+ Username+"'");
					 
					 while(rs.next())
					 {

						 UserName = rs.getString("Username");
						 Pass=rs.getString("Password");
						 Firstname = rs.getString("Firstname");
						 Lastname = rs.getString("Lastname");
					 }
				
					 if(UserName.equals(""))
					 {
						 
						 Restricted rest = new Restricted();
						 rest.setVisible(true);
					 }
					 
					 else
					 {
					 
					 if(!(Pass.equals(Password)))
					 {
						 Restricted rest = new Restricted();
						 rest.setVisible(true);
					 }
					
					 else{
						 
						 FacultyMenu fac = new FacultyMenu();
						 fac.setVisible(true);
						 fac.Name.setText(Firstname+" "+Lastname);
 
						 dispose();
					 }
					 
					 
					 }
					 
					 
					 
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					 Restricted rest = new Restricted();
					 rest.setVisible(true);
				}
				
				
		
				
				
				
				
			}
		});
		btnLogin.setBounds(78, 130, 91, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnExit.setBounds(179, 130, 91, 23);
		contentPane.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 89, 172, 20);
		contentPane.add(passwordField);
	}
}
