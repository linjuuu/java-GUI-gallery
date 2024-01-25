package term1209;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PicKeyAdapter  extends KeyAdapter{
	ArrayList <JButton> B;
	JPanel P;
	ArrayList <JLabel> L;
	int n;
	public PicKeyAdapter(ArrayList<JButton> B ,JPanel P , ArrayList<JLabel> L,int n) {
		this.B = B;
		this.P = P;
		this.L = L;
		this.n = n;
	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		
		// 이전에 선택했던 번호의 라벨을 지운다. 
		int temp =  Main.picLocation.get(n);
		P.remove( L.get(temp) );
		P.revalidate();
		P.repaint();
		
		//어떤 화살표가 눌리는지 확인하고, 이미지의 끝이면 순환할 수 있게 작성. 매번 현재 이미지 번호 라벨을 최신
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if( temp == 0) {
				Main.picLocation.set(n, 2);
			}
			else {
				Main.picLocation.set(n, temp - 1);
			}
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(temp == 2) {
				Main.picLocation.set(n, 0);
			}
			else {
				Main.picLocation.set(n, temp + 1);
			}
		}
		
		
		P.add(L.get(Main.picLocation.get(n)), BorderLayout.SOUTH);
	}
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
