package SwingFilm;

import javax.swing.table.TableModel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import DAO.*;


public class WindowFilm extends JFrame implements ActionListener{
    
    private ArrayList<Film> listeFilm;
    
    public WindowFilm() throws SQLException{
        super("DAO");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 300));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        DAOFilm unFilm = new DAOFilm();
        this.listeFilm = unFilm.listeFilm();
        unFilm.close();
        
        
        TableModel filmTableModel = new TableModelF(this.listeFilm);
        JTable Table = new JTable(filmTableModel);
        Table.setPreferredScrollableViewportSize(new Dimension(480, 260));
        Table.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(Table);
        contentPanel.add(scrollPane);

        this.setVisible(true);
    }
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
   
}
