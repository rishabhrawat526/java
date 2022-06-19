package Java_Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class practice {

	
	public static void main(String args[])
	{
		swing_in_java obj = new swing_in_java();
	}
}


class swing_in_java extends JFrame{
	
	JButton b1,b2,b3,b4,b5;
	JLabel l1;
	JTextField t1,t2;
	
	swing_in_java(){
		
		b1 = new JButton("sum");
		b2 = new JButton("sub");
		b3 = new JButton("mul");
		b4 = new JButton("div");
		b5 = new JButton("modulo");
		
		t1= new JTextField(15);
		t2= new JTextField(15);
		
		l1= new JLabel();
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l1);
		add(t1);
		add(t2);
		
		ActionListener al = new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String s1 = t1.getText();
						String s2 = t2.getText();
						
						int a1= Integer.parseInt(s1);
						int a2= Integer.parseInt(s2);
						
						if(e.getSource()==b1)
						{
							Integer sum=a1+a2;
							l1.setText(sum.toString());
						}
						if(e.getSource()==b2)
						{
							Integer sub=a1-a2;
							l1.setText(sub.toString());
						}
						if(e.getSource()==b3)
						{
							Integer mul=a1*a2;
							l1.setText(mul.toString());
						}
						if(e.getSource()==b4)
						{
							Integer div=a1/a2;
							l1.setText(div.toString());
						}
						if(e.getSource()==b5)
						{
							Integer modulo=a1%a2;
							l1.setText(modulo.toString());
						}
						
					}
				};
				b1.addActionListener(al);
				b2.addActionListener(al);
				b3.addActionListener(al);
				b4.addActionListener(al);
				b5.addActionListener(al);
				setLayout(new FlowLayout());
				setVisible(true);
				setSize(300,300);
				setDefaultCloseOperation(3);
	}
	
	
}