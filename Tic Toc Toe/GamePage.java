import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePage extends JFrame implements MouseListener, ActionListener
{
	
	private JLabel label1,copyRight;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,again,exit;
	private JPanel panel;
	
	public int f1,f2,f3,f4,f5,f6,f7,f8,f9,player,flag;
	public int p1,p2,p3,p4,p5,p6,p7,p8,p9;
	public int q1,q2,q3,q4,q5,q6,q7,q8,q9;
	
	public GamePage()
	{	
		super("Game Page");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.BLACK.darker());
		panel.setLayout(null);
		
		f1=0;f2=0;f3=0;f4=0;f5=0;f6=0;f7=0;f8=0;f9=0;player=1;flag=0;
		p1=0;p2=0;p3=0;p4=0;p5=0;p6=0;p7=0;p8=0;p9=0;
		q1=0;q2=0;q3=0;q4=0;q5=0;q6=0;q7=0;q8=0;q9=0;
		
		label1=new JLabel("Player 1 will move now");
		label1.setBounds(700,60,400,60);
		label1.setOpaque(true);
		label1.setBackground(Color.BLACK.darker());
		label1.setForeground(Color.green);
		label1.setFont(new Font("Cambria",Font.BOLD,26));
		panel.add(label1);
		
		copyRight=new JLabel("\u00a9"+"2017 Ehtesham Ahmad Nadim All right reserved");
		copyRight.setOpaque(true);
		copyRight.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,11));
		copyRight.setBounds(700,550,400,40);
		copyRight.setForeground(Color.white);
		copyRight.setBackground(Color.black);
		panel.add(copyRight);	

		
		b1=new JButton("1");
		b1.setBounds(40,60,150,150);
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);
		b1.addMouseListener(this);
		panel.add(b1);
		
		b2=new JButton("2");
		b2.setBounds(200,60,150,150);
		b2.setBackground(Color.WHITE);
		b2.addActionListener(this);
		b2.addMouseListener(this);
		panel.add(b2);
		
		b3=new JButton("3");
		b3.setBounds(360,60,150,150);
		b3.setBackground(Color.WHITE);
		b3.addActionListener(this);
		b3.addMouseListener(this);
		panel.add(b3);
		
		b4=new JButton("4");
		b4.setBounds(40,220,150,150);
		b4.setBackground(Color.WHITE);
		b4.addActionListener(this);
		b4.addMouseListener(this);
		panel.add(b4);
		
		b5=new JButton("5");
		b5.setBounds(200,220,150,150);
		b5.setBackground(Color.WHITE);
		b5.addActionListener(this);
		b5.addMouseListener(this);
		panel.add(b5);
		
		b6=new JButton("6");
		b6.setBounds(360,220,150,150);
		b6.setBackground(Color.WHITE);
		b6.addActionListener(this);
		b6.addMouseListener(this);
		panel.add(b6);
		
		b7=new JButton("7");
		b7.setBounds(40,380,150,150);
		b7.setBackground(Color.WHITE);
		b7.addActionListener(this);
		b7.addMouseListener(this);
		panel.add(b7);
		
		b8=new JButton("8");
		b8.setBounds(200,380,150,150);
		b8.setBackground(Color.WHITE);
		b8.addActionListener(this);
		b8.addMouseListener(this);
		panel.add(b8);
		
		b9=new JButton("9");
		b9.setBounds(360,380,150,150);
		b9.setBackground(Color.WHITE);
		b9.addActionListener(this);
		b9.addMouseListener(this);
		panel.add(b9);
		
		again=new JButton("Restart");
		again.setBounds(700,220,100,40);
		again.setOpaque(true);
		again.setBackground(Color.green.darker());
		again.setForeground(Color.white);
		again.addActionListener(this);
		again.addMouseListener(this);
		panel.add(again);
		
		
		exit=new JButton("Exit");
		exit.setBounds(900,220,80,40);
		exit.setOpaque(true);
		exit.setBackground(Color.red.darker());
		exit.setForeground(Color.white);
		exit.addActionListener(this);
		exit.addMouseListener(this);
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
		if(elementText.equals(again.getText()))
		{
			GamePage h=new GamePage();
			h.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
		else if(player==1)
		{
			if(elementText.equals(b1.getText()))
			{
				if(f1==0)
				{
					b1.setFont(new Font("Cambria",Font.BOLD,100));
					b1.setText("X");
					f1=1;
					p1=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b2.getText()))
			{
				if(f2==0)
				{
					b2.setFont(new Font("Cambria",Font.BOLD,100));
					b2.setText("X");
					f2=1;
					p2=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b3.getText()))
			{
				if(f3==0)
				{
					b3.setFont(new Font("Cambria",Font.BOLD,100));
					b3.setText("X");
					f3=1;
					p3=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b4.getText()))
			{
				if(f4==0)
				{
					b4.setFont(new Font("Cambria",Font.BOLD,100));
					b4.setText("X");
					f4=1;
					p4=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b5.getText()))
			{
				if(f5==0)
				{
					b5.setFont(new Font("Cambria",Font.BOLD,100));
					b5.setText("X");
					f5=1;
					p5=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b6.getText()))
			{
				if(f6==0)
				{
					b6.setFont(new Font("Cambria",Font.BOLD,100));
					b6.setText("X");
					f6=1;
					p6=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b7.getText()))
			{
				if(f7==0)
				{
					b7.setFont(new Font("Cambria",Font.BOLD,100));
					b7.setText("X");
					f7=1;
					p7=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b8.getText()))
			{
				if(f8==0)
				{
					b8.setFont(new Font("Cambria",Font.BOLD,100));
					b8.setText("X");
					f8=1;
					p8=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}
			else if(elementText.equals(b9.getText()))
			{
				if(f9==0)
				{
					b9.setFont(new Font("Cambria",Font.BOLD,100));
					b9.setText("X");
					f9=1;
					p9=1;
					player=2;
					label1.setText("Player 2 will move now");
					label1.setForeground(Color.RED);
				}
			}

			resultCheck();
		}
		else if(player==2)
		{
			if(elementText.equals(b1.getText()))
			{
				if(f1==0)
				{
					b1.setFont(new Font("Cambria",Font.BOLD,100));
					b1.setText("0");
					f1=1;
					q1=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b2.getText()))
			{
				if(f2==0)
				{
					b2.setFont(new Font("Cambria",Font.BOLD,100));
					b2.setText("0");
					f2=1;
					q2=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b3.getText()))
			{
				if(f3==0)
				{
					b3.setFont(new Font("Cambria",Font.BOLD,100));
					b3.setText("0");
					f3=1;
					q3=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b4.getText()))
			{
				if(f4==0)
				{
					b4.setFont(new Font("Cambria",Font.BOLD,100));
					b4.setText("0");
					f4=1;
					q4=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b5.getText()))
			{
				if(f5==0)
				{
					b5.setFont(new Font("Cambria",Font.BOLD,100));
					b5.setText("0");
					f5=1;
					q5=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b6.getText()))
			{
				if(f6==0)
				{
					b6.setFont(new Font("Cambria",Font.BOLD,100));
					b6.setText("0");
					f6=1;
					q6=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b7.getText()))
			{
				if(f7==0)
				{
					b7.setFont(new Font("Cambria",Font.BOLD,100));
					b7.setText("0");
					f7=1;
					q7=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b8.getText()))
			{
				if(f8==0)
				{
					b8.setFont(new Font("Cambria",Font.BOLD,100));
					b8.setText("0");
					f8=1;
					q8=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}
			else if(elementText.equals(b9.getText()))
			{
				if(f9==0)
				{
					b9.setFont(new Font("Cambria",Font.BOLD,100));
					b9.setText("0");
					f9=1;
					q9=1;
					player=1;
					label1.setText("Player 1 will move now");
					label1.setForeground(Color.GREEN);
				}
			}

			resultCheck();
		}
	}
	public void resultCheck()
	{
		if(p1==1 && p4==1 && p7==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p2==1 && p5==1 && p8==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p3==1 && p6==1 && p9==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p1==1 && p2==1 && p3==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p4==1 && p5==1 && p6==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p7==1 && p8==1 && p9==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p1==1 && p5==1 && p9==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(p3==1 && p5==1 && p7==1)
		{
			label1.setText("Player 1 Wins");
			label1.setForeground(Color.GREEN);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q1==1 && q4==1 && q7==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q2==1 && q5==1 && q8==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q3==1 && q6==1 && q9==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q1==1 && q2==1 && q3==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q4==1 && q5==1 && q6==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q7==1 && q8==1 && q9==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q1==1 && q5==1 && q9==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(q3==1 && q5==1 && q7==1)
		{
			label1.setText("Player 2 Wins");
			label1.setForeground(Color.RED);
			f1=1;f2=1;f3=1;f4=1;f5=1;f6=1;f7=1;f8=1;f9=1;flag=1;
		}
		else if(f1==1 && f2==1 && f3==1 && f4==1 && f5==1 && f6==1 && f7==1 && f8==1 && f9==1 && flag==0)
		{
			label1.setText("Match Draw");
			label1.setForeground(Color.YELLOW);
		}
	}
}
		