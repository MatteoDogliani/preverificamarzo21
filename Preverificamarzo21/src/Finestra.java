import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finestra extends JFrame implements ActionListener, MouseListener {
	private JTable table;
	private DefaultTableModel dmt;
	private JScrollPane pane;
	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem inserisci, salva, carica;
	//private Array a;
	private ImageIcon icon;
	private JLabel jl;
	private JPanel jp;
	
	public void initComp() {
		
		Object[][] data = {};
		String[] nomeColonne={"Nome", "Cognome", "Classe"};
		dmt = new DefaultTableModel(data, nomeColonne);
		table = new JTable(dmt);
		pane = new JScrollPane(table);
		
		bar = new JMenuBar();
		menu = new JMenu("File");
		inserisci = new JMenuItem("Inserisci");
		salva = new JMenuItem("Salva");
		carica = new JMenuItem("Carica");
		icon= new ImageIcon();
		jl= new JLabel("foto");;
		jp.add(jl);

		
		
		menu.add(carica);
		menu.add(salva);
		menu.add(inserisci);
		bar.add(menu);
		
		this.add(bar);
		this.add(pane);
		this.add(jp);
		inserisci.addActionListener(this);
		salva.addActionListener(this);
		carica.addActionListener(this);

	}
	
	public Finestra() {
		initComp();
	}
}

public static void main(String[] args) {
	Finestra f = new Finestra();
	f.setTitle("Esercizio pre verifica");
	f.setSize(400,600);
	f.setVisible(true);

	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource().equals(tab)) {
			int i = dtm.getSelectedRow();
			Alunno a = Elencoalunni.get(i);
			icon = new ImageIcon (Alunno.getPath());
			jl.setIcon(icon);
		}
	
}