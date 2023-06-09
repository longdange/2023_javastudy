package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_out extends JFrame {
	JPanel jp1, jp2;
	JLabel j1;
	JTextField jtf1;
	JButton jb1;
	JTextArea jta;
	JScrollPane jsp;

	public Ex05_File_out() {
		super("불러오기");

		jp1 = new JPanel();
		j1 = new JLabel("파일경로:");
		jtf1 = new JTextField(20);
		jb1 = new JButton("읽기");
		jp1.add(j1);
		jp1.add(jtf1);
		jp1.add(jb1);

		jp2 = new JPanel();
		jta = new JTextArea(40, 60);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp2.add(jsp);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String strPath = jtf1.getText();
				if (jtf1.getText().length() > 0) {
					String tmp = Team0531_ReadTextFile.readTextFile(strPath);
					if (tmp != null) {
						jta.setText(tmp);
					}
				}

			}
		});
	}

	public static void main(String[] args) {
		new Ex05_File_out();
	}
}
