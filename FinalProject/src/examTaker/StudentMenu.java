package examTaker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMenu extends JFrame {

	private JPanel contentPane;
	public JTextField examCode;
	public String Firstname;
	public String Lastname;
	/**
	 * Create the frame.
	 */
	public StudentMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblWelcome.setBounds(119, 11, 151, 30);
		contentPane.add(lblWelcome);
		
		JLabel lblYourExaminationCode = new JLabel("Your examination code is: ");
		lblYourExaminationCode.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblYourExaminationCode.setBounds(26, 47, 234, 30);
		contentPane.add(lblYourExaminationCode);
		
		examCode = new JTextField();
		examCode.setEditable(false);
		examCode.setBounds(256, 52, 86, 20);
		contentPane.add(examCode);
		examCode.setColumns(10);
		
		JComboBox Topic = new JComboBox();
		
		Topic.setBounds(119, 99, 223, 20);
	
		
		java.sql.Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
			
			java.sql.Statement stmt = conn.createStatement();
		
			 ResultSet rs = stmt.executeQuery("select * from Examinations");
			 

			 
			 while(rs.next())
			 {
				 Topic.addItem(rs.getString("Topic"));
			 }
			 
	
				 
				 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		contentPane.add(Topic);
		
		JLabel lblQuizTopic = new JLabel("Quiz Topic:");
		lblQuizTopic.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuizTopic.setBounds(44, 101, 86, 17);
		contentPane.add(lblQuizTopic);
		
		JButton btnTakeQuiz = new JButton("Take Quiz");
		btnTakeQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				 ModelInfo mod = new ModelInfo();
				 mod.setTopic(Topic.getSelectedItem().toString());
				
				 System.out.println(mod.Topic);
				 ExamTaker ET = new ExamTaker(mod.Topic,Firstname,Lastname);
			
				 ET.setVisible(true);
				 dispose();
				
			}
		});
		btnTakeQuiz.setBounds(139, 143, 91, 23);
		contentPane.add(btnTakeQuiz);
		
		
	
	}
}
