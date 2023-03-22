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

public class ErrorNotFound extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public ErrorNotFound() {
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 293, 132);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblError = new JLabel("Error");
		lblError.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblError.setBounds(112, 11, 84, 27);
		contentPanel.add(lblError);
		
		JLabel lblExamCodeDoesnt = new JLabel("Exam Code Doesn't Exist");
		lblExamCodeDoesnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExamCodeDoesnt.setBounds(52, 36, 223, 28);
		contentPanel.add(lblExamCodeDoesnt);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
