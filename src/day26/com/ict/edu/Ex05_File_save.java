package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.MouseInputAdapter;

public class Ex05_File_save extends JFrame {
	
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	
public Ex05_File_save() {
	super("저장하기");
	jp=new JPanel();
	jtf=new JTextField(20);
	jb=new JButton("저장하기");
	jta=new JTextArea();
	jsp=new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	jta.setLineWrap(true);
	jp.add(new JLabel("파일경로:"));
	jp.add(jtf);
	jp.add(jb);
	add(jp,BorderLayout.NORTH);
	add(jsp,BorderLayout.CENTER);
	
	
	setSize(500,500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	
	jb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			f_save();
			
		}
	});
	jtf.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			f_save();
			
		}
	});
	jtf.addMouseListener(new MouseAdapter() {
	 
		
	
		@Override
		public void mouseClicked(MouseEvent e) {
			
			FileDialog fd= new FileDialog((Frame)getParent(),"저장하기",FileDialog.SAVE);
			fd.setVisible(true);
			String msg=fd.getDirectory()+fd.getFile();
			if(!msg.equals("null")) {
				jtf.setText(msg);// TODO Auto-generated method stub
			    f_save();
	
	
			}	
		}	
	});
}
private void f_save() {
	String pathname=jtf.getText().trim();
	if(pathname.length()>0) {
		File file=new File(pathname);
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			String msg =jta.getText().trim();
			bos.write(msg.getBytes());
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
public static void main(String[] args) {
	new Ex05_File_save();
}
}
