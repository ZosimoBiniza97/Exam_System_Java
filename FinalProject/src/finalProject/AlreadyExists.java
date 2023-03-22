package finalProject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlreadyExists extends JDialog {

	private final JPanel contentPanel = new JPanel();


	/**
	 * Create the dialog.
	 */
	public AlreadyExists() {
		setModal(true);
		setBounds(100, 100, 438, 137);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("OK");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				}
			});
			okButton.setBounds(188, 72, 49, 23);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JLabel lblExamWithThe = new JLabel("Exam with the same topic already exists");
			lblExamWithThe.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblExamWithThe.setForeground(new Color(0, 0, 0));
			lblExamWithThe.setBounds(59, 38, 353, 23);
			contentPanel.add(lblExamWithThe);
		}
		{
			JLabel lblError = new JLabel("Error");
			lblError.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblError.setBounds(188, 11, 119, 25);
			contentPanel.add(lblError);
		}
	}

}
