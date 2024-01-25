package term1209;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/*
 * ���� ���� :
 * picPanel : Ÿ�� = ArrayList , ���� = JPanel   ==> ������ ��Ÿ�� �г��� ���� ArrayList
 * listButton : Ÿ�� = ArrayList , ���� = JButton ==> ��� ������ ��ư�� ���� ArrayList
 * listSize : Ÿ�� = int , 					   ==> ����� ���� 
 * listLocation : Ÿ�� int,					   ==> ���� ���õ� list ��ư ��ȣ 
 * picLocatin : Ÿ�� =  ArrayList, ���� = Integer==> ���� ���õ� picPanel���� ���� ��ȣ 
 * 
 * 
 * Ŭ���� ���� :
 * Main : �������� ����� Ŭ����, �ٸ� Ŭ������ ȣ���Ͽ� ���������� ��������� Ŭ���� 
 * ListClass : ��� ��ư�� �����ϰ� listPanel�� ����ִ� Ŭ���� , �������� ���ڷ� Container c �� �޴´�.
 * PicClass : �� ��Ͽ� ���� �������� �г��� ����� Ŭ����, �������� ���ڷ� Container c �޴´�. 
 * ListActionListener : ����� ������ �г��� �ٲپ��ִ� ������ Ŭ���� , �������� ���ڷ� Container c �޴´�.
 * ListKeyAdapter : ����Ű�� �г��� �ٲپ��ִ� ������ Ŭ���� , �������� ���ڷ� Container c �޴´�.
 * picActionListener : �̹��� Ŭ�� �� �Ʒ�JLabel�� ����. 
 * picKeyAdapter 	 : �̹����� ����� �̵��Ͽ� �Ʒ� JLabel ����. 
 * 
 * 
 * 
 * 
 */

public class Main extends JFrame{
	static public int listSize = 4;			
	static public int picNumber = 3;
	static public int listLocation = 0;
	static public  ArrayList<Integer> picLocation = new ArrayList<Integer>();
	static public ArrayList <JPanel> picPanel = new ArrayList<JPanel>();
	static public ArrayList <JButton> listButton = new ArrayList<JButton>();
	
	
	public Main() {
		Container c = getContentPane();
		setTitle("Term Project");
		setSize(900,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		new PicClass(c);			//���� �гε��� ����
		new ListClass(c);			//��� �����Ͽ� ����
	
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Main();

	}

}
