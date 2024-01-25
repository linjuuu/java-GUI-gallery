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
		
		
		//������ Ŭ���Ǿ� �ִ� �г��� �����ϰ�, ���� ��ư�� ������ �ٽ� BLACK���� �����д�. 
		c.remove(picPanel.get(Main.listLocation));
		listButton.get(Main.listLocation).setForeground(Color.BLACK);
		c.revalidate();
		c.repaint();
		
		//�Է��� � ������ �ľ��� �� �ش� ��ȣ�� �°� �г��� ����Ѵ�. 
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
