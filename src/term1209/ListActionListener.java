package term1209;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ListActionListener implements ActionListener{
	

	Container c;
	ArrayList<JButton> listButton = Main.listButton;
	ArrayList<JPanel> picPanel = Main.picPanel; 
	public ListActionListener(Container c ) {
		this.c = c;
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		c.remove(picPanel.get(Main.listLocation));
		listButton.get(Main.listLocation).setForeground(Color.BLACK);
		c.revalidate();
		c.repaint();
		JButton B = (JButton)e.getSource();
		for(int i =0;i < Main.listSize;i++){
			if (B.equals(listButton.get(i))){
				listButton.get(i).setForeground(Color.MAGENTA);
				Main.listLocation = i;
			}
		}
		c.add(picPanel.get(Main.listLocation) , BorderLayout.EAST);
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
