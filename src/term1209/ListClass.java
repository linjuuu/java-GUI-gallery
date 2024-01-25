package term1209;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ListClass extends JFrame{
	Container c;
	ArrayList<JButton> listButton = Main.listButton;
	ArrayList<JPanel> picPanel = Main.picPanel;
	public ListClass(Container c) {
		this.c = c;
		makeList();
	}
	
	
	public void makeList() {
		JPanel P = new JPanel();
		P.setLayout(new GridLayout(4,1));

		listButton.add(0,new JButton("�̴�����ȸ �ڵ�����"));
		listButton.add(1,new JButton("�ӽŷ��� TA"));
		listButton.add(2,new JButton("ISTQB"));
		listButton.add(3,new JButton("���� �佺Ƽ��"));
		
		ListActionListener AL = new ListActionListener(c);
		ListKeyAdapter KA = new ListKeyAdapter(c);
		for (int i =0;i<Main.listSize;i++) {
			listButton.get(i).addActionListener(AL);
			listButton.get(i).addKeyListener(KA);
			P.add(listButton.get(i));
		}
		
		P.setVisible(true);
		c.add(P,BorderLayout.WEST);
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
