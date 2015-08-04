import java.awt.*;
import java.lang.*;
import javax.swing.*;


public class login{

	public static void main(String[] args) {
		DDD jfrmA = new DDD();
		jfrmA.addNewLabel("登入系統");
	}
}
	class DDD extends JFrame {
		private JButton btn1;
		private JButton btn2;
		private JButton btn3;
		
		
		public DDD(){
			Container cp=this.getContentPane();
			cp.setLayout(null);
			
			btn1=new JButton("登入");
			btn2=new JButton("離開");
			btn3=new JButton("申請帳號");
			
			btn1.setBounds(130,100,100,25);
			btn2.setBounds(25,100,100,25);
			btn3.setBounds(80,130,100,25);
			btn1.setFont(new Font("標楷體",Font.BOLD,12));
			
			cp.add(btn1);
			cp.add(btn2);
			cp.add(btn3);
			cp.setBackground(Color.yellow);
			
			this.setTitle("JFrame");
			this.setSize(600,500);
			this.setVisible(true);
			
		}
		public void addNewLabel(String str1){
			JLabel lab=new JLabel(str1);
			lab.setBounds(100,0,100,60);
			lab.setFont(new Font("標楷體",Font.BOLD,16));
			Container cp1=this.getContentPane();
			cp1.add(lab);
			
			cp1.setBackground(Color.CYAN);
		}
	}



