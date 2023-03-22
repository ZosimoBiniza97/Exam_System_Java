package examTaker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class ExamTaker extends JFrame {

	int[] countershuffled;
	private JPanel contentPane;
	private JLabel[] Question;
	private JLabel[] qa;
	private JLabel[] qb;
	private JLabel[] qc;
	private JLabel[] qd;
	
	ModelInfo mod1 = new ModelInfo();
	


	String[] qstn={"","","","","","","","","",""};
	String[] optnA={"","","","","","","","","",""};
	String[] optnB={"","","","","","","","","",""};
	String[] optnC={"","","","","","","","","",""};
	String[] optnD={"","","","","","","","","",""};
	private JRadioButton[] qra;
	private JRadioButton[] qrb;
	private JRadioButton[] qrc;
	private JRadioButton[] qrd;
	
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel QuizNo;


	public String Generated;
	public JLabel fname;
	public JLabel lname;
	private JTextField ExamCode;
	
	
	
	private class encrypt
	{
	
		String Answers;

		
		
	public <E> void EncryptAnswers(E[] inputArray)
	{
		 Base64.Encoder enc= Base64.getEncoder();

			
	        String[] TagArray =  "p7l8Mxo!Rk".split("");
			String[] TagArray1 = "3xwnvqwzzv".split("");
			String[] TagArray2 = "Upprurohet".split("");
			String[] TagArray3 = "Hlqzwcdici".split("");
			String[] TagArray4 = "kpdmisjdoa".split("");
			String[] TagArray5 = "iycsyhojf5".split("");
			String[] TagArray6 = "9jpsfsfsaw".split("");
			String[] TagArray7 = "sfhwysau0d".split("");

			
			int counter = 0;
		     Base64.Encoder enc1= Base64.getEncoder();
			for (E element: inputArray)
			{
				 byte[] strenc;
				 String Encrypted = "";
				 
				 
				 
				 try {
					strenc =enc1.encode(((String) element).getBytes("UTF-8"));
					
					System.out.println("Base64 Encoded String : " + new String(strenc,"UTF-8"));
		            Encrypted = new String(strenc,"UTF-8");
					
					
					
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 
				  int randomNumber = new Random().nextInt((300 - 200)+1);
			        int randomNumber2 = new Random().nextInt((30 - 20 )+1);

			        int multiplier = randomNumber * randomNumber2;
				 
				 String Generate = "A" ;
			        Random r = new Random();

			        String alphabet = "=ABC=DEFGHIJ=KLMN=OPQ=RSTU=VWXYZa=b=cd=efghijklmnopqrstuvwx=yz=0123456789!=@#$%^=&_+[]()<>";
			        for (int i = 0; i < multiplier; i++) {
			            Generate = Generate + Character.toString(alphabet.charAt(r.nextInt(alphabet.length())));
			        }
				 
			        Answers += Generate+TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+Encrypted+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter] ;
			        
			        System.out.println(Encrypted);
			        
			        counter++;
			}
			System.out.println(Answers);
		
	}
	
	}
	
	/**
	 * Create the frame.
	 */
	public ExamTaker(String TopicLocation,String Firstname, String Lastname) {
		setResizable(false);
		
		JLabel Question[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qa[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qb[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qc[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};
		JLabel qd[] = new JLabel[]{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),};

		JRadioButton qra[] = new JRadioButton[]{new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton()};
		JRadioButton qrb[] = new JRadioButton[]{new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton()};
		JRadioButton qrc[] = new JRadioButton[]{new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton()};
		JRadioButton qrd[] = new JRadioButton[]{new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton(),new JRadioButton()};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel no7 = new JPanel();
		no7.setBounds(10, 83, 780, 524);
		contentPane.add(no7);
		no7.setLayout(null);
		
		JLabel no1 = new JLabel("1.");
		no1.setFont(new Font("Tahoma", Font.BOLD, 15));
		no1.setBounds(10, 11, 46, 14);
		no7.add(no1);
		
		Question[0] = new JLabel("New label");
		Question[0].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[0].setBounds(36, 12, 734, 14);
		no7.add(Question[0]);
		
		
		qra[0] = new JRadioButton("");
		qra[0].setBounds(46, 34, 21, 23);
		no7.add(qra[0]);
		
	
		qa[0].setBounds(72, 38, 139, 14);
		no7.add(qa[0]);
		

		qb[0].setBounds(247, 38, 139, 14);
		no7.add(qb[0]);
		
		qrb[0] = new JRadioButton("");
		qrb[0].setBounds(221, 34, 21, 23);
		no7.add(qrb[0]);
		
		
		qc[0].setBounds(422, 38, 139, 14);
		no7.add(qc[0]);
		
		qrc[0] = new JRadioButton("");
		qrc[0].setBounds(396, 34, 21, 23);
		no7.add(qrc[0]);
		
		
		qd[0].setBounds(597, 39, 139, 14);
		no7.add(qd[0]);
		
		qrd[0] = new JRadioButton("");
		qrd[0].setBounds(571, 35, 21, 23);
		no7.add(qrd[0]);

		
		qd[1].setBounds(597, 88, 139, 14);
		no7.add(qd[1]);
		
		qrd[1] = new JRadioButton("");
		qrd[1].setBounds(571, 84, 21, 23);
		no7.add(qrd[1]);
		
	
		qc[1].setBounds(422, 87, 139, 14);
		no7.add(qc[1]);
		
		qrc[1] = new JRadioButton("");
		qrc[1].setBounds(396, 83, 21, 23);
		no7.add(qrc[1]);
		
	
		qb[1].setBounds(247, 87, 139, 14);
		no7.add(qb[1]);
		
		qrb[1] = new JRadioButton("");
		qrb[1].setBounds(221, 83, 21, 23);
		no7.add(qrb[1]);
		
	
		qa[1].setBounds(72, 87, 139, 14);
		no7.add(qa[1]);
		
		qra[1] = new JRadioButton("");
		qra[1].setBounds(46, 83, 21, 23);
		no7.add(qra[1]);
		
		JLabel no2 = new JLabel("2.");
		no2.setFont(new Font("Tahoma", Font.BOLD, 15));
		no2.setBounds(10, 60, 46, 14);
		no7.add(no2);
		
		Question[1] = new JLabel("New label");
		Question[1].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[1].setBounds(36, 61, 734, 14);
		no7.add(Question[1]);
		

		qd[2].setBounds(597, 137, 139, 14);
		no7.add(qd[2]);
		
		qrd[2] = new JRadioButton("");
		qrd[2].setBounds(571, 133, 21, 23);
		no7.add(qrd[2]);
		

		qc[2].setBounds(422, 136, 139, 14);
		no7.add(qc[2]);
		
		qrc[2] = new JRadioButton("");
		qrc[2].setBounds(396, 132, 21, 23);
		no7.add(qrc[2]);
		

		qb[2].setBounds(247, 136, 139, 14);
		no7.add(qb[2]);
		
		qrb[2] = new JRadioButton("");
		qrb[2].setBounds(221, 132, 21, 23);
		no7.add(qrb[2]);
		
		
		qa[2].setBounds(72, 136, 139, 14);
		no7.add(qa[2]);
		
		qra[2] = new JRadioButton("");
		qra[2].setBounds(46, 132, 21, 23);
		no7.add(qra[2]);
		
		JLabel no3 = new JLabel("3.");
		no3.setFont(new Font("Tahoma", Font.BOLD, 15));
		no3.setBounds(10, 109, 46, 14);
		no7.add(no3);
		
		Question[2] = new JLabel("New label");
		Question[2].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[2].setBounds(36, 110, 734, 14);
		no7.add(Question[2]);
		
	
		qd[3].setBounds(597, 186, 139, 14);
		no7.add(qd[3]);
		
		qrd[3] = new JRadioButton("");
		qrd[3].setBounds(571, 182, 21, 23);
		no7.add(qrd[3]);
		

		qc[3].setBounds(422, 185, 139, 14);
		no7.add(qc[3]);
		
		qrc[3] = new JRadioButton("");
		qrc[3].setBounds(396, 181, 21, 23);
		no7.add(qrc[3]);
		

		qb[3].setBounds(247, 185, 139, 14);
		no7.add(qb[3]);
		
		qrb[3] = new JRadioButton("");
		qrb[3].setBounds(221, 181, 21, 23);
		no7.add(qrb[3]);
	
		qa[3].setBounds(72, 185, 139, 14);
		no7.add(qa[3]);
		
		qra[3] = new JRadioButton("");
		qra[3].setBounds(46, 181, 21, 23);
		no7.add(qra[3]);
		
		JLabel no4 = new JLabel("4.");
		no4.setFont(new Font("Tahoma", Font.BOLD, 15));
		no4.setBounds(10, 158, 46, 14);
		no7.add(no4);
		
		Question[3] = new JLabel("New label");
		Question[3].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[3].setBounds(36, 159, 734, 14);
		no7.add(Question[3]);
		
		
		qd[4].setBounds(597, 235, 139, 14);
		no7.add(qd[4]);
		
		qrd[4] = new JRadioButton("");
		qrd[4].setBounds(571, 231, 21, 23);
		no7.add(qrd[4]);
		
	
		qc[4].setBounds(422, 234, 139, 14);
		no7.add(qc[4]);
		
		qrc[4] = new JRadioButton("");
		qrc[4].setBounds(396, 230, 21, 23);
		no7.add(qrc[4]);
		
	
		qb[4].setBounds(247, 234, 139, 14);
		no7.add(qb[4]);
		
		qrb[4] = new JRadioButton("");
		qrb[4].setBounds(221, 230, 21, 23);
		no7.add(qrb[4]);
		
		
		qa[3].setBounds(72, 234, 139, 14);
		no7.add(qa[3]);
		
		qra[4] = new JRadioButton("");
		qra[4].setBounds(46, 230, 21, 23);
		no7.add(qra[4]);
		
		JLabel no5 = new JLabel("5.");
		no5.setFont(new Font("Tahoma", Font.BOLD, 15));
		no5.setBounds(10, 207, 46, 14);
		no7.add(no5);
		
		Question[4] = new JLabel("New label");
		Question[4].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[4].setBounds(36, 208, 734, 14);
		no7.add(Question[4]);
		

		qd[5].setBounds(597, 284, 139, 14);
		no7.add(qd[5]);
		
		qrd[5] = new JRadioButton("");
		qrd[5].setBounds(571, 280, 21, 23);
		no7.add(qrd[5]);
		
		
		qc[5].setBounds(422, 283, 139, 14);
		no7.add(qc[5]);
		
		qrc[5] = new JRadioButton("");
		qrc[5].setBounds(396, 279, 21, 23);
		no7.add(qrc[5]);
		
	
		qb[5].setBounds(247, 283, 139, 14);
		no7.add(qb[5]);
		
		qrb[5] = new JRadioButton("");
		qrb[5].setBounds(221, 279, 21, 23);
		no7.add(qrb[5]);
		
	
		qa[5].setBounds(72, 283, 139, 14);
		no7.add(qa[5]);
		
		qra[5] = new JRadioButton("");
		qra[5].setBounds(46, 279, 21, 23);
		no7.add(qra[5]);
		
		JLabel no6 = new JLabel("6.");
		no6.setFont(new Font("Tahoma", Font.BOLD, 15));
		no6.setBounds(10, 256, 46, 14);
		no7.add(no6);
		
		Question[5] = new JLabel("New label");
		Question[5].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[5].setBounds(36, 257, 734, 14);
		no7.add(Question[5]);
		

		qd[6].setBounds(597, 333, 139, 14);
		no7.add(qd[6]);
		
		qrd[6] = new JRadioButton("");
		qrd[6].setBounds(571, 329, 21, 23);
		no7.add(qrd[6]);
		

		qc[6].setBounds(422, 332, 139, 14);
		no7.add(qc[6]);
		
		qrc[6] = new JRadioButton("");
		qrc[6].setBounds(396, 328, 21, 23);
		no7.add(qrc[6]);
		

		qb[6].setBounds(247, 332, 139, 14);
		no7.add(qb[6]);
		
		qrb[6] = new JRadioButton("");
		qrb[6].setBounds(221, 328, 21, 23);
		no7.add(qrb[6]);
		

		qa[6].setBounds(72, 332, 139, 14);
		no7.add(qa[6]);
		
		qra[6] = new JRadioButton("");
		qra[6].setBounds(46, 328, 21, 23);
		no7.add(qra[6]);
		
		JLabel label_38 = new JLabel("7.");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_38.setBounds(10, 305, 46, 14);
		no7.add(label_38);
		
		Question[6] = new JLabel("New label");
		Question[6].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[6].setBounds(36, 306, 734, 14);
		no7.add(Question[6]);
		
	
		qd[7].setBounds(597, 382, 139, 14);
		no7.add(qd[7]);
		
		qrd[7] = new JRadioButton("");
		qrd[7].setBounds(571, 378, 21, 23);
		no7.add(qrd[7]);
	
		
		qc[7].setBounds(422, 381, 139, 14);
		no7.add(qc[7]);
		
		qrc[7] = new JRadioButton("");
		qrc[7].setBounds(396, 377, 21, 23);
		no7.add(qrc[7]);
		

		qb[7].setBounds(247, 381, 139, 14);
		no7.add(qb[7]);
		
		qrb[7] = new JRadioButton("");
		qrb[7].setBounds(221, 377, 21, 23);
		no7.add(qrb[7]);
		
	
		qa[7].setBounds(72, 381, 139, 14);
		no7.add(qa[7]);
		
		qra[7] = new JRadioButton("");
		qra[7].setBounds(46, 377, 21, 23);
		no7.add(qra[7]);
		
		JLabel no8 = new JLabel("8.");
		no8.setFont(new Font("Tahoma", Font.BOLD, 15));
		no8.setBounds(10, 354, 46, 14);
		no7.add(no8);
		
		Question[7] = new JLabel("New label");
		Question[7].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[7].setBounds(36, 355, 734, 14);
		no7.add(Question[7]);
		
		
		qd[8].setBounds(597, 431, 139, 14);
		no7.add(qd[8]);
		
		qrd[8] = new JRadioButton("");
		qrd[8].setBounds(571, 427, 21, 23);
		no7.add(qrd[8]);
		
		
		qc[8].setBounds(422, 430, 139, 14);
		no7.add(qc[8]);
		
		qrc[8] = new JRadioButton("");
		qrc[8].setBounds(396, 426, 21, 23);
		no7.add(qrc[8]);
		
	
		qb[8].setBounds(247, 430, 139, 14);
		no7.add(qb[8]);
		
		qrb[8] = new JRadioButton("");
		qrb[8].setBounds(221, 426, 21, 23);
		no7.add(qrb[8]);
		
		
		qa[8].setBounds(72, 430, 139, 14);
		no7.add(qa[8]);
		
		qra[8] = new JRadioButton("");
		qra[8].setBounds(46, 426, 21, 23);
		no7.add(qra[8]);
		
		JLabel no9 = new JLabel("9.");
		no9.setFont(new Font("Tahoma", Font.BOLD, 15));
		no9.setBounds(10, 403, 46, 14);
		no7.add(no9);
		
		Question[8] = new JLabel("New label");
		Question[8].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[8].setBounds(36, 404, 734, 14);
		no7.add(Question[8]);
		
		qd[9].setBounds(597, 480, 139, 14);
		no7.add(qd[9]);
		
		qrd[9] = new JRadioButton("");
		qrd[9].setBounds(571, 476, 21, 23);
		no7.add(qrd[9]);
		

		qc[9].setBounds(422, 479, 139, 14);
		no7.add(qc[9]);
		
		qrc[9] = new JRadioButton("");
		qrc[9].setBounds(396, 475, 21, 23);
		no7.add(qrc[9]);
		
	
		qb[9].setBounds(247, 479, 139, 14);
		no7.add(qb[9]);
		
		qrb[9] = new JRadioButton("");
		qrb[9].setBounds(221, 475, 21, 23);
		no7.add(qrb[9]);
		
		qa[9].setBounds(72, 479, 139, 14);
		no7.add(qa[9]);
		
		qra[9] = new JRadioButton("");
		qra[9].setBounds(46, 475, 21, 23);
		no7.add(qra[9]);
		
		JLabel no10 = new JLabel("10.");
		no10.setFont(new Font("Tahoma", Font.BOLD, 15));
		no10.setBounds(0, 452, 46, 14);
		no7.add(no10);
		
		Question[9] = new JLabel("New label");
		Question[9].setFont(new Font("Tahoma", Font.PLAIN, 12));
		Question[9].setBounds(36, 453, 734, 14);
		no7.add(Question[9]);
		
		
		
		ButtonGroup qstn1 = new ButtonGroup();
		qstn1.add(qra[0]);
		qstn1.add(qrb[0]);
		qstn1.add(qrc[0]);
		qstn1.add(qrd[0]);
		ButtonGroup qstn2 = new ButtonGroup();
		qstn2.add(qra[1]);
		qstn2.add(qrb[1]);
		qstn2.add(qrc[1]);
		qstn2.add(qrd[1]);
		ButtonGroup qstn3 = new ButtonGroup();
		qstn3.add(qra[2]);
		qstn3.add(qrb[2]);
		qstn3.add(qrc[2]);
		qstn3.add(qrd[2]);
		ButtonGroup qstn4 = new ButtonGroup();
		qstn4.add(qra[3]);
		qstn4.add(qrb[3]);
		qstn4.add(qrc[3]);
		qstn4.add(qrd[3]);
		ButtonGroup qstn5 = new ButtonGroup();
		qstn5.add(qra[4]);
		qstn5.add(qrb[4]);
		qstn5.add(qrc[4]);
		qstn5.add(qrd[4]);
		ButtonGroup qstn6 = new ButtonGroup();
		qstn6.add(qra[5]);
		qstn6.add(qrb[5]);
		qstn6.add(qrc[5]);
		qstn6.add(qrd[5]);
		ButtonGroup qstn7 = new ButtonGroup();
		qstn7.add(qra[6]);
		qstn7.add(qrb[6]);
		qstn7.add(qrc[6]);
		qstn7.add(qrd[6]);
		ButtonGroup qstn8 = new ButtonGroup();
		qstn8.add(qra[7]);
		qstn8.add(qrb[7]);
		qstn8.add(qrc[7]);
		qstn8.add(qrd[7]);
		ButtonGroup qstn9 = new ButtonGroup();
		qstn9.add(qra[8]);
		qstn9.add(qrb[8]);
		qstn9.add(qrc[8]);
		qstn9.add(qrd[8]);
		ButtonGroup qstn10 = new ButtonGroup();
		qstn10.add(qra[9]);
		qstn10.add(qrb[9]);
		qstn10.add(qrc[9]);
		qstn10.add(qrd[9]);
		
		
		qa[3].setBounds(70, 186, 142, 14);
		no7.add(qa[3]);
		
	
		qa[4].setBounds(73, 235, 142, 14);
		no7.add(qa[4]);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AnswersModel ans = new AnswersModel();
				String[] temp={"","","","","","","","","",""};
				
				 int counter2=0;
					while(counter2<=9)
					{
						if(qra[counter2].isSelected())
						{
							temp[counter2]="A";
						}
						if(qrb[counter2].isSelected())
						{
							temp[counter2]="B";
						}
						if(qrc[counter2].isSelected())
						{
							temp[counter2]="C";
						}
						if(qrd[counter2].isSelected())
						{
							temp[counter2]="D";
						}
						
						counter2++;
					}
					
					encrypt enc= new encrypt();
					enc.EncryptAnswers(temp);
					ans.Answers = enc.Answers;
					
					int counter3=0;
					while(counter3<=9)
					{
						ans.pattern[counter3] = countershuffled[counter3];
						System.out.println(ans.pattern[counter3]);
						counter3++;
						
					}
					
					
					
					  String directory1 = System.getProperty("user.home")+"\\Documents\\Examinations\\"+TopicLocation;
				        String filename1 = Firstname+Lastname+".txt";
				      
				        File file1 = new File(directory1 + File.separator + filename1);
				        
				        try{
				        	 new File(directory1).mkdirs();
				        	 file1.createNewFile();
				        	 file1.getParentFile().mkdirs();
				        	    file1.createNewFile();
				        	    System.out.println("file != null");
				        	
				        FileOutputStream fileOut1 = new FileOutputStream(file1);
				        ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
				        out1.writeObject(ans);
				        out1.close();
				        fileOut1.close();
				        
				        JOptionPane.showMessageDialog(null,"Serialized data is saved at: "+ directory1);

				        }
				        catch(IOException i)
				        {
				        	System.out.println("IOExceotion");
				        }
					
					
					
					
					dispose();
			}
		});
		btnSubmit.setBounds(352, 618, 89, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblQuizNo = new JLabel("Quiz No: ");
		lblQuizNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQuizNo.setBounds(22, 11, 80, 23);
		contentPane.add(lblQuizNo);
		
		QuizNo = new JLabel("");
		QuizNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		QuizNo.setBounds(100, 11, 43, 23);
		contentPane.add(QuizNo);
		
		JLabel lblSection = new JLabel("Section: ");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSection.setBounds(159, 11, 80, 23);
		contentPane.add(lblSection);
		
		JLabel Section = new JLabel("");
		Section.setFont(new Font("Tahoma", Font.BOLD, 17));
		Section.setBounds(240, 11, 121, 23);
		contentPane.add(Section);
		
		JLabel Topiclbl = new JLabel("Topic: ");
		Topiclbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		Topiclbl.setBounds(371, 11, 57, 23);
		contentPane.add(Topiclbl);
		
		JLabel Topic = new JLabel("");
		Topic.setFont(new Font("Tahoma", Font.BOLD, 17));
		Topic.setBounds(438, 11, 317, 23);
		contentPane.add(Topic);
		
	
		
		Model mod = null;
		
		  String directory = System.getProperty("user.home")+"\\Documents\\Examinations\\"+TopicLocation;
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
		
	int counter1=0;
		
		while(counter1<=9)
		{
			Question[counter1].setText(qstn[counter1]);
			qa[counter1].setText(optnA[counter1]);
			qb[counter1].setText(optnB[counter1]);
			qc[counter1].setText(optnC[counter1]);
			qd[counter1].setText(optnD[counter1]);
			
			counter1++;
		}
		
		
		QuizNo.setText(mod.QuizNo);
		Section.setText(mod.Section);
		Topic.setText(mod.Topic);
		
		JLabel lblFirstname = new JLabel("Firstname: ");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstname.setBounds(22, 49, 89, 23);
		contentPane.add(lblFirstname);
		
		fname = new JLabel("");
		fname.setFont(new Font("Tahoma", Font.BOLD, 15));
		fname.setBounds(109, 49, 146, 23);
		contentPane.add(fname);
		
		lname = new JLabel("");
		lname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lname.setBounds(352, 49, 153, 23);
		contentPane.add(lname);
		
		JLabel lblLastname = new JLabel("Lastname: ");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastname.setBounds(265, 49, 89, 23);
		contentPane.add(lblLastname);
		
		JLabel ExamCodelbl = new JLabel("Exam Code: ");
		ExamCodelbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		ExamCodelbl.setBounds(512, 49, 107, 23);
		contentPane.add(ExamCodelbl);
		
		fname.setText(Firstname);
		lname.setText(Lastname);
		
		ExamCode = new JTextField();
		ExamCode.setBounds(606, 50, 89, 20);
		contentPane.add(ExamCode);
		ExamCode.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Trigger=0;
				
				String FirstName = null;
				String LastName = null;
				
				java.sql.Connection conn;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
					java.sql.Statement stmt = conn.createStatement();
					
					 ResultSet rs = stmt.executeQuery("select * from Examiners where Code = "+ExamCode.getText());
					  while(rs.next())
					  {
						  FirstName = rs.getString("Firstname");
						 LastName = rs.getString("Lastname");
					  }
					 
					 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(fname.getText().equals(FirstName)||lname.getText().equals(LastName))
		
				{
				Inner inner=new Inner();
				inner.decryptqstn(qstn);
				inner.decryptoptnA(optnA);
				inner.decryptoptnB(optnB);
				inner.decryptoptnC(optnC);
				inner.decryptoptnD(optnD);
				
				
				
				List<Integer> shuffler = new ArrayList<>();
			    for (int i = 0; i <= 9 ; i++) {
			        shuffler.add(i);
			    }
			    Collections.shuffle(shuffler);
				
				
			    countershuffled = new int[shuffler.size()];
			    int x=0;
			    for(Integer n: shuffler)
			    {
			    	countershuffled[x]=n;
			    	x++;
			    }
			    
			   
				
				int counter1=0;
				
				while(counter1<=9)
				{
					Question[counter1].setText(qstn[countershuffled[counter1]]);
					qa[counter1].setText(optnA[countershuffled[counter1]]);
					qb[counter1].setText(optnB[countershuffled[counter1]]);
					qc[counter1].setText(optnC[countershuffled[counter1]]);
					qd[counter1].setText(optnD[countershuffled[counter1]]);
					
					counter1++;
				}
				
				btnConfirm.setEnabled(false);
				
				}
				
				
				else
				{
					Mismatch mm = new Mismatch();
					mm.setVisible(true);
					Trigger=0;
				}
				
				
			}
		});
		btnConfirm.setBounds(706, 49, 83, 23);
		contentPane.add(btnConfirm);
//		ModelInfo model = new ModelInfo();
//		fname.setText(model.getFirstname());
//		lname.setText(model.getLastname());
//		examcode.setText(model.getGenerated());

		
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
	
	
	
	}
}
