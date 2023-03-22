package finalProject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restricted extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public Restricted() {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 434, 173);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblInvalidUsernameOr = new JLabel("Invalid Username or Password");
			lblInvalidUsernameOr.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblInvalidUsernameOr.setBounds(60, 22, 335, 31);
			contentPanel.add(lblInvalidUsernameOr);
		}
		
		JLabel lblNewLabel = new JLabel("Access Restricted");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(132, 50, 195, 42);
		contentPanel.add(lblNewLabel);
		{
			JButton btnOk = new JButton("Ok");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
				}
			});
			btnOk.setBounds(167, 103, 91, 23);
			contentPanel.add(btnOk);
		}
	}
}
