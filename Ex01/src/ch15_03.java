import java.awt.*;
import java.lang.*;
public class ch15_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCC frm1 =new CCC();
		frm1.addNewLabel("�s�W����");
	}
}
	class CCC extends Frame{	
		Button btn1;
		Button btn2;
		
		public CCC(){
			this.setTitle("�����������F�o"); //��������
			this.setSize(550,600); //�����j�p
			
			this.setLayout(null);  //�s�ƼҦ�
			btn1=new Button();		//�غc�Ӥ��󪺹���
			btn2=new Button();		
			
			btn1.setLabel("���s");		//�W��
			btn1.setBounds(75,100,100,75); //��m
			btn2.setBounds(25,50,50,25);
			
			this.add(btn1);//�[�J
			this.add(btn2);
			this.setVisible(true);//��ܾ������
		}
		public void addNewLabel(String str1){
			Label lab=new Label(str1);
			lab.setBounds(170,150,60,60);
			this.add(lab);
			
			this.setBackground(Color.green);
			btn1.setBackground(Color.red);
		}
	}
