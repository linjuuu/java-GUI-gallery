package term1209;


import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PicClass {
	Container c;
	ArrayList <JPanel> picPanel = Main.picPanel;
	static int pictureSize = 200;

	public PicClass(Container c) {
		this.c = c;
		panel0();
		panel1();
		panel2();
		panel3();
	}
	
	
	public static JButton makePicture(ImageIcon x) {
		//�̹����� �޾ƿͼ� ũ������ �� ��ư���� ������ �����Ͽ� ��ȯ 
		Image image = x.getImage();
		Image changeImage = image.getScaledInstance(pictureSize, pictureSize, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImage);
		JButton res = new JButton(changeIcon);
		return res;	
	}
	
	
	
	public void panel0() {
		JPanel PBig = new JPanel(new BorderLayout());		//pic Panel �� �־ �����̳� c�� ���� �г� 
		JPanel P = new JPanel(new FlowLayout());			// ������ ������ �г�, PBig�� ������ �г��̴�. 
		
		ArrayList <JButton> B = new ArrayList <JButton>();	//���� ��ư�� ���� ����Ʈ 
		ArrayList <JLabel> L = new ArrayList <JLabel>();	//������ ���� ������ ���� ����Ʈ 
		Main.picLocation.add(0,0);							//�ʱ� �̹��� ���� 0�� 
		
		
		//�� ������ �԰ݿ� �°� �ڸ��� ��ư���� ����� ���� 
		ImageIcon readme = new ImageIcon("./b0images/readme.png");
		JButton readMe = makePicture(readme);
		ImageIcon img1 = new ImageIcon("./b0images/image1.JPG");
		JButton image1 = makePicture(img1);
		ImageIcon img2 = new ImageIcon("./b0images/image2.png");
		JButton image2 = makePicture(img2);
		
		
		//�̹����� ���� ���� ������ ��� ���� 
		B.add(0,readMe);
		B.add(1,image1);
		B.add(2,image2);
		P.add(readMe);
		P.add(image1);
		P.add(image2);
		L.add(0, new JLabel("�ƶ��� �̴�����ȸ���� ������ �ڵ����� Ȱ���Դϴ�. 5ȣ������ ��,���л����� Swift ���Ǹ� �߽��ϴ�."));
		L.add(1,new JLabel("���� �� ���̵��� ����ġ�� ����Դϴ�."));
		L.add(2,new JLabel("������ ���� ���̵��� ���� �� ���丮�����Դϴ�."));
		
		PBig.add(P , BorderLayout.CENTER);
		
		//�̺�Ʈ ó�� ��� 
		PicActionListener AL = new PicActionListener(B,PBig,L, 0);
		PicKeyAdapter KA = new PicKeyAdapter(B,PBig,L,0);
		for(int i =0;i<Main.picNumber;i++) {
			B.get(i).addActionListener(AL);
			B.get(i).addKeyListener(KA);
			L.get(i).setVisible(true);
		}
		
		PBig.setVisible(true);
		picPanel.add(0,PBig);
		
	}
	
	
	
	
	
	public void panel1() {
		JPanel PBig = new JPanel(new BorderLayout());
		JPanel P = new JPanel(new FlowLayout());
		
		ArrayList <JButton> B = new ArrayList <JButton>();
		ArrayList <JLabel> L = new ArrayList <JLabel>();
		Main.picLocation.add(1,0);
		
		ImageIcon readme = new ImageIcon("./b1images/readme.png");
		JButton readMe = makePicture(readme);
		ImageIcon img1 = new ImageIcon("./b1images/image1.jpg");
		JButton image1 = makePicture(img1);
		ImageIcon img2 = new ImageIcon("./b1images/image2.JPG");
		JButton image2 = makePicture(img2);
		
		B.add(0,readMe);
		B.add(1,image1);
		B.add(2,image2);
		P.add(readMe,BorderLayout.CENTER);
		P.add(image1,BorderLayout.CENTER);
		P.add(image2,BorderLayout.CENTER);
		L.add(0, new JLabel("2022 ����, ��������� �ְ��� [�ӽŷ��� �ǽ��ϱ�] ������ ������ �߽��ϴ�. "));
		L.add(1,new JLabel("������ ���ȹް� �޴����� ���� ���Դϴ�."));
		L.add(2,new JLabel("���� ���� ���ǽ� ����Դϴ�. "));
		
		PBig.add(P , BorderLayout.CENTER);
		PicActionListener AL = new PicActionListener(B,PBig,L, 1);
		PicKeyAdapter KA = new PicKeyAdapter(B,PBig,L,1);
		for(int i =0;i<Main.picNumber;i++) {
			B.get(i).addActionListener(AL);
			B.get(i).addKeyListener(KA);
			L.get(i).setVisible(true);
		}
	
		PBig.setVisible(true);
		picPanel.add(1,PBig);
	}
	
	
	
	
	public void panel2() {
		JPanel PBig = new JPanel(new BorderLayout());
		JPanel P = new JPanel(new FlowLayout());
		
		ArrayList <JButton> B = new ArrayList <JButton>();
		ArrayList <JLabel> L = new ArrayList <JLabel>();
		Main.picLocation.add(2,0);
		
		ImageIcon readme = new ImageIcon("./b2images/readme.png");
		JButton readMe = makePicture(readme);					
		ImageIcon img1 = new ImageIcon("./b2images/image1.png");
		JButton image1 = makePicture(img1);
		ImageIcon img2 = new ImageIcon("./b2images/image2.jpg");
		JButton image2 = makePicture(img2);
		
		B.add(0,readMe);
		B.add(1,image1);
		B.add(2,image2);
		P.add(readMe,BorderLayout.CENTER);
		P.add(image1,BorderLayout.CENTER);
		P.add(image2,BorderLayout.CENTER);
		L.add(0, new JLabel("2022 ����, STEN���� ISTQB��� �ڰ��� ���θ� �Ͽ����ϴ�"));
		L.add(1,new JLabel("�ڰ��� ���� ���� ������ �� �����Դϴ�."));
		L.add(2,new JLabel("�ش� ���ǿ��� ����� �����Դϴ�. SW Testing�� ������ϴ�."));
		
		PBig.add(P , BorderLayout.CENTER);
		PicActionListener AL = new PicActionListener(B,PBig,L,2);
		PicKeyAdapter KA = new PicKeyAdapter(B,PBig,L,2);
		for(int i =0;i<Main.picNumber;i++) {
			B.get(i).addActionListener(AL);
			B.get(i).addKeyListener(KA);
			L.get(i).setVisible(true);
		}
	
		PBig.setVisible(true);
		picPanel.add(2,PBig);
		
	}
	public void panel3() {
		JPanel PBig = new JPanel(new BorderLayout());
		JPanel P = new JPanel(new FlowLayout());
		
		ArrayList <JButton> B = new ArrayList <JButton>();
		ArrayList <JLabel> L = new ArrayList <JLabel>();
		Main.picLocation.add(3,0);
		
		ImageIcon readme = new ImageIcon("./b3images/readme.png");
		JButton readMe = makePicture(readme);
		ImageIcon img1 = new ImageIcon("./b3images/image1.jpg");
		JButton image1 = makePicture(img1);
		ImageIcon img2 = new ImageIcon("./b3images/image2.JPG");
		JButton image2 = makePicture(img2);
		
		B.add(0,readMe);
		B.add(1,image1);
		B.add(2,image2);
		P.add(readMe,BorderLayout.CENTER);
		P.add(image1,BorderLayout.CENTER);
		P.add(image2,BorderLayout.CENTER);
		L.add(0, new JLabel("2022 10��, �ϻ� Ų�ؽ����� ���� �����佺Ƽ�� �Դϴ�. "));
		L.add(1,new JLabel("�佺Ƽ���� ��ǥ �����Դϴ�. "));
		L.add(2,new JLabel("����� �ɻ��������̶� �̸����� �����Ͽ����ϴ�. "));
		
		PBig.add(P , BorderLayout.CENTER);
		PicActionListener AL = new PicActionListener(B,PBig,L,3);
		PicKeyAdapter KA = new PicKeyAdapter(B,PBig,L,3);
		for(int i =0;i<Main.picNumber;i++) {
			B.get(i).addActionListener(AL);
			B.get(i).addKeyListener(KA);
			L.get(i).setVisible(true);
		}
	
		PBig.setVisible(true);
		picPanel.add(3,PBig);
		
		
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
