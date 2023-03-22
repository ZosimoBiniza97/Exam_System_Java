package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ExamCreator extends JFrame {

	
	
	String[] qstn={"","","","","","","","","",""};
	String[] optnA={"","","","","","","","","",""};
	String[] optnB={"","","","","","","","","",""};
	String[] optnC={"","","","","","","","","",""};
	String[] optnD={"","","","","","","","","",""};
	
	private JPanel contentPane;
	private JTextField[] Question;
	private JTextField[] qa;
	private JTextField[] qb;
	private JTextField[] qc;
	private JTextField[] qd;
	private JRadioButton[] qra;
	private JRadioButton[] qrb;
	private JRadioButton[] qrc;
	private JRadioButton[] qrd;
	
	private JLabel label_6;

	private JLabel label_7;

	private JLabel label_8;
	private JLabel label_9;

	
	
	private JTextField topic;
	private JTextField qn;
	private JTextField sec;
	int Trigger=0;
	private class encrypt
	{
	
		String Questions;
		String OptionA;
		String OptionB;
		String OptionC;
		String OptionD;
		
		
	public <E> void EncryptQuestions(E[] inputArray)
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
				 
			        Questions += Generate+TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+Encrypted+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter] ;
			        
			        //System.out.println(Encrypted);
			        
			        counter++;
			}
			//System.out.println(Questions);
		
	}
	
	
	
	public <E> void EncryptOptionA(E[] inputArray)
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
				 
			        OptionA += Generate+TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+Encrypted+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter] ;
			        
			        //System.out.println(Encrypted);
			        
			        counter++;
			}
			//System.out.println(Questions);

	}
	
	
	public <E> void EncryptOptionB(E[] inputArray)
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
				 
			        OptionB += Generate+TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+Encrypted+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter] ;
			        
			        //System.out.println(Encrypted);
			        
			        counter++;
			}
			//System.out.println(Questions);
			
	}
	
	
	
	public <E> void EncryptOptionC(E[] inputArray)
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
				 
			        OptionC += Generate+TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+Encrypted+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter] ;
			        
			        //System.out.println(Encrypted);
			        
			        counter++;
			}
			//System.out.println(Questions);
	
	}
	
	
	
	
	public <E> void EncryptOptionD(E[] inputArray)
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
				 
			        OptionD += Generate+TagArray[counter]+TagArray1[counter]+TagArray2[counter]+TagArray3[counter]+Encrypted+TagArray4[counter]+TagArray5[counter]+TagArray6[counter]+TagArray7[counter] ;
			        
			        //System.out.println(Encrypted);
			        
			        counter++;
			}
			//System.out.println(Questions);
		
	}
	
	
	
	}
	
	
	/**
	 * Create the frame.
	 */
	public ExamCreator() {
		setResizable(false);
		
		JTextField[] Question = new JTextField[]
				{
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField()
				};
		JTextField[] qa = new JTextField[]
				{
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField()
				};
		JTextField[] qb = new JTextField[]
				{
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField()
				};
		JTextField[] qc = new JTextField[]
				{
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField()
				};
		JTextField[] qd = new JTextField[]
				{
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField(),
						new JTextField()
				};
		JRadioButton[] qra = new JRadioButton[]
				{
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton()
				
				};
		JRadioButton[] qrb = new JRadioButton[]
				{
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton()
				
				};
		JRadioButton[] qrc = new JRadioButton[]
				{
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton()
				
				};
		JRadioButton[] qrd = new JRadioButton[]
				{
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton(),
						new JRadioButton()
				
				};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 95, 780, 559);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("1. ");
		label.setBounds(10, 11, 46, 14);
		panel.add(label);
		
	
		Question[0].setBounds(32, 8, 738, 20);
		panel.add(Question[0]);
		Question[0].setColumns(10);
		
		qra[0] = new JRadioButton("");
		qra[0].setBounds(90, 35, 21, 23);
		panel.add(qra[0]);
		
		qa[0] = new JTextField();
		qa[0].setBounds(117, 35, 123, 20);
		panel.add(qa[0]);
		qa[0].setColumns(10);
		
		qb[0] = new JTextField();
		qb[0].setColumns(10);
		qb[0].setBounds(277, 35, 123, 20);
		panel.add(qb[0]);
		
		qrb[0] = new JRadioButton("");
		qrb[0].setBounds(250, 35, 21, 23);
		panel.add(qrb[0]);
		
		qc[0] = new JTextField();
		qc[0].setColumns(10);
		qc[0].setBounds(437, 35, 123, 20);
		panel.add(qc[0]);
		
		qrc[0] = new JRadioButton("");
		qrc[0].setBounds(410, 35, 21, 23);
		panel.add(qrc[0]);
		
		qd[0] = new JTextField();
		qd[0].setColumns(10);
		qd[0].setBounds(597, 35, 123, 20);
		panel.add(qd[0]);
		
		qrd[0] = new JRadioButton("");
		qrd[0].setBounds(570, 35, 21, 23);
		panel.add(qrd[0]);
		
		qd[1] = new JTextField();
		qd[1].setColumns(10);
		qd[1].setBounds(597, 88, 123, 20);
		panel.add(qd[1]);
		
		qrd[1] = new JRadioButton("");
		qrd[1].setBounds(570, 88, 21, 23);
		panel.add(qrd[1]);
		
		qc[1] = new JTextField();
		qc[1].setColumns(10);
		qc[1].setBounds(437, 88, 123, 20);
		panel.add(qc[1]);
		
		qrc[1] = new JRadioButton("");
		qrc[1].setBounds(410, 88, 21, 23);
		panel.add(qrc[1]);
		
		qb[1] = new JTextField();
		qb[1].setColumns(10);
		qb[1].setBounds(277, 88, 123, 20);
		panel.add(qb[1]);
		
		qrb[1] = new JRadioButton("");
		qrb[1].setBounds(250, 88, 21, 23);
		panel.add(qrb[1]);
		
		qa[1] = new JTextField();
		qa[1].setColumns(10);
		qa[1].setBounds(117, 88, 123, 20);
		panel.add(qa[1]);
		
		qra[1] = new JRadioButton("");
		qra[1].setBounds(90, 88, 21, 23);
		panel.add(qra[1]);
		
		Question[1] = new JTextField();
		Question[1].setColumns(10);
		Question[1].setBounds(32, 61, 738, 20);
		panel.add(Question[1]);
		
		JLabel label_1 = new JLabel("2. ");
		label_1.setBounds(10, 64, 46, 14);
		panel.add(label_1);
		
		qd[2] = new JTextField();
		qd[2].setColumns(10);
		qd[2].setBounds(597, 142, 123, 20);
		panel.add(qd[2]);
		
		qrd[2] = new JRadioButton("");
		qrd[2].setBounds(570, 142, 21, 23);
		panel.add(qrd[2]);
		
		qc[2] = new JTextField();
		qc[2].setColumns(10);
		qc[2].setBounds(437, 142, 123, 20);
		panel.add(qc[2]);
		
		qrc[2] = new JRadioButton("");
		qrc[2].setBounds(410, 142, 21, 23);
		panel.add(qrc[2]);
		
		qb[2] = new JTextField();
		qb[2].setColumns(10);
		qb[2].setBounds(277, 142, 123, 20);
		panel.add(qb[2]);
		
		qrb[2] = new JRadioButton("");
		qrb[2].setBounds(250, 142, 21, 23);
		panel.add(qrb[2]);
		
		qa[2] = new JTextField();
		qa[2].setColumns(10);
		qa[2].setBounds(117, 142, 123, 20);
		panel.add(qa[2]);
		
		qra[2] = new JRadioButton("");
		qra[2].setBounds(90, 142, 21, 23);
		panel.add(qra[2]);
		
		Question[2] = new JTextField();
		Question[2].setColumns(10);
		Question[2].setBounds(32, 115, 738, 20);
		panel.add(Question[2]);
		
		JLabel label_2 = new JLabel("3. ");
		label_2.setBounds(10, 118, 46, 14);
		panel.add(label_2);
		
		qd[3] = new JTextField();
		qd[3].setColumns(10);
		qd[3].setBounds(597, 196, 123, 20);
		panel.add(qd[3]);
		
		qrd[3] = new JRadioButton("");
		qrd[3].setBounds(570, 196, 21, 23);
		panel.add(qrd[3]);
		
		qc[3] = new JTextField();
		qc[3].setColumns(10);
		qc[3].setBounds(437, 196, 123, 20);
		panel.add(qc[3]);
		
		qrc[3] = new JRadioButton("");
		qrc[3].setBounds(410, 196, 21, 23);
		panel.add(qrc[3]);
		
		qb[3] = new JTextField();
		qb[3].setColumns(10);
		qb[3].setBounds(277, 196, 123, 20);
		panel.add(qb[3]);
		
		qrb[3] = new JRadioButton("");
		qrb[3].setBounds(250, 196, 21, 23);
		panel.add(qrb[3]);
		
		qa[3] = new JTextField();
		qa[3].setColumns(10);
		qa[3].setBounds(117, 196, 123, 20);
		panel.add(qa[3]);
		
		qra[3] = new JRadioButton("");
		qra[3].setBounds(90, 196, 21, 23);
		panel.add(qra[3]);
		
		Question[3] = new JTextField();
		Question[3].setColumns(10);
		Question[3].setBounds(32, 169, 738, 20);
		panel.add(Question[3]);
		
		JLabel label_3 = new JLabel("4. ");
		label_3.setBounds(10, 172, 46, 14);
		panel.add(label_3);
		
		qd[4] = new JTextField();
		qd[4].setColumns(10);
		qd[4].setBounds(597, 250, 123, 20);
		panel.add(qd[4]);
		
		qrd[4] = new JRadioButton("");
		qrd[4].setBounds(570, 250, 21, 23);
		panel.add(qrd[4]);
		
		qc[4] = new JTextField();
		qc[4].setColumns(10);
		qc[4].setBounds(437, 250, 123, 20);
		panel.add(qc[4]);
		
		qrc[4] = new JRadioButton("");
		qrc[4].setBounds(410, 250, 21, 23);
		panel.add(qrc[4]);
		
		qb[4] = new JTextField();
		qb[4].setColumns(10);
		qb[4].setBounds(277, 250, 123, 20);
		panel.add(qb[4]);
		
		qrb[4] = new JRadioButton("");
		qrb[4].setBounds(250, 250, 21, 23);
		panel.add(qrb[4]);
		
		qa[4] = new JTextField();
		qa[4].setColumns(10);
		qa[4].setBounds(117, 250, 123, 20);
		panel.add(qa[4]);
		
		qra[4] = new JRadioButton("");
		qra[4].setBounds(90, 250, 21, 23);
		panel.add(qra[4]);
		
		Question[4] = new JTextField();
		Question[4].setColumns(10);
		Question[4].setBounds(32, 223, 738, 20);
		panel.add(Question[4]);
		
		JLabel label_4 = new JLabel("5. ");
		label_4.setBounds(10, 226, 46, 14);
		panel.add(label_4);
		
		qd[5] = new JTextField();
		qd[5].setColumns(10);
		qd[5].setBounds(597, 304, 123, 20);
		panel.add(qd[5]);
		
		qrd[5] = new JRadioButton("");
		qrd[5].setBounds(570, 304, 21, 23);
		panel.add(qrd[5]);
		
		qc[5] = new JTextField();
		qc[5].setColumns(10);
		qc[5].setBounds(437, 304, 123, 20);
		panel.add(qc[5]);
		
		qrc[5] = new JRadioButton("");
		qrc[5].setBounds(410, 304, 21, 23);
		panel.add(qrc[5]);
		
		qb[5] = new JTextField();
		qb[5].setColumns(10);
		qb[5].setBounds(277, 304, 123, 20);
		panel.add(qb[5]);
		
		qrb[5] = new JRadioButton("");
		qrb[5].setBounds(250, 304, 21, 23);
		panel.add(qrb[5]);
		
		qa[5] = new JTextField();
		qa[5].setColumns(10);
		qa[5].setBounds(117, 304, 123, 20);
		panel.add(qa[5]);
		
		qra[5] = new JRadioButton("");
		qra[5].setBounds(90, 304, 21, 23);
		panel.add(qra[5]);
		
		Question[5] = new JTextField();
		Question[5].setColumns(10);
		Question[5].setBounds(32, 277, 738, 20);
		panel.add(Question[5]);
		
		JLabel label_5 = new JLabel("6. ");
		label_5.setBounds(10, 280, 46, 14);
		panel.add(label_5);
		
		qd[6] = new JTextField();
		qd[6].setColumns(10);
		qd[6].setBounds(597, 358, 123, 20);
		panel.add(qd[6]);
		
		qrd[6] = new JRadioButton("");
		qrd[6].setBounds(570, 358, 21, 23);
		panel.add(qrd[6]);
		
		qc[6] = new JTextField();
		qc[6].setColumns(10);
		qc[6].setBounds(437, 358, 123, 20);
		panel.add(qc[6]);
		
		qrc[6] = new JRadioButton("");
		qrc[6].setBounds(410, 358, 21, 23);
		panel.add(qrc[6]);
		
		qb[6] = new JTextField();
		qb[6].setColumns(10);
		qb[6].setBounds(277, 358, 123, 20);
		panel.add(qb[6]);
		
		qrb[6] = new JRadioButton("");
		qrb[6].setBounds(250, 358, 21, 23);
		panel.add(qrb[6]);
		
		qa[6] = new JTextField();
		qa[6].setColumns(10);
		qa[6].setBounds(117, 358, 123, 20);
		panel.add(qa[6]);
		
		qra[6] = new JRadioButton("");
		qra[6].setBounds(90, 358, 21, 23);
		panel.add(qra[6]);
		
		Question[6] = new JTextField();
		Question[6].setColumns(10);
		Question[6].setBounds(32, 331, 738, 20);
		panel.add(Question[6]);
		
		label_6 = new JLabel("7. ");
		label_6.setBounds(10, 334, 46, 14);
		panel.add(label_6);
		
		qd[7] = new JTextField();
		qd[7].setColumns(10);
		qd[7].setBounds(597, 412, 123, 20);
		panel.add(qd[7]);
		
		qrd[7] = new JRadioButton("");
		qrd[7].setBounds(570, 412, 21, 23);
		panel.add(qrd[7]);
		
		qc[7] = new JTextField();
		qc[7].setColumns(10);
		qc[7].setBounds(437, 412, 123, 20);
		panel.add(qc[7]);
		
		qrc[7] = new JRadioButton("");
		qrc[7].setBounds(410, 412, 21, 23);
		panel.add(qrc[7]);
		
		qb[7] = new JTextField();
		qb[7].setColumns(10);
		qb[7].setBounds(277, 412, 123, 20);
		panel.add(qb[7]);
		
		qrb[7] = new JRadioButton("");
		qrb[7].setBounds(250, 412, 21, 23);
		panel.add(qrb[7]);
		
		qa[7] = new JTextField();
		qa[7].setColumns(10);
		qa[7].setBounds(117, 412, 123, 20);
		panel.add(qa[7]);
		
		qra[7] = new JRadioButton("");
		qra[7].setBounds(90, 412, 21, 23);
		panel.add(qra[7]);
		
		Question[7] = new JTextField();
		Question[7].setColumns(10);
		Question[7].setBounds(32, 385, 738, 20);
		panel.add(Question[7]);
		
		label_7 = new JLabel("8. ");
		label_7.setBounds(10, 388, 46, 14);
		panel.add(label_7);
		
		qd[8] = new JTextField();
		qd[8].setColumns(10);
		qd[8].setBounds(597, 466, 123, 20);
		panel.add(qd[8]);
		
		qrd[8] = new JRadioButton("");
		qrd[8].setBounds(570, 466, 21, 23);
		panel.add(qrd[8]);
		
		qc[8] = new JTextField();
		qc[8].setColumns(10);
		qc[8].setBounds(437, 466, 123, 20);
		panel.add(qc[8]);
		
		qrc[8] = new JRadioButton("");
		qrc[8].setBounds(410, 466, 21, 23);
		panel.add(qrc[8]);
		
		qb[8] = new JTextField();
		qb[8].setColumns(10);
		qb[8].setBounds(277, 466, 123, 20);
		panel.add(qb[8]);
		
		qrb[8] = new JRadioButton("");
		qrb[8].setBounds(250, 466, 21, 23);
		panel.add(qrb[8]);
		
		qa[8] = new JTextField();
		qa[8].setColumns(10);
		qa[8].setBounds(117, 466, 123, 20);
		panel.add(qa[8]);
		
		qra[8] = new JRadioButton("");
		qra[8].setBounds(90, 466, 21, 23);
		panel.add(qra[8]);
		
		Question[8] = new JTextField();
		Question[8].setColumns(10);
		Question[8].setBounds(32, 439, 738, 20);
		panel.add(Question[8]);
		
		label_8 = new JLabel("9. ");
		label_8.setBounds(10, 442, 46, 14);
		panel.add(label_8);
		
		qd[9] = new JTextField();
		qd[9].setColumns(10);
		qd[9].setBounds(597, 520, 123, 20);
		panel.add(qd[9]);
		
		qrd[9] = new JRadioButton("");
		qrd[9].setBounds(570, 520, 21, 23);
		panel.add(qrd[9]);
		
		qc[9] = new JTextField();
		qc[9].setColumns(10);
		qc[9].setBounds(437, 520, 123, 20);
		panel.add(qc[9]);
		
		qrc[9] = new JRadioButton("");
		qrc[9].setBounds(410, 520, 21, 23);
		panel.add(qrc[9]);
		
		qb[9] = new JTextField();
		qb[9].setColumns(10);
		qb[9].setBounds(277, 520, 123, 20);
		panel.add(qb[9]);
		
		qrb[9] = new JRadioButton("");
		qrb[9].setBounds(250, 520, 21, 23);
		panel.add(qrb[9]);
		
		qa[9] = new JTextField();
		qa[9].setColumns(10);
		qa[9].setBounds(117, 520, 123, 20);
		panel.add(qa[9]);
		
		qra[9] = new JRadioButton("");
		qra[9].setBounds(90, 520, 21, 23);
		panel.add(qra[9]);
		
		Question[9] = new JTextField();
		Question[9].setColumns(10);
		Question[9].setBounds(32, 493, 738, 20);
		panel.add(Question[9]);
		
		label_9 = new JLabel("10. ");
		label_9.setBounds(10, 496, 46, 14);
		panel.add(label_9);
		
		
		 ButtonGroup q1 = new ButtonGroup();
		q1.add(qra[0]);
		q1.add(qrb[0]);
		q1.add(qrc[0]);
		q1.add(qrd[0]);
		 ButtonGroup q2 = new ButtonGroup();
		q2.add(qra[1]);
		q2.add(qrb[1]);
		q2.add(qrc[1]);
		q2.add(qrd[1]);
		 ButtonGroup q3 = new ButtonGroup();
		q3.add(qra[2]);
		q3.add(qrb[2]);
		q3.add(qrc[2]);
		q3.add(qrd[2]);
		 ButtonGroup q4 = new ButtonGroup();
		q4.add(qra[3]);
		q4.add(qrb[3]);
		q4.add(qrc[3]);
		q4.add(qrd[3]);
		 ButtonGroup q5 = new ButtonGroup();
		q5.add(qra[4]);
		q5.add(qrb[4]);
		q5.add(qrc[4]);
		q5.add(qrd[4]);
		 ButtonGroup q6 = new ButtonGroup();
		q6.add(qra[5]);
		q6.add(qrb[5]);
		q6.add(qrc[5]);
		q6.add(qrd[5]);
		 ButtonGroup q7 = new ButtonGroup();
		q7.add(qra[6]);
		q7.add(qrb[6]);
		q7.add(qrc[6]);
		q7.add(qrd[6]);
		ButtonGroup q8 = new ButtonGroup();
		q8.add(qra[7]);
		q8.add(qrb[7]);
		q8.add(qrc[7]);
		q8.add(qrd[7]);
		ButtonGroup q9 = new ButtonGroup();
		q9.add(qra[8]);
		q9.add(qrb[8]);
		q9.add(qrc[8]);
		q9.add(qrd[8]);
		ButtonGroup q10 = new ButtonGroup();
		q10.add(qra[9]);
		q10.add(qrb[9]);
		q10.add(qrc[9]);
		q10.add(qrd[9]);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				java.sql.Connection conn1;
				try {
					conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
					
					java.sql.Statement stmt = conn1.createStatement();
					
					 ResultSet rs = stmt.executeQuery("select * from Examinations where Topic = "+"'"+topic.getText()+"'");
					 
					 while(rs.next())
					 {
						 if(topic.getText().equals(rs.getString("Topic")))
								 {
							 
							 Trigger=1;
							 
								 }
						 
					 }
						 
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
	
				if(Trigger==0)
				{
				
			if((qn.getText().length()==0)&&(sec.getText().length()==0)&&(topic.getText().length()==0) )
			{
				Error error = new Error();
				error.setVisible(true);
				
			}
			
			else{
				
				for(int a=0;a<=9;a++)
				{
					
					qstn[a]= Question[a].getText();
					optnA[a]= qa[a].getText();
					optnB[a]= qb[a].getText();
					optnC[a]= qc[a].getText();
					optnD[a]= qd[a].getText();
					
				}
				
				encrypt enc = new encrypt();
				enc.EncryptQuestions(qstn);
				enc.EncryptOptionA(optnA);
				enc.EncryptOptionB(optnB);
				enc.EncryptOptionC(optnC);
				enc.EncryptOptionD(optnD);
				
				KeyToCorrection key = new KeyToCorrection();
				
				int counter=0;
				while(counter<=9)
				{
					if(qra[counter].isSelected())
					{
						key.keytocorrection[counter]="A";
					}
					if(qrb[counter].isSelected())
					{
						key.keytocorrection[counter]="B";
					}
					if(qrc[counter].isSelected())
					{
						key.keytocorrection[counter]="C";
					}
					if(qrd[counter].isSelected())
					{
						key.keytocorrection[counter]="D";
					}
					
					System.out.println(key.keytocorrection[counter]);
					counter++;
					
					
			
				}
				
				
				  String directory1 = System.getProperty("user.home")+"\\Documents\\Examinations\\"+topic.getText();
				  
			        String filename1 = "KeyToCorrection.txt";
			      
			        File file1 = new File(directory1 + File.separator + filename1);
			        
			        try{
			        	 new File(directory1).mkdirs();
			        	 file1.createNewFile();
			        	 file1.getParentFile().mkdirs();
			        	    file1.createNewFile();
			        	    System.out.println("file != null");
			        	
			        FileOutputStream fileOut1 = new FileOutputStream(file1);
			        ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
			        out1.writeObject(key);
			        out1.close();
			        fileOut1.close();
			        
			        JOptionPane.showMessageDialog(null,"Serialized data is saved at: "+ directory1);

			        }
			        catch(IOException i)
			        {
			        	System.out.println("IOExceotion");
			        }
				
				
				
				
				
				Model mod = new Model();
				mod.Questions=enc.Questions;
				mod.OptionA=enc.OptionA;
				mod.OptionB=enc.OptionB;
				mod.OptionC=enc.OptionC;
				mod.OptionD=enc.OptionD;
				mod.QuizNo=qn.getText();
				mod.Section=sec.getText();
				mod.Topic=topic.getText();
			        
				  String directory = System.getProperty("user.home")+"\\Documents\\Examinations\\"+topic.getText();
			        String filename = "Encrypted.txt";
			      
			        File file = new File(directory + File.separator + filename);
			        
			        try{
			        	 new File(directory).mkdirs();
			        	 file.createNewFile();
			        	 file.getParentFile().mkdirs();
			        	    file.createNewFile();
			        	    System.out.println("file != null");
			        	
			        FileOutputStream fileOut = new FileOutputStream(file);
			        ObjectOutputStream out = new ObjectOutputStream(fileOut);
			        out.writeObject(mod);
			        out.close();
			        fileOut.close();
			        
			        JOptionPane.showMessageDialog(null,"Serialized data is saved at: "+ directory);

			        }
			        catch(IOException i)
			        {
			        	System.out.println("IOExceotion");
			        }
				
				
			        java.sql.Connection conn;
					try {
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
						PreparedStatement ps = null;
						
						String sql = "Insert into Examinations(Topic,quizNo) values(?,?)";
						
						ps = conn.prepareStatement(sql);
						
						ps.setString(1, topic.getText());	
						ps.setInt(2, Integer.parseInt(qn.getText()));
						
						ps.executeUpdate();
						
						
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
				
					}
					
			        
			}
			}
				
				else{
					
					AlreadyExists ae = new AlreadyExists();
					ae.setVisible(true);
					Trigger=0;
				}
				
			}
		});
		btnSave.setBounds(311, 665, 91, 23);
		contentPane.add(btnSave);
		
		topic = new JTextField();
		topic.setBounds(425, 33, 348, 20);
		contentPane.add(topic);
		topic.setColumns(10);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTopic.setBounds(360, 25, 77, 35);
		contentPane.add(lblTopic);
		
		qn = new JTextField();
		qn.setColumns(10);
		qn.setBounds(118, 33, 49, 20);
		contentPane.add(qn);
		
		JLabel lblQuizNo = new JLabel("Quiz No.");
		lblQuizNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuizNo.setBounds(21, 25, 146, 35);
		contentPane.add(lblQuizNo);
		
		sec = new JTextField();
		sec.setColumns(10);
		sec.setBounds(271, 33, 79, 20);
		contentPane.add(sec);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSection.setBounds(187, 25, 146, 35);
		contentPane.add(lblSection);
		
		Question[0].setText("Who was the first man to fly around the earth with a spaceship?");
		Question[1].setText("On which hemisphere were the most dinosaur skeletons found?");
		Question[2].setText("What color is cobalt?");
		Question[3].setText("Who invented vulcanized rubber?");
		Question[4].setText("What is the organ that is affected when one is suffering from hepatitis?");
		Question[5].setText("Which device do we use to look at the stars?");
		Question[6].setText("Which unit indicates the light intensity?");
		Question[7].setText("Who is the father of the atomic bomb?");
		Question[8].setText("Who invented the barometer?");
		Question[9].setText("Who was the first American in space?");
		
		qa[0].setText("Batman");
		qa[1].setText("east hemispere");
		qa[2].setText("Blue");
		qa[3].setText("FOCAL");
		qa[4].setText("Heart");
		qa[5].setText("Telescope");
		qa[6].setText("Gasera");
		qa[7].setText("Kiko");
		qa[8].setText("Baron");
		qa[9].setText("Alan Shepard");
		
		qb[0].setText("Gagarin");
		qb[1].setText("West hemishere");
		qb[2].setText("Red");
		qb[3].setText("BBS");
		qb[4].setText("Brain");
		qb[5].setText("Microscope");
		qb[6].setText("Candle");
		qb[7].setText("Corpuz");
		qb[8].setText("Torricelli");
		qb[9].setText("Brother Russel");
		
		qc[0].setText("JunJun");
		qc[1].setText("North hemisphere");
		qc[2].setText("Green");
		qc[3].setText("Badyear");
		qc[4].setText("Liver");
		qc[5].setText("kaleidoscope");
		qc[6].setText("Kandila");
		qc[7].setText("Mang Kanor");
		qc[8].setText("Barroca");
		qc[9].setText("Andrew Allen");
		
		qd[0].setText("janjan");
		qd[1].setText("South hemisphere");
		qd[2].setText("Black");
		qd[3].setText("Goodyear");
		qd[4].setText("Stomach");
		qd[5].setText("phenakistoscope");
		qd[6].setText("Candela");
		qd[7].setText("Robert Oppenheimer");
		qd[8].setText("Tortillos");
		qd[9].setText("Humberto Campins");
		
		qn.setText("14");
		sec.setText("IT21FB2");
		topic.setText("General Knowledge Quiz");
		
		JButton btnMenu = new JButton("Close");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				dispose();
				
			}
		});
		btnMenu.setBounds(412, 665, 91, 23);
		contentPane.add(btnMenu);
		
	}
}
