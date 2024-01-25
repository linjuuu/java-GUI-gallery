package term1209;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/*
 * 변수 설명 :
 * picPanel : 타입 = ArrayList , 원소 = JPanel   ==> 사진을 나타낼 패널을 담은 ArrayList
 * listButton : 타입 = ArrayList , 원소 = JButton ==> 목록 누르는 버튼을 담은 ArrayList
 * listSize : 타입 = int , 					   ==> 목록의 갯수 
 * listLocation : 타입 int,					   ==> 현재 선택된 list 버튼 번호 
 * picLocatin : 타입 =  ArrayList, 원소 = Integer==> 현재 선택된 picPanel내에 사진 번호 
 * 
 * 
 * 클래스 설명 :
 * Main : 프레임을 만드는 클래스, 다른 클래스를 호출하여 최종적으로 만들어지는 클래스 
 * ListClass : 목록 버튼을 구현하고 listPanel에 담아주는 클래스 , 생성자의 인자로 Container c 를 받는다.
 * PicClass : 각 목록에 대한 사진담은 패널을 만드는 클래스, 생성자의 인자로 Container c 받는다. 
 * ListActionListener : 목록을 누르면 패널을 바꾸어주는 리스너 클래스 , 생성자의 인자로 Container c 받는다.
 * ListKeyAdapter : 방향키로 패널을 바꾸어주는 리스너 클래스 , 생성자의 인자로 Container c 받는다.
 * picActionListener : 이미지 클릭 시 아래JLabel을 띄운다. 
 * picKeyAdapter 	 : 이미지를 마우로 이동하여 아래 JLabel 띄우기. 
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
		
		
		new PicClass(c);			//사진 패널들을 생성
		new ListClass(c);			//목록 생성하여 부착
	
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Main();

	}

}
