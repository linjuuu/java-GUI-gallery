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
		//이미지를 받아와서 크기조절 및 버튼으로 적절히 조정하여 반환 
		Image image = x.getImage();
		Image changeImage = image.getScaledInstance(pictureSize, pictureSize, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImage);
		JButton res = new JButton(changeIcon);
		return res;	
	}
	
	
	
	public void panel0() {
		JPanel PBig = new JPanel(new BorderLayout());		//pic Panel 에 넣어서 컨테이너 c에 붙일 패널 
		JPanel P = new JPanel(new FlowLayout());			// 사진을 부착할 패널, PBig에 부착할 패널이다. 
		
		ArrayList <JButton> B = new ArrayList <JButton>();	//사진 버튼을 담을 리스트 
		ArrayList <JLabel> L = new ArrayList <JLabel>();	//사진에 대한 설명을 담을 리스트 
		Main.picLocation.add(0,0);							//초기 이미지 선택 0번 
		
		
		//각 사진을 규격에 맞게 자른뒤 버튼으로 만들어 놓기 
		ImageIcon readme = new ImageIcon("./b0images/readme.png");
		JButton readMe = makePicture(readme);
		ImageIcon img1 = new ImageIcon("./b0images/image1.JPG");
		JButton image1 = makePicture(img1);
		ImageIcon img2 = new ImageIcon("./b0images/image2.png");
		JButton image2 = makePicture(img2);
		
		
		//이미지와 라벨을 만든 변수에 모두 삽입 
		B.add(0,readMe);
		B.add(1,image1);
		B.add(2,image2);
		P.add(readMe);
		P.add(image1);
		P.add(image2);
		L.add(0, new JLabel("아람코 미담장학회에서 진행한 코딩스쿨 활동입니다. 5호관에서 초,중학생에게 Swift 강의를 했습니다."));
		L.add(1,new JLabel("수업 때 아이들을 가르치는 모습입니다."));
		L.add(2,new JLabel("수업을 통해 아이들이 만든 앱 스토리라인입니다."));
		
		PBig.add(P , BorderLayout.CENTER);
		
		//이벤트 처리 등록 
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
		L.add(0, new JLabel("2022 여름, 진흥원에서 주관한 [머신러닝 실습하기] 강의의 조교를 했습니다. "));
		L.add(1,new JLabel("조교를 제안받고 메뉴얼을 받은 것입니다."));
		L.add(2,new JLabel("수업 중의 강의실 모습입니다. "));
		
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
		L.add(0, new JLabel("2022 여름, STEN에서 ISTQB라는 자격증 공부를 하였습니다"));
		L.add(1,new JLabel("자격증 시험 응시 접수를 한 사진입니다."));
		L.add(2,new JLabel("해당 강의에서 사용한 교재입니다. SW Testing을 배웠습니다."));
		
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
		L.add(0, new JLabel("2022 10월, 일산 킨텍스에서 열린 공학페스티벌 입니다. "));
		L.add(1,new JLabel("페스티벌의 발표 사진입니다. "));
		L.add(2,new JLabel("공대생 심사위원단이란 이름으로 참여하였습니다. "));
		
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
