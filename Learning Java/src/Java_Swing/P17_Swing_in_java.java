package Java_Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class P17_Swing_in_java {
	
	public static void main(String args[])
	{
		abc obj =new abc();
		
	}

}
class abc extends JFrame
{
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5;
	JLabel l1;
	
	
	abc()
	{
		t1=new JTextField(15);
		t2=new JTextField(15);
		b1= new JButton("sum");
		b2= new JButton("diff");
		b3= new JButton("mul");
		b4= new JButton("div");
		b5= new JButton("modulo");
		l1=new JLabel();
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l1);
		add(t1);
		add(t2);
		
		
		ActionListener al = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e)
			{
				String s1= t1.getText();
				String s2= t2.getText();
				
				int a1=Integer.parseInt(s1);
				int a2=Integer.parseInt(s2);
				
				
				if(e.getSource() == b1 )
				{
					Integer sum=a1+a2;
					l1.setText(sum.toString());
				}
			}
		};
		
		b1.addActionListener(al);
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(350,350);
		setDefaultCloseOperation(3);
		
	}
	
	
	
}

