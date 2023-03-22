package examTaker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;

import finalProject.Error;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Information extends JFrame {

	private JPanel contentPane;
	private JTextField Fname;
	private JTextField Lname;
	String Firstname;
	String Lastname;
	int code;
	 String Generate = "" ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
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
	public Information() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmitAndTake = new JButton("Submit and Take Quiz");
		btnSubmitAndTake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((Fname.getText().length()==0)||(Lname.getText().length()==0)){
					Error error = new Error();
					error.setVisible(true);
					
				}
				else{
	
				
				try {
					java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
					PreparedStatement ps = null;
					
					String sql = "Insert into Examiners(Code,Firstname,Lastname) values(?,?,?)";
					
					ps = conn.prepareStatement(sql);
					
					
					Firstname = Fname.getText();
					Lastname = Lname.getText();
					


				        Random r = new Random();

				        String alphabet = "1234567890";
				        for (int i = 0; i < 8; i++) {
				            Generate = Generate + Character.toString(alphabet.charAt(r.nextInt(alphabet.length())));
				        }
					
				        code = Integer.parseInt(Generate);
				        
				        ModelInfo mod = new ModelInfo();
				    
				        mod.setCode(code);
				        mod.setFirstname(Firstname);
				        mod.setLastname(Lastname);
				        mod.setGenerated(Generate);
				        
					ps.setInt(1, code);
					ps.setString(2, Firstname);
					ps.setString(3, Lastname);
					
					ps.executeUpdate();
					

				
				StudentMenu sm = new StudentMenu();
				sm.examCode.setText(Generate);
				sm.Firstname=Firstname;
				sm.Lastname=Lastname;
				sm.setVisible(true);
				dispose();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
				
			
			
			
			}
		});
		btnSubmitAndTake.setBounds(88, 84, 172, 23);
		contentPane.add(btnSubmitAndTake);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnCancel.setBounds(270, 84, 91, 23);
		contentPane.add(btnCancel);
		
		JLabel lblFirstname = new JLabel("Firstname: ");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstname.setBounds(41, 21, 91, 14);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Lastname: ");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastname.setBounds(44, 46, 91, 14);
		contentPane.add(lblLastname);
		
		Fname = new JTextField();
		Fname.setBounds(127, 20, 265, 20);
		contentPane.add(Fname);
		Fname.setColumns(10);
		
		Lname = new JTextField();
		Lname.setColumns(10);
		Lname.setBounds(127, 45, 265, 20);
		contentPane.add(Lname);
	}
}
