package day48;

import java.awt.event.*;
import javax.swing.*;

class MenuActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"팝업");
	}}
public class MenuTest extends JFrame{
MenuTest(){
	setTitle("Menu 만들기");
	createMenu();
	setSize(250,200);
	setVisible(true);
}
	private void createMenu() {
    //메뉴바 생성
	JMenuBar mb =new JMenuBar();
	//메뉴 생성
	JMenu screenMenu = new JMenu("메뉴바1");
	
	//메뉴에 부착할 아이템 생성
	screenMenu.add(new JMenuItem("팝업"));
	screenMenu.add(new JMenuItem("Hide"));
	screenMenu.add(new JMenuItem("ReShow"));
	screenMenu.addSeparator();//구분선
	screenMenu.add(new JMenuItem("Exit"));
	//메뉴아이템 객체 만들어서 메뉴에 붙이기
	JMenuItem item = new JMenuItem("팝업");
	item.addActionListener(new MenuActionListener());
	screenMenu.add(item);
	//메뉴바에 매뉴 부착
	mb.add(screenMenu);
	mb.add(new JMenu("편집"));
	mb.add(new JMenu("실행"));
	mb.add(new JMenu("도움말"));
	
	//메뉴바를 현재 프래임의 메뉴로 지정
	setJMenuBar(mb);
	
	}
	public static void main(String[] args) {
		new MenuTest();
	}

}
