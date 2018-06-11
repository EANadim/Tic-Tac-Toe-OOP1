import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements MouseListener, ActionListener
{
	
	private JLabel label1,copyRight;
	private JButton start,exit;
	private JPanel panel;

	public HomePage()
	{
		super("Home Page");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.BLACK.darker());
		panel.setLayout(null);
		
		label1=new JLabel("TIC TAC TOE");
		label1.setOpaque(true);
		label1.setBounds(510,200,300,80);
		label1.setForeground(Color.WHITE);
		label1.setBackground(Color.BLACK.darker());
		label1.setFont(new Font("Cambria", Font.ITALIC+Font.BOLD, 30));
		panel.add(label1);
		
		copyRight=new JLabel("\u00a9"+"2017 Ehtesham Ahmad Nadim All right reserved");
		copyRight.setOpaque(true);
		copyRight.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,11));
		copyRight.setBounds(700,550,400,40);
		copyRight.setForeground(Color.white);
		copyRight.setBackground(Color.black);
		panel.add(copyRight);	
		
		start=new JButton("Start");
		start.setBounds(470,400,100,50);
		start.setForeground(Color.WHITE);
		start.setBackground(Color.GREEN.darker());
		start.setFont(new Font("Cambria", Font.ITALIC+Font.BOLD, 26));
		start.addMouseListener(this);
		start.addActionListener(this);
		panel.add(start);
		
		
		exit=new JButton("Exit");
		exit.setBounds(670,400,100,50);
		exit.setForeground(Color.WHITE);
		exit.setBackground(Color.RED.darker());
		exit.setFont(new Font("Cambria", Font.ITALIC+Font.BOLD, 26));
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		String elementText=ae.getActionCommand();
		if(elementText.equals(start.getText()))
		{
			GamePage g=new GamePage();
			g.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}