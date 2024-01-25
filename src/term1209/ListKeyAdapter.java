package term1209;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ListKeyAdapter extends KeyAdapter{
	
	Container c;
	ArrayList<JButton> listButton = Main.listButton;
	ArrayList<JPanel> picPanel = Main.picPanel; 
	public ListKeyAdapter(Container c ) {
		this.c = c;
	}
	
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		
		
		//이전에 클릭되어 있던 패널을 삭제하고, 눌린 버튼의 색상을 다시 BLACK으로 돌려둔다. 
		c.remove(picPanel.get(Main.listLocation));
		listButton.get(Main.listLocation).setForeground(Color.BLACK);
		c.revalidate();
		c.repaint();
		
		//입력이 어떤 것인지 파악한 후 해당 번호에 맞게 패널을 등록한다. 
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if(Main.listLocation == 0) {
				Main.listLocation = 3;
			}
			else {
				Main.listLocation = Main.listLocation - 1;
			}
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(Main.listLocation == 3) {
				Main.listLocation = 0;
			}
			else {
				Main.listLocation = Main.listLocation + 1;
			}
		}
		listButton.get(Main.listLocation).setForeground(Color.MAGENTA);
		c.add(picPanel.get(Main.listLocation), BorderLayout.EAST);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
