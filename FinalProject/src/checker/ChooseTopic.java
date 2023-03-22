package checker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examTaker.Information;
import finalProject.FacultyMenu;

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

public class ChooseTopic extends JFrame {

	private JPanel contentPane;
	public String Firstname;
	public String Lastname;
	/**
	 * Create the frame.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseTopic frame = new ChooseTopic();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ChooseTopic() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Please choose the quiz topic");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcome.setBounds(61, 11, 274, 48);
		contentPane.add(lblWelcome);
		
		JComboBox Topic = new JComboBox();
		
		Topic.setBounds(112, 55, 223, 20);
	
		
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
		lblQuizTopic.setBounds(37, 57, 86, 17);
		contentPane.add(lblQuizTopic);
		
		JButton btnTakeQuiz = new JButton("Continue");
		btnTakeQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
					String SelectedTopic;
					
				SelectedTopic = Topic.getSelectedItem().toString();
				
				Checker check = new Checker(SelectedTopic);
				
				check.setVisible(true);
			
				 dispose();
				
			}
		});
		btnTakeQuiz.setBounds(199, 97, 91, 23);
		contentPane.add(btnTakeQuiz);
		
		JButton btnBack = new JButton("Close");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				dispose();
				
			}
		});
		btnBack.setBounds(94, 97, 91, 23);
		contentPane.add(btnBack);
		
		
	
	}
}
