import java.awt.*;
import java.lang.*;
public class ch15_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCC frm1 =new CCC();
		frm1.addNewLabel("新增標籤");
	}
}
	class CCC extends Frame{	
		Button btn1;
		Button btn2;
		
		public CCC(){
			this.setTitle("花花花花花花花花花花了發"); //視窗標籤
			this.setSize(550,600); //視窗大小
			
			this.setLayout(null);  //編排模式
			btn1=new Button();		//建構個元件的實體
			btn2=new Button();		
			
			btn1.setLabel("按鈕");		//名稱
			btn1.setBounds(75,100,100,75); //位置
			btn2.setBounds(25,50,50,25);
			
			this.add(btn1);//加入
			this.add(btn2);
			this.setVisible(true);//顯示整體視窗
		}
		public void addNewLabel(String str1){
			Label lab=new Label(str1);
			lab.setBounds(170,150,60,60);
			this.add(lab);
			
			this.setBackground(Color.green);
			btn1.setBackground(Color.red);
		}
	}
