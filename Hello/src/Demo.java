

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo extends JFrame {

	public Demo() {
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("����");
		Container c = getContentPane();
		c.setLayout(new GridLayout(7, 3));
		JButton btn = null;
		//c.setBackground(Color.red);
		//LayoutManager layout = new FlowLayout();
		for (int i = 0; i < 20; i++) {
			
			btn =new JButton("��ť");
			int w = 10+i*10;
			int h = 8+i*10;
			System.out.println("w="+w+",h="+h);
			//btn.setSize(w,h );
			btn.setText( "text" + i + i );
			c.add(btn);
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Demo();
	}
}
