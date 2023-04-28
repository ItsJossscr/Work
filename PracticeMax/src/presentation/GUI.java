package presentation;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class GUI extends JFrame {

	private JPanel Menu;
	private JLabel Cant;
	private JTextField TCant;
	private JScrollPane scrollPane;
	private JButton Aplit;
	
	private JTextArea JTA;
	private JTextArea JTAB;
	
	private JLabel Bus;
	private JTextField TBus;
	private JButton BB;
	private JScrollPane SPC21;
	private JLabel COOR;

	
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 382);
		Menu = new JPanel();
		Menu.setBackground(new Color(128, 128, 255));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Menu);
		 
		setJTA();
		setJTAB();
		setSCroll(JTA);
		setLBus();
		 setTBus();
		 setButtonBus();
		 setSPCOOR(JTAB);
		Menu.setLayout(null);
		Menu.add(getCant());
		Menu.add(getTCant());
		Menu.add(getScrollPane());
		Menu.add(getAplit());	
		Menu.add(getLBusc());
		Menu.add( getTbus());
		Menu.add(getBUttonBus());
		Menu.add(getSPCOOR());
		{
			COOR = new JLabel("Coordenadas");
			COOR.setBounds(492, 48, 296, 14);
			Menu.add(COOR);
		}
		
			
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public JLabel getCant() {
		if (Cant == null) {
			Cant = new JLabel("Cantidad");
			Cant.setBounds(393, 28, 86, 14);
		}
		return Cant;
	}
	public JTextField getTCant() {
		if (TCant == null) {
			TCant = new JTextField();
			TCant.setBounds(393, 42, 86, 20);
			TCant.setColumns(10);
		}
		return TCant;
	}
	public JScrollPane getScrollPane() {
		
		return scrollPane;
	}
	
	public void setSCroll(JTextArea s) {
		
		
	scrollPane = new JScrollPane(s);
    scrollPane.setBounds(40, 27, 326, 205);
		
		
	}
	
	
	
	
	public JButton getAplit() {
		if (Aplit == null) {
			Aplit = new JButton("Aplicar");
			Aplit.setBounds(393, 65, 89, 23);
		}
		return Aplit;
	}
	
	
	public void setJTA() {
		
		JTA=new JTextArea();
		JTA.setLineWrap(true);
		
		
	}
	
	public JTextArea getJTA() {
		
		return this.JTA;
		
	}
	public void setLBus() {
		Bus = new JLabel("Buscar");
		Bus.setBounds(393, 128, 46, 14);
		
	}
	
	public JLabel getLBusc() {
		return this.Bus;
		
	}
	public void setTBus() {
		TBus = new JTextField();
		TBus.setBounds(393, 142, 86, 20);
		TBus.setColumns(10);
		
	}
	
	
	public JTextField getTbus() {
		return this.TBus;
	}
	
	public void setButtonBus() {
		
		BB = new JButton("Buscar");
		BB.setBounds(390, 173, 89, 23);
		
	}
	
	public JButton getBUttonBus() {
		
		return this.BB;
		
	}
	
	public void clean() {
		
		TCant.setText("");
		
		
	}
	public void CB() {
		
		TBus.setText("");
		
		
	}
	
	public void setSPCOOR(JTextArea a) {
		
		SPC21 = new JScrollPane(a);
		SPC21.setBounds(492, 74, 296, 88);
		
	}
	
	public JScrollPane getSPCOOR() {
		
		return this.SPC21;
		
	}
public void setJTAB() {
		
		JTAB=new JTextArea();
		JTAB.setLineWrap(true);
		
		
	}
	
	public JTextArea getJTAB() {
		
		return this.JTAB;
		
	}
	
	
	
}
