package checker;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileNotFound extends JDialog {

	private final JPanel contentPanel = new JPanel();


	/**
	 * Create the dialog.
	 */
	public FileNotFound() {
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 450, 212);
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
			okButton.setBounds(189, 143, 69, 23);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JLabel lblErrorFileNot = new JLabel("Error: File not found");
			lblErrorFileNot.setFont(new Font("Tahoma", Font.BOLD, 22));
			lblErrorFileNot.setBounds(107, 0, 239, 66);
			contentPanel.add(lblErrorFileNot);
		}
		{
			JLabel lblPleaseEnsureThat = new JLabel("Please ensure that you have selected the approppriate Quiz Topic");
			lblPleaseEnsureThat.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPleaseEnsureThat.setBounds(35, 48, 382, 43);
			contentPanel.add(lblPleaseEnsureThat);
		}
		{
			JLabel lblItIsAlso = new JLabel("Please choose again the Quiz Topic");
			lblItIsAlso.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblItIsAlso.setBounds(120, 102, 324, 30);
			contentPanel.add(lblItIsAlso);
		}
		{
			JLabel lblOrYouMay = new JLabel("The profile exists but the examination is in another topic");
			lblOrYouMay.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblOrYouMay.setBounds(66, 77, 324, 30);
			contentPanel.add(lblOrYouMay);
		}
	}

}
