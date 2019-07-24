package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
   * ��Ϸ������
 * 
 * */
public class MyGameFrame extends JFrame {
	Image bg = GameUtil.getImage("background.png");
	Image zdj = GameUtil.getImage("hero0.png");

	/**
	 * �÷����Զ�������
	 * */
   public void paint(Graphics g) { //g �൱��һ֧����
	   Color  c = g.getColor();
	   Font   f = g.getFont();
	   g.drawImage(bg,0,0,null);
	   g.drawImage(zdj,200,440,null);
	   
	   g.setColor(c);
	   g.setFont(f);
	   
	   
	   
   }
	
	/**
	 * ��ʼ������
	 * 
	 */	
	public void launchFrame() {
		this.setTitle("J20��սF22");
		this.setSize(480,680);
		this.setVisible(true);
		this.setLocation(100, 100);
		
		//�رճ�������
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}