package term1209;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class PicActionListener implements ActionListener{
	ArrayList <JButton> B;
	JPanel P;
	ArrayList <JLabel> L;
	int n;
	public PicActionListener(ArrayList<JButton> B ,JPanel P , ArrayList<JLabel> L, int n) {
		this.B = B;
		this.P = P;
		this.L = L;
		this.n = n;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton B = (JButton)e.getSource();
		
		//����  ���õ� �̹��� ��ȣ�� ���� �����Ѵ�. 
		P.remove(L.get(Main.picLocation.get(n)));
		P.revalidate();
		P.repaint();
		
		// �� ������Ʈ�� �˰ԵǸ� ���� �����Ѵ�. 
		for(int i=0;i<Main.picNumber;i++) {
			if(B.equals(this.B.get(i))) {
					Main.picLocation.set(n, i);
					break;
				}
			}
		
		P.setBackground(Color.lightGray);
		P.add(L.get(Main.picLocation.get(n)), BorderLayout.SOUTH);
		P.setVisible(true);
		
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
