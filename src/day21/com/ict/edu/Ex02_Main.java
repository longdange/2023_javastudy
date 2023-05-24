package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame{
	JPanel pg1;
	CardLayout cardLayout;
	
public Ex02_Main() {
	super("카드레이아웃2");
	
	pg1=new JPanel();
	cardLayout=new CardLayout();
	pg1.setLayout(cardLayout);
	
	Ex02_Login login=new Ex02_Login(cardLayout, pg1);
	pg1.add("login",login);
	add(pg1);
	
	
	setLocationRelativeTo(null);
	setSize(500,300);
	setDefaultCloseOperation(exit_on_close);
	setVisible(true);
}
public static void main(String[] args) {
	new Ex02_Main();
}
}
