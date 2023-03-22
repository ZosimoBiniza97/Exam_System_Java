package checker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examTaker.AnswersModel;
import finalProject.KeyToCorrection;
import finalProject.Model;

import javax.swing.JLabel;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Checker extends JFrame {

	int[] countershuffled;
	private JPanel contentPane;
	private JLabel[] Question;
	private JLabel[] qa;
	private JLabel[] qb;
	private JLabel[] qc;
	private JLabel[] qd;

	String[] qstn={"","","","","","","","","",""};
	String[] optnA={"","","","","","","","","",""};
	String[] optnB={"","","","","","","","","",""};
	String[] optnC={"","","","","","","","","",""};
	String[] optnD={"","","","","","","","","",""};

	
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel[] s;
	private JLabel[] c;
	String[] UserAnswer = new String[10];
	private JTextField Code;
	
	public String Firstname;
	public String Lastname;
	public int ExamCode=0;
	
	/**
	 * Launch the application.
	 */

	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public Checker(String Location) {
		setResizable(false);
		
		JLabel Question[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qa[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qb[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qc[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qd[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel c[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel s[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel no7 = new JPanel();
		no7.setBounds(10, 124, 972, 524);
		contentPane.add(no7);
		no7.setLayout(null);
		
		JLabel no1 = new JLabel("1.");
		no1.setFont(new Font("Tahoma", Font.BOLD, 15));
		no1.setBounds(10, 11, 46, 14);
		no7.add(no1);
		
		Question[0] = new JLabel();
		Question[0].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[0].setBounds(36, 12, 734, 14);
		no7.add(Question[0]);
		

	
		qa[0].setBounds(72, 38, 139, 14);
		no7.add(qa[0]);
		

		qb[0].setBounds(247, 38, 139, 14);
		no7.add(qb[0]);
		

		
		
		qc[0].setBounds(422, 38, 139, 14);
		no7.add(qc[0]);
		
		
		qd[0].setBounds(597, 39, 139, 14);
		no7.add(qd[0]);
		


		
		qd[1].setBounds(597, 88, 139, 14);
		no7.add(qd[1]);
		

	
		qc[1].setBounds(422, 87, 139, 14);
		no7.add(qc[1]);
				
	
		qb[1].setBounds(247, 87, 139, 14);
		no7.add(qb[1]);
				
	
		qa[1].setBounds(72, 87, 139, 14);
		no7.add(qa[1]);
		
	
		JLabel no2 = new JLabel("2.");
		no2.setFont(new Font("Tahoma", Font.BOLD, 15));
		no2.setBounds(10, 60, 46, 14);
		no7.add(no2);
		
		Question[1] = new JLabel();
		Question[1].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[1].setBounds(36, 61, 734, 14);
		no7.add(Question[1]);
		

		qd[2].setBounds(597, 137, 139, 14);
		no7.add(qd[2]);
		
		

		qc[2].setBounds(422, 136, 139, 14);
		no7.add(qc[2]);
		
		

		qb[2].setBounds(247, 136, 139, 14);
		no7.add(qb[2]);
		
		
		
		qa[2].setBounds(72, 136, 139, 14);
		no7.add(qa[2]);
		
		
		JLabel no3 = new JLabel("3.");
		no3.setFont(new Font("Tahoma", Font.BOLD, 15));
		no3.setBounds(10, 109, 46, 14);
		no7.add(no3);
		
		Question[2] = new JLabel();
		Question[2].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[2].setBounds(36, 110, 734, 14);
		no7.add(Question[2]);
		
	
		qd[3].setBounds(597, 186, 139, 14);
		no7.add(qd[3]);
		

		qc[3].setBounds(422, 185, 139, 14);
		no7.add(qc[3]);
		
		
		qb[3].setBounds(247, 185, 139, 14);
		no7.add(qb[3]);
		
	
	
		qa[3].setBounds(72, 185, 139, 14);
		no7.add(qa[3]);
		
	
		
		JLabel no4 = new JLabel("4.");
		no4.setFont(new Font("Tahoma", Font.BOLD, 15));
		no4.setBounds(10, 158, 46, 14);
		no7.add(no4);
		
		Question[3] = new JLabel();
		Question[3].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[3].setBounds(36, 159, 734, 14);
		no7.add(Question[3]);
		
		
		qd[4].setBounds(597, 235, 139, 14);
		no7.add(qd[4]);
		
		
	
		qc[4].setBounds(422, 234, 139, 14);
		no7.add(qc[4]);
		
		
	
		qb[4].setBounds(247, 234, 139, 14);
		no7.add(qb[4]);
		
		
		
		qa[3].setBounds(72, 234, 139, 14);
		no7.add(qa[3]);
		
		
		
		JLabel no5 = new JLabel("5.");
		no5.setFont(new Font("Tahoma", Font.BOLD, 15));
		no5.setBounds(10, 207, 46, 14);
		no7.add(no5);
		
		Question[4] = new JLabel();
		Question[4].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[4].setBounds(36, 208, 734, 14);
		no7.add(Question[4]);
		

		qd[5].setBounds(597, 284, 139, 14);
		no7.add(qd[5]);
		
		
		qc[5].setBounds(422, 283, 139, 14);
		no7.add(qc[5]);
		
		
	
		qb[5].setBounds(247, 283, 139, 14);
		no7.add(qb[5]);
		
		
	
		qa[5].setBounds(72, 283, 139, 14);
		no7.add(qa[5]);
		
		
		JLabel no6 = new JLabel("6.");
		no6.setFont(new Font("Tahoma", Font.BOLD, 15));
		no6.setBounds(10, 256, 46, 14);
		no7.add(no6);
		
		Question[5] = new JLabel();
		Question[5].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[5].setBounds(36, 257, 734, 14);
		no7.add(Question[5]);
		

		qd[6].setBounds(597, 333, 139, 14);
		no7.add(qd[6]);
		

		qc[6].setBounds(422, 332, 139, 14);
		no7.add(qc[6]);
		

		qb[6].setBounds(247, 332, 139, 14);
		no7.add(qb[6]);
		

		qa[6].setBounds(72, 332, 139, 14);
		no7.add(qa[6]);
		
		
		JLabel label_38 = new JLabel("7.");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_38.setBounds(10, 305, 46, 14);
		no7.add(label_38);
		
		Question[6] = new JLabel();
		Question[6].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[6].setBounds(36, 306, 734, 14);
		no7.add(Question[6]);
		
	
		qd[7].setBounds(597, 382, 139, 14);
		no7.add(qd[7]);
		
		
		qc[7].setBounds(422, 381, 139, 14);
		no7.add(qc[7]);
		

		qb[7].setBounds(247, 381, 139, 14);
		no7.add(qb[7]);
		
	
		qa[7].setBounds(72, 381, 139, 14);
		no7.add(qa[7]);
		
		
		JLabel no8 = new JLabel("8.");
		no8.setFont(new Font("Tahoma", Font.BOLD, 15));
		no8.setBounds(10, 354, 46, 14);
		no7.add(no8);
		
		Question[7] = new JLabel();
		Question[7].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[7].setBounds(36, 355, 734, 14);
		no7.add(Question[7]);
		
		
		qd[8].setBounds(597, 431, 139, 14);
		no7.add(qd[8]);
		
		
		qc[8].setBounds(422, 430, 139, 14);
		no7.add(qc[8]);
		
	
		qb[8].setBounds(247, 430, 139, 14);
		no7.add(qb[8]);
		
		
		qa[8].setBounds(72, 430, 139, 14);
		no7.add(qa[8]);
		
	
		JLabel no9 = new JLabel("9.");
		no9.setFont(new Font("Tahoma", Font.BOLD, 15));
		no9.setBounds(10, 403, 46, 14);
		no7.add(no9);
		
		Question[8] = new JLabel();
		Question[8].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[8].setBounds(36, 404, 734, 14);
		no7.add(Question[8]);
		
		qd[9].setBounds(597, 480, 139, 14);
		no7.add(qd[9]);
		
	
		qc[9].setBounds(422, 479, 139, 14);
		no7.add(qc[9]);
		
		
	
		qb[9].setBounds(247, 479, 139, 14);
		no7.add(qb[9]);
		
	
		qa[9].setBounds(72, 479, 139, 14);
		no7.add(qa[9]);
		
		
		JLabel no10 = new JLabel("10.");
		no10.setFont(new Font("Tahoma", Font.BOLD, 15));
		no10.setBounds(0, 452, 46, 14);
		no7.add(no10);
		
		Question[9] = new JLabel();
		Question[9].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[9].setBounds(36, 453, 734, 14);
		no7.add(Question[9]);
		
		
		
	
		
		qa[3].setBounds(70, 186, 142, 14);
		no7.add(qa[3]);
		
	
		qa[4].setBounds(73, 235, 142, 14);
		no7.add(qa[4]);
		
		JLabel label = new JLabel("Student's answer: ");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(790, 11, 122, 14);
		no7.add(label);
		
		JLabel label_1 = new JLabel("Correct answer: ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(805, 29, 109, 14);
		no7.add(label_1);
		
		JLabel label_2 = new JLabel("Student's answer: ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(788, 60, 122, 14);
		no7.add(label_2);
		
		JLabel label_3 = new JLabel("Correct answer: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(803, 78, 109, 14);
		no7.add(label_3);
		
		JLabel label_4 = new JLabel("Student's answer: ");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(788, 109, 122, 14);
		no7.add(label_4);
		
		JLabel label_5 = new JLabel("Correct answer: ");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(803, 127, 109, 14);
		no7.add(label_5);
		
		JLabel label_6 = new JLabel("Student's answer: ");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(788, 158, 122, 14);
		no7.add(label_6);
		
		JLabel label_7 = new JLabel("Correct answer: ");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(803, 176, 109, 14);
		no7.add(label_7);
		
		JLabel label_8 = new JLabel("Student's answer: ");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(788, 207, 122, 14);
		no7.add(label_8);
		
		JLabel label_9 = new JLabel("Correct answer: ");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(803, 225, 109, 14);
		no7.add(label_9);
		
		JLabel label_10 = new JLabel("Student's answer: ");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(788, 256, 122, 14);
		no7.add(label_10);
		
		JLabel label_11 = new JLabel("Correct answer: ");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(803, 274, 109, 14);
		no7.add(label_11);
		
		JLabel label_12 = new JLabel("Student's answer: ");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(788, 305, 122, 14);
		no7.add(label_12);
		
		JLabel label_13 = new JLabel("Correct answer: ");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_13.setBounds(803, 323, 109, 14);
		no7.add(label_13);
		
		JLabel label_14 = new JLabel("Student's answer: ");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_14.setBounds(788, 354, 122, 14);
		no7.add(label_14);
		
		JLabel label_15 = new JLabel("Correct answer: ");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_15.setBounds(803, 372, 109, 14);
		no7.add(label_15);
		
		JLabel label_16 = new JLabel("Student's answer: ");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_16.setBounds(788, 403, 122, 14);
		no7.add(label_16);
		
		JLabel label_17 = new JLabel("Correct answer: ");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_17.setBounds(803, 421, 109, 14);
		no7.add(label_17);
		
		JLabel label_18 = new JLabel("Student's answer: ");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_18.setBounds(788, 452, 122, 14);
		no7.add(label_18);
		
		JLabel label_19 = new JLabel("Correct answer: ");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_19.setBounds(803, 470, 109, 14);
		no7.add(label_19);
		
		JLabel label_20 = new JLabel("1.");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_20.setBounds(763, 11, 46, 14);
		no7.add(label_20);
		
		JLabel label_21 = new JLabel("2.");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_21.setBounds(763, 60, 46, 14);
		no7.add(label_21);
		
		JLabel label_22 = new JLabel("3.");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_22.setBounds(763, 109, 46, 14);
		no7.add(label_22);
		
		JLabel label_23 = new JLabel("4.");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_23.setBounds(763, 158, 46, 14);
		no7.add(label_23);
		
		JLabel label_24 = new JLabel("5.");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_24.setBounds(763, 207, 46, 14);
		no7.add(label_24);
		
		JLabel label_25 = new JLabel("6.");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_25.setBounds(763, 256, 46, 14);
		no7.add(label_25);
		
		JLabel label_26 = new JLabel("7.");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_26.setBounds(763, 305, 46, 14);
		no7.add(label_26);
		
		JLabel label_27 = new JLabel("8.");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_27.setBounds(763, 354, 46, 14);
		no7.add(label_27);
		
		JLabel label_28 = new JLabel("9.");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_28.setBounds(763, 403, 46, 14);
		no7.add(label_28);
		
		JLabel label_29 = new JLabel("10.");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_29.setBounds(753, 452, 46, 14);
		no7.add(label_29);
		
		s[0] = new JLabel();
		s[0].setBounds(904, 11, 46, 14);
		no7.add(s[0]);
		
		c[0] = new JLabel();
		c[0].setBounds(904, 30, 46, 14);
		no7.add(c[0]);
		
		c[1] = new JLabel();
		c[1].setBounds(904, 78, 46, 14);
		no7.add(c[1]);
		
		s[1] = new JLabel();
		s[1].setBounds(904, 59, 46, 14);
		no7.add(s[1]);
		
		c[3] = new JLabel();
		c[3].setBounds(904, 176, 46, 14);
		no7.add(c[3]);
		
		s[3] = new JLabel();
		s[3].setBounds(904, 157, 46, 14);
		no7.add(s[3]);
		
		c[2] = new JLabel();
		c[2].setBounds(904, 128, 46, 14);
		no7.add(c[2]);
		
		s[2] = new JLabel();
		s[2].setBounds(904, 109, 46, 14);
		no7.add(s[2]);
		
		c[7] = new JLabel();
		c[7].setBounds(904, 372, 46, 14);
		no7.add(c[7]);
		
		s[7] = new JLabel();
		s[7].setBounds(904, 353, 46, 14);
		no7.add(s[7]);
		
		c[6] = new JLabel();
		c[6].setBounds(904, 324, 46, 14);
		no7.add(c[6]);
		
		s[6] = new JLabel();
		s[6].setBounds(904, 305, 46, 14);
		no7.add(s[6]);
		
		c[5] = new JLabel();
		c[5].setBounds(904, 274, 46, 14);
		no7.add(c[5]);
		
		s[5] = new JLabel();
		s[5].setBounds(904, 255, 46, 14);
		no7.add(s[5]);
		
		c[4] = new JLabel();
		c[4].setBounds(904, 226, 46, 14);
		no7.add(c[4]);
		
		s[4] = new JLabel();
		s[4].setBounds(904, 207, 46, 14);
		no7.add(s[4]);
		
		c[9] = new JLabel();
		c[9].setBounds(904, 470, 46, 14);
		no7.add(c[9]);
		
		s[9] = new JLabel();
		s[9].setBounds(904, 451, 46, 14);
		no7.add(s[9]);
		
		s[8] = new JLabel();
		s[8].setBounds(904, 403, 46, 14);
		no7.add(s[8]);
		
		c[8] = new JLabel();
		c[8].setBounds(904, 422, 46, 14);
		no7.add(c[8]);
		
		JLabel lblScore = new JLabel("Score: ");
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScore.setBounds(787, 56, 71, 25);
		contentPane.add(lblScore);
		
		JLabel scorelbl = new JLabel("");
		scorelbl.setFont(new Font("Tahoma", Font.BOLD, 25));
		scorelbl.setBounds(853, 31, 104, 70);
		contentPane.add(scorelbl);
		
		
		JLabel TPC = new JLabel((String) null);
		TPC.setFont(new Font("Tahoma", Font.BOLD, 17));
		TPC.setBounds(467, 11, 317, 23);
		contentPane.add(TPC);
		
		JLabel label_31 = new JLabel("Topic: ");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_31.setBounds(400, 11, 57, 23);
		contentPane.add(label_31);
		
		JLabel SC = new JLabel((String) null);
		SC.setFont(new Font("Tahoma", Font.BOLD, 17));
		SC.setBounds(269, 11, 121, 23);
		contentPane.add(SC);
		
		JLabel label_33 = new JLabel("Section: ");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_33.setBounds(188, 11, 80, 23);
		contentPane.add(label_33);
		
		JLabel QN = new JLabel((String) null);
		QN.setFont(new Font("Tahoma", Font.BOLD, 17));
		QN.setBounds(129, 11, 43, 23);
		contentPane.add(QN);
		
		JLabel label_35 = new JLabel("Quiz No: ");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_35.setBounds(51, 11, 80, 23);
		contentPane.add(label_35);
		
		JLabel Fname = new JLabel("Firstname: ");
		Fname.setFont(new Font("Tahoma", Font.BOLD, 17));
		Fname.setBounds(283, 56, 234, 23);
		contentPane.add(Fname);
		
		JLabel Lname = new JLabel("Firstname: ");
		Lname.setFont(new Font("Tahoma", Font.BOLD, 17));
		Lname.setBounds(527, 56, 219, 23);
		contentPane.add(Lname);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
					Statement myStatement = conn.createStatement();
					
					ResultSet myRS = myStatement.executeQuery("Select * from Examiners where Code="+Code.getText());
					
					while(myRS.next())
					{
					Firstname=myRS.getString("Firstname");
					Lastname=myRS.getString("Lastname");
					ExamCode=myRS.getInt("Code");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch bloc
					
				}
				
				
				if(ExamCode==0)
				{
					
					ErrorNotFound err = new ErrorNotFound();
					err.setVisible(true);
				}
				else
				{
				
				Fname.setText("Firstname: "+Firstname);
				Lname.setText("Lastname: "+Lastname);
				
				
				Model mod = null;
				
				  String directory = System.getProperty("user.home")+"\\Documents\\Examinations\\"+Location;
			        String filename = "Encrypted.txt";
			      
			        File file = new File(directory + File.separator + filename);    
				try {
					
					FileInputStream fileIn = new FileInputStream(file);
					
						ObjectInputStream in = new ObjectInputStream(fileIn);
						mod =(Model) in.readObject();
						in.close();
						fileIn.close();
					
				}
				
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				


				int counter = 0;
				
				  String[] TagArray =  "p7l8Mxo!Rk".split("");
					String[] TagArray1 = "3xwnvqwzzv".split("");
					String[] TagArray2 = "Upprurohet".split("");
					String[] TagArray3 = "Hlqzwcdici".split("");
					String[] TagArray4 = "kpdmisjdoa".split("");
					String[] TagArray5 = "iycsyhojf5".split("");
					String[] TagArray6 = "9jpsfsfsaw".split("");
					String[] TagArray7 = "sfhwysau0d".split("");
				
				while(counter<=9)
				{
				
			//	 Pattern p = Pattern.compile("\\(.*?\\)");
				Pattern p = Pattern.compile(TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+".*?"+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter]);
			        Matcher m = p.matcher(mod.Questions);
			        
			        
			        
			        while (m.find()){
			        	
			        	String temp = m.group().subSequence(4, m.group().length()-4).toString();
			        	
			       
			           System.out.println(m.group().subSequence(4, m.group().length()-4).toString()); 
			         
			          qstn[counter]=temp;
			          
			        }


			       
			        Matcher m1 = p.matcher(mod.OptionA);
			        
			        
			        
			        while (m1.find()){
			        	
			        	String temp = m1.group().subSequence(4, m1.group().length()-4).toString();

			           System.out.println(m1.group().subSequence(4, m1.group().length()-4).toString()); 
			         
			          optnA[counter]=temp;
			          
			        }
			        

			        Matcher m2 = p.matcher(mod.OptionB);
			        
			        while (m2.find()){
			        	
			        	String temp = m2.group().subSequence(4, m2.group().length()-4).toString();

			           System.out.println(m2.group().subSequence(4, m2.group().length()-4).toString()); 
			         
			          optnB[counter]=temp;
			          
			        }
				
			        Matcher m3 = p.matcher(mod.OptionC);
			        
			        while (m3.find()){
			        	
			        	String temp = m3.group().subSequence(4, m3.group().length()-4).toString();

			           System.out.println(m3.group().subSequence(4, m3.group().length()-4).toString()); 
			         
			          optnC[counter]=temp;
			          
			        }
				
			        Matcher m4 = p.matcher(mod.OptionD);
			        
			        while (m4.find()){
			        	
			        	String temp = m4.group().subSequence(4, m4.group().length()-4).toString();

			           System.out.println(m4.group().subSequence(4, m4.group().length()-4).toString()); 
			         
			          optnD[counter]=temp;
			          
			        }
				
				counter++;
				
			}
				
				Inner inner=new Inner();
				inner.decryptqstn(qstn);
				inner.decryptoptnA(optnA);
				inner.decryptoptnB(optnB);
				inner.decryptoptnC(optnC);
				inner.decryptoptnD(optnD);
				
				
				
				List<Integer> shuffler = new ArrayList<>();
			   
			    
			   
				
				int counter1=0;
				
				while(counter1<=9)
				{
					Question[counter1].setText(qstn[counter1]);
					qa[counter1].setText("A. "+optnA[counter1]);
					qb[counter1].setText("B. "+optnB[counter1]);
					qc[counter1].setText("C. "+optnC[counter1]);
					qd[counter1].setText("D. "+optnD[counter1]);
					
					counter1++;
				}
				
				
				
				
				KeyToCorrection key = null;
				
				  String directory1 = System.getProperty("user.home")+"\\Documents\\Examinations\\"+Location;
			        String filename1 = "KeyToCorrection.txt";
			      
			        File file1 = new File(directory1 + File.separator + filename1);    
				try {
					
					FileInputStream fileIn1 = new FileInputStream(file1);
					
						ObjectInputStream in1 = new ObjectInputStream(fileIn1);
						key =(KeyToCorrection) in1.readObject();
						in1.close();
						fileIn1.close();
					
				}
				
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				AnswersModel ans = null;
				
				  String directory2 = System.getProperty("user.home")+"\\Documents\\Examinations\\"+Location;
			        String filename2 = Firstname+Lastname+".txt";
			      
			        File file2 = new File(directory2 + File.separator + filename2);    
				try {
					
					FileInputStream fileIn2 = new FileInputStream(file2);
					
						ObjectInputStream in2 = new ObjectInputStream(fileIn2);
						ans =(AnswersModel) in2.readObject();
						in2.close();
						fileIn2.close();
					
				}
				
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					FileNotFound FNF = new FileNotFound();
					FNF.setVisible(true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				int counter3 = 0;

				
				
				while(counter3<=9)
				{
				
			//	 Pattern p = Pattern.compile("\\(.*?\\)");
				Pattern p = Pattern.compile(TagArray[counter3]+TagArray1[counter3]+TagArray2[counter3]+TagArray3[counter3]+".*?"+TagArray4[counter3]+TagArray5[counter3]+TagArray6[counter3]+TagArray7[counter3]);
			        Matcher m = p.matcher(ans.Answers);
			        
			        
			        
			        while (m.find()){
			        	
			        	String temp = m.group().subSequence(4, m.group().length()-4).toString();
			        	
			       
			           System.out.println(m.group().subSequence(4, m.group().length()-4).toString()); 
			         
			          UserAnswer[ans.pattern[counter3]]=temp;
			          
			        }
			        
			        counter3++;
				
				}
				
				
				inner.decryptAnswers(UserAnswer);
				int counter4 = 0;
				int score = 0;
				while(counter4<=9)
				{
					c[counter4].setText(key.keytocorrection[counter4]);
					s[counter4].setText(UserAnswer[counter4]);
					
					if(key.keytocorrection[counter4].equals(UserAnswer[counter4]))
					{
						score++;
						
					}
					
					counter4++;
					
				}
				
				scorelbl.setText(score+"/10");
				
				
				Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
				

				PreparedStatement ps = null;
				
				String sql = "Update Examiners set Score=? where Code=?";
					ps = conn.prepareStatement(sql);
					
					
					ps.setInt(1, score);
					ps.setInt(2,Integer.parseInt(Code.getText()));
					ps.executeUpdate();
					
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				QN.setText(mod.QuizNo);
				SC.setText(mod.Section);
				TPC.setText(mod.Topic);
				
				}
			}
		});
		btnCheck.setBounds(787, 11, 91, 23);
		contentPane.add(btnCheck);
		
		JLabel lblExamCode = new JLabel("Exam code:");
		lblExamCode.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblExamCode.setBounds(21, 56, 110, 23);
		contentPane.add(lblExamCode);
		
		Code = new JTextField();
		Code.setBounds(133, 58, 130, 20);
		contentPane.add(Code);
		Code.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ChooseTopic choose = new ChooseTopic();
				choose.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBounds(891, 11, 91, 23);
		contentPane.add(btnBack);
		

		
}
	
	
	class Inner
	{
		String[] temp={"","","","","","","","","",""};
		
	public <E> void decryptqstn(E[] inputArray)
	{
		 Base64.Decoder dec= Base64.getDecoder();
		
		 int counter = 0;
		 
		for (E element: inputArray)
		{
			
			
			try{
	            byte[] strdec=dec.decode(element.toString());
	            String DecodedString = new String(strdec,"UTF-8");
	            
	            qstn[counter] = DecodedString;
	         
	            
		        	}
	            catch(IllegalArgumentException I)
		        	{
	            	continue;
		        	} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(qstn[counter]);
			counter++;
		}
		
		
		
	}
	
	
	public <E> void decryptoptnA(E[] inputArray)
	{
		 Base64.Decoder dec= Base64.getDecoder();
		
		 int counter = 0;
		 
		for (E element: inputArray)
		{
			
			
			try{
	            byte[] strdec=dec.decode(element.toString());
	            String DecodedString = new String(strdec,"UTF-8");
	            
	            optnA[counter] = DecodedString;
	         
	            
		        	}
	            catch(IllegalArgumentException I)
		        	{
	            	continue;
		        	} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(optnA[counter]);
			counter++;
		}
		
		
		
	}
	
	
	
	public <E> void decryptoptnB(E[] inputArray)
	{
		 Base64.Decoder dec= Base64.getDecoder();
		
		 int counter = 0;
		 
		for (E element: inputArray)
		{
			
			
			try{
	            byte[] strdec=dec.decode(element.toString());
	            String DecodedString = new String(strdec,"UTF-8");
	            
	            optnB[counter] = DecodedString;
	         
	            
		        	}
	            catch(IllegalArgumentException I)
		        	{
	            	continue;
		        	} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(optnB[counter]);
			counter++;
		}
		
		
		
	}
	
	
	
	public <E> void decryptoptnC(E[] inputArray)
	{
		 Base64.Decoder dec= Base64.getDecoder();
		
		 int counter = 0;
		 
		for (E element: inputArray)
		{
			
			
			try{
	            byte[] strdec=dec.decode(element.toString());
	            String DecodedString = new String(strdec,"UTF-8");
	            
	            optnC[counter] = DecodedString;
	         
	            
		        	}
	            catch(IllegalArgumentException I)
		        	{
	            	continue;
		        	} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(optnC[counter]);
			counter++;
		}
		
		
		
	}
	
	
	
	public <E> void decryptoptnD(E[] inputArray)
	{
		 Base64.Decoder dec= Base64.getDecoder();
		
		 int counter = 0;
		 
		for (E element: inputArray)
		{
			
			
			try{
	            byte[] strdec=dec.decode(element.toString());
	            String DecodedString = new String(strdec,"UTF-8");
	            
	            optnD[counter] = DecodedString;
	         
	            
		        	}
	            catch(IllegalArgumentException I)
		        	{
	            	continue;
		        	} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(optnD[counter]);
			counter++;
		}
			
	}
	
	public <E> void decryptAnswers(E[] inputArray)
	{
		 Base64.Decoder dec= Base64.getDecoder();
		
		 int counter = 0;
		 
		for (E element: inputArray)
		{
			
			
			try{
	            byte[] strdec=dec.decode(element.toString());
	            String DecodedString = new String(strdec,"UTF-8");
	            
	            UserAnswer[counter] = DecodedString;
	         
	            
		        	}
	            catch(IllegalArgumentException I)
		        	{
	            	continue;
		        	} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(UserAnswer[counter]);
			counter++;
		}
		
		
		
	}

	}
}

