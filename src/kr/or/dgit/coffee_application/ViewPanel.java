package kr.or.dgit.coffee_application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import kr.or.dgit.coffee_application.content.cInputContent;
import kr.or.dgit.coffee_application.view.ViewMenu;
import kr.or.dgit.coffee_application.view.cInputView;

public class ViewPanel {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				
				try{
					
					/*ViewMenu frame = new ViewMenu("메뉴관리");
					frame.setVisible(true);*/
					
					cInputView frame1 = new cInputView("판매 관리");
					frame1.setVisible(true);
					
					
					/*JFrame a = new JFrame();
					cInputContent c = new cInputContent();
					a.add(c);
					
					JButton btn = new JButton("aa");
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, c.getContent());
						}
					});
					a.add(btn, BorderLayout.SOUTH);
					a.setVisible(true);*/
					

				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		
	
}
