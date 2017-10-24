package kr.or.dgit.coffee_application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.coffee_application.list.AbstractList;
import kr.or.dgit.coffee_application.list.cOutputList2;
import kr.or.dgit.coffee_application.service.cOutputService;

public class testList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testList jf = new testList();
					jf.setVisible(true);
					jf.setBounds(10, 10, 200, 150);
					
					//AbstractList ld = new MenuList(new MenuService());
					//AbstractList ld = new cInputList(new cInputService());
					//AbstractList ld = new cOutputList(new cOutputService());
					AbstractList ld = new cOutputList2(new cOutputService());
					
					ld.loadData();
					jf.add(ld);
					JButton btn = new JButton("test");
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Object obj = ld.getSelectedItem();
							JOptionPane.showMessageDialog(null, obj);
						}
					});
					jf.add(btn, BorderLayout.SOUTH);
					jf.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
