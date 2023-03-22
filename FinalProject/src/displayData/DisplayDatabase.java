package displayData;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
public class DisplayDatabase extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DisplayDatabase().setVisible(true);
            }
        });
    }

    private final JButton button;
    private final JTable table;
    private final DefaultTableModel tableModel = new DefaultTableModel();

    public DisplayDatabase() throws HeadlessException {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        button = new JButton("Load Data");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingWorker<Void, Void>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        loadData();
                        return null;
                    }
                }.execute();
            }
        });
        
        JButton Delete = new JButton("Delete");
        Delete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		DefaultTableModel model = (DefaultTableModel)table.getModel();
        		int row = table.getSelectedRow();
        		int collumn = 0;
        		int modelRow = table.convertRowIndexToModel( row );
        		
        		try {
					java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
					PreparedStatement ps = null;
					
					String sql = "Delete from Examiners where Code=?";
					
					int Code = (int) table.getModel().getValueAt(row,collumn);
					
					ps = conn.prepareStatement(sql);
					ps.setInt( 1, Code);
					ps.executeUpdate();
					ps.close();
					
	
        		
        		} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
        		
        		
        		model.removeRow( modelRow );
        		
        		
        		
        	
        		
        	}
        });
        getContentPane().add(Delete, BorderLayout.SOUTH);
        getContentPane().add(button, BorderLayout.PAGE_START);

        setSize(640, 480);
    }

    private void loadData() {

        button.setEnabled(false);

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamDatabase","root","");
                java.sql.Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from Examiners");
            java.sql.ResultSetMetaData metaData = rs.getMetaData();

            // Names of columns
            Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }

            // Data of the table
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int i = 1; i <= columnCount; i++) {
                    vector.add(rs.getObject(i));
                }
                

                data.add(vector);
                
            }

            tableModel.setDataVector(data, columnNames);
        } catch (Exception e) {
            e.printStackTrace();
        }
        button.setEnabled(true);

 
    }

}