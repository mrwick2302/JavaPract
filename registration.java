import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class practical6 extends Frame implements ActionListener
{
	JTextField rno,sname,per,gen,clas;
	JLabel text;
	JButton btn;
	practical6()
	{
		setSize(400,400);
		setLayout(new FlowLayout());
		
		JLabel lRno=new JLabel("Roll No:");
		rno=new JTextField(20);
		add(lRno);
		add(rno);
		
		JLabel lSname=new JLabel("Name:");
		sname=new JTextField(20);
		add(lSname);
		add(sname);
			
		
		JLabel lper=new JLabel("Percentage:");
		per=new JTextField(20);
		add(lper);
		add(per);

		JLabel lgen=new JLabel("Gender:");
		gen=new JTextField(20);
		add(lgen);
		add(gen);
		
		JLabel lclass=new JLabel("Class:");
		clas=new JTextField(20);
		add(lclass);
		add(clas);
		text=new JLabel("");
		

		btn=new JButton("Submit");
		add(btn);
		add(text);
		btn.addActionListener(this);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			text.setText("Submit....");
		}
	}
	public static void main(String a[])
	{
		new practical6();
	}
}
