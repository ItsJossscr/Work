package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import presentation.GUI;
import presentation.LogMatrix;

public class Controller implements ActionListener {

	private LogMatrix lgm;
	private GUI gui;
	private char[][] Max;
	
	public Controller() {
		lgm=new LogMatrix();
		gui=new GUI();
		
		
		InitializerAction();
	}
	
	public void InitializerAction() {
		
		gui.getAplit().addActionListener(this);
		gui.getBUttonBus().addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==gui.getAplit()) {
			si();
			
		}
		if(e.getSource()==gui.getBUttonBus()) {
			
			
			no();
			
		}
		
		
	}
	
	
	public void si(){
		
		int size=Integer.parseInt(gui.getTCant().getText());
		
		
		Max=lgm.newMatrix(size);
		
		String n=lgm.fillMatrixToString(Max);
		
		gui.getJTA().setText(n);
		gui.clean();
	}
	
	
	public void no() {
		
		char word=gui.getTbus().getText().charAt(0);
		String s=lgm.searchWord(Max, word);
		
		gui.getJTAB().setText("Las cordenadas donde estan la letra "+word+": "+s);
		gui.CB();
		
		
	}
	
	
	

}
