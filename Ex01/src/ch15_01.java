import java.lang.*;
import java.awt.*;
public class ch15_01 extends Frame {
	static ch15_01 frm1=new ch15_01();
	public static void main(String[] args) {
		Frame frm2=new Frame();
		frm1.setTitle("另一個花了發");
		frm1.setSize(200,300);
		frm1.setVisible(true);
	
		frm2.setTitle("花了發");
		frm2.setSize(300,200);
		frm2.setLocation(300,300);
		frm2.setVisible(true);
	}
	public  ch15_01(){
		
	}
}
