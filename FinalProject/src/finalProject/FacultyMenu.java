package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import checker.ChooseTopic;
import displayData.DisplayDatabase;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacultyMenu extends JFrame {

	private JPanel contentPane;
	JLabel Name;
	private JButton btnNewButton;
	private JButton btnViewResults;
	private JButton btnLogout;
	private JButton btnCheck;

	/**
	 * Create the frame.
	 */
	public FacultyMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setBounds(75, 11, 109, 43);
		contentPane.add(lblWelcome);
		
		Name = new JLabel("N/A");
		Name.setFont(new Font("Tahoma", Font.BOLD, 20));
		Name.setBounds(55, 40, 171, 43);
		contentPane.add(Name);
		
		btnNewButton = new JButton("Create Exam");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ExamCreator ec = new ExamCreator();
				ec.setVisible(true);
			
			}
		});
		btnNewButton.setBounds(68, 94, 122, 23);
		contentPane.add(btnNewButton);
		
		btnViewResults = new JButton("View Results");
		btnViewResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DisplayDatabase DD = new DisplayDatabase();
				DD.setVisible(true);
				
			}
		});
		btnViewResults.setBounds(68, 129, 122, 23);
		contentPane.add(btnViewResults);
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginFaculty login = new LoginFaculty();
				login.setVisible(true);
				dispose();
				
			}
		});
		btnLogout.setBounds(68, 197, 122, 23);
		contentPane.add(btnLogout);
		
		btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChooseTopic choose = new ChooseTopic();
				choose.setVisible(true);
			
			}
		});
		btnCheck.setBounds(68, 163, 122, 23);
		contentPane.add(btnCheck);
		
	}

}
